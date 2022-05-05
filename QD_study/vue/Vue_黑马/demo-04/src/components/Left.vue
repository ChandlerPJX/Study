<template>
  <div class="left-container">
    <h3>Left 组件 ---- {{count}}</h3>
    <button @click="count++">+1</button>
  </div>
</template>

<script>
export default {
  // 给Left 组件起名字。 如果不起名字，名字默认为组册名字。
  name:'myLeft',


  data(){
    return{
      count: 0
    }
  },


  created() {
    console.log('left  created')
  },
  destroyed() {
    console.log('left destroyed')
  },

  // 组件被创建时 也会执行activated生命周期
  activated() {
    console.log(' left activated')
  },
  deactivated() {
    console.log('left deactivated')
  }


}
</script>

<style lang="less">
.left-container {
  padding: 0 20px 20px;
  background-color: orange;
  min-height: 250px;
  flex: 1;
}
</style>
