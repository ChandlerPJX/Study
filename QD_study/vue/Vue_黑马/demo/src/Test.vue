<template>
<!-- 组件之中只能有一个根元素 -->
  <div class="test-box">
    <h3>hello {{ name }}</h3>

    <button @click="changeName">changeName</button>
  </div>
</template>

<script>
//默认导出,为固定写法.
export default {
  // data数据源
  // 组件中的data不能是对象.
  /*
    data:{
        name: 'chandler'
    }
    */
  data() {
    return {
      name: 'chandler',
    }
  },

  methods: {
    changeName() {
      console.log(this) //this表示当前组件的实例对象.
      this.name = 'PJXs'
    },
  },

// 当前组件的侦听器
  watch:{},
// 当前组件的计算属性
  computed:{},
// 当前组件的过滤器
  filters:{}
}
</script>

<style lang='less'>
// 启用less就把 lang 设置为less  不用lang  默认是css/
.test-box {
  background-color: aqua;
  h3{
      color: blue;
  }
}
</style>