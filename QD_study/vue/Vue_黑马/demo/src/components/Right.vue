<template>
  <div class="right-container">
    <h3>Right 组件</h3>
    <test in="hello"></test>
    <hr>
    <my-count  :init="6"></my-count>
  </div>
</template>

<script>
import test from '@/components/test'

export default {
components:{
  test
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
