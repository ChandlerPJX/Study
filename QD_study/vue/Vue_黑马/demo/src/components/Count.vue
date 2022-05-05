<template>
  <div>
    Count 组件
    <p> ，value of count: {{ count }} </p>
    <button @click="add">+1</button>
    <hr>
    <!-- add 方法只有1行的时候 可以简写-->
    <button @click="count += 1"> +1</button>
    <button @click="show"> show info</button>
  </div>
</template>

<script>
export default {

  // props中的数据是只读的。
  // props: ['init'],

  props: {
    //自定义属性A  ：{ }
    init: {
      default: 0, // 默认值

      type: Number,//定义为必须为数字属性]

      required: true // 必选项校验
    }
  },

  data() {
    return {
      count: this.init
    }
  },

  methods: {
    add() {
      this.count++
    },
    show() {
      console.log(this)
    }
  }
}
</script>

<style lang="less">

</style>