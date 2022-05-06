<template>
  <div class="home-container">
    <h3>Home 组件</h3>
    <button @click="jumpTo"> jump to movie</button>
    <button @click="gotoLk2">通过 replace 跳转到“雷神”页面</button>
  </div>
</template>

<script>
export default {
  name: 'Home',
  methods: {
    jumpTo() {
      // 通过编程式导航 API，导航跳转到指定的页面
      this.$router.push('/movie/1')
    },
    gotoLk2() {
      // 替换当前页面.
      this.$router.replace('/movie/2')
    }
  }
}
</script>

<style lang="less" scoped>
.home-container {
  min-height: 200px;
  background-color: pink;
  padding: 15px;
}
</style>
