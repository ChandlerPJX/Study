<template>
  <div class="app-container">
    <h1>App 根组件 --- {{ countFromSon }}</h1>
    <p>  userinfo的值是： {{ userinfo }}</p>
    <hr />

    <div class="box">
      <!-- 渲染 Left 组件和 Right 组件 -->
      <Left :msg="message" :user="userinfo"></Left>
<!--      <Right @numchange="getNewCount">getNewCount</Right>-->
    </div>
  </div>
</template>


<script>
import Left from "@/components/Left.vue";

// <Son @numCount="getNewCount"> </Son>
export default {
  data() {
    return {
      message: 'Hello 123123',
      userinfo: {
        name: 'Chandler',
        age: 18
      },
      countFromSon: 0
    }
  },


  methods: {
    getNewCount(val) {
      console.log('numCount 触发了', val)
    }
  },
  components: {
    Left,
    // Right,
  }


}
</script>

<style lang="less">
.app-container {
  padding: 1px 20px 20px;
  background-color: #efefef;
}

.box {
  display: flex;
}
</style>
