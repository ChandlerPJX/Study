<template>
  <div class="movie-container">
    <h3>Movie 组件 --- {{ this.$route.params.id }} ----- {{ id }}</h3>
    <button @click="showThis">打印this</button>
    <button @click="goBack">回退</button>
  </div>
</template>

<script>
export default {

  name: 'Movie',

  props: [
    'id'
  ],
  methods: {
    showThis() {
      console.log(this)
    },

    goBack() {
      //  -1 回退一个页面  1前进一个页面
      this.$router.go(-1)
    }
  }

}
</script>

<style lang="less" scoped>
.movie-container {
  min-height: 200px;
  background-color: lightsalmon;
  padding: 15px;
}
</style>
