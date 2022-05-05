<template>
  <div class="app-container">
    <h1>App </h1>
    <p>{{ fullState }}</p>

    <Header title="购物车案例"></Header>
    <!-- 循环渲染每一个商品的信息 -->
    <Goods v-for="item in list"
           :id="item.id"
           :key="item.id"
           :title="item.goods_name"
           :pic="item.goods_img"
           :price="item.goods_price"
           :count="item.goods_count"
           :state="item.goods_state"
           @state-change="getNewState"
    ></Goods>
    <Footer :isfull="fullState" :amount="amt" :all="total" @full-change="getFullState"></Footer>

  </div>
</template>

<script>
// 导入 axios 请求库
// 导入需要的组件
import Header from "@/components/Header/Header";
import axios from 'axios'
import Goods from "@/components/Goods/Goods";
import Footer from "@/components/Footer/Footer";
import bus from '@/components/eventBus.js'

export default {


  data() {
    return {
      // 用来存储购物车的列表数据，默认为空数组
      list: []
    }
  },

  components: {
    Header,
    Goods,
    Footer,
  },

  created() {
    // 调用请求数据的方法
    this.initCartList()
    console.log(this)

    bus.$on('share', val => {
      this.list.some(item => {
        if (item.id === val.id) {
          item.goods_count = val.value
          return true
        }
      })
    })
  },

  methods: {
    // 封装请求列表数据的方法
    async initCartList() {
      // 调用 axios 的 get 方法，请求列表数据
      const {data: res} = await axios.get('https://www.escook.cn/api/cart')
      // console.log(res)
      // 只要请求回来的数据，在页面渲染期间要用到，则必须转存到 data 中
      if (res.status === 200) {
        this.list = res.list
        console.log(this.list)
      }
    },

    // 接收子组件传递过来的数据
    // 形参中的e，就是子组件通过$emit() 传递到父组件中的数据。e 的格式为 { id, value }
    getNewState(e) {
      // console.log(e)
      this.list.some(item => {
        // item 代表当前的list素组。（父组件的数据。）
        if (item.id === e.id) {
          item.goods_state = e.value
          // 终止后续的循环
          return true
        }
      })
    },
    // 接收 Footer 子组件传递过来的全选按钮的状态
    getFullState(val) {
      this.list.forEach(item => (item.goods_state = val))
    },

  },

  computed: {
    // 动态计算全选的状态
    fullState() {
      const res = this.list.every(item => item.goods_state)
      return res
    },
    // 已勾选商品的总价格
    amt() {
      // 1. 先 filter 过滤
      // 2. 再 reduce 累加
      return this.list
          .filter(item => item.goods_state)
          .reduce((total, item) => (total += item.goods_price * item.goods_count), 0)
    },
    // 已勾选商品的总数量
    total() {
      return this.list.filter(item => item.goods_state).reduce((t, item) => (t += item.goods_count), 0)
    }


  }


}
</script>

<style lang="less" scoped>
.app-container {
  padding-top: 45px;
  padding-bottom: 50px;
}
</style>
