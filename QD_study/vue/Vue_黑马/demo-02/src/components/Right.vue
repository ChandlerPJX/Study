<template>
  <div class="right-container">
    <h3>Right 组件 ---- </h3>
    <p> count is :  {{count}}</p>
    <button @click="add"> +1 </button>
  </div>
</template>

<script>
export default {

  data(){
    return{
      count: 0
    }
  },
  methods:{
    add(){
      this.count++

      // 把自增的数据传给父组件
      this.$emit('numCount',this.count)
    }
  }

}
</script>

<style lang="less">
.right-container {
  padding: 0 20px 20px;
  background-color: lightskyblue;
  min-height: 250px;
  flex: 1;
}
</style>
