<template>
  <div class="left-container">
    <h3>Left 组件</h3>
    <p> msg is : {{ msg }}</p>
    <p> user is : 姓名：{{ user.name}} ｜｜ 年龄： {{user.age}}</p>
    <button @click="msg ='abc'"> msg</button>

  </div>
</template>

<script>
export default {
  props:['msg','user']
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
