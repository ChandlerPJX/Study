<template>
  <div class="left-container">
    <h3>Left 组件</h3>
    <hr>
    <myCount :init="9"></myCount>

  </div>
</template>

<script>
export default {

}
</script>

<style lang="less" scoped>
.left-container {
  padding: 0 20px 20px;
  background-color: orange;
  min-height: 250px;
  flex: 1;
}

h3{
  color: red;
}

//如果给当前组件的 style 节点添加了 scoped 属性，则当前组件的样式对其子组件是不生效的。如果想让某些样 式对子组件生效，可以使用 /deep/ 深度选择器。

/deep/ h5{
  color: aqua;

}

</style>
