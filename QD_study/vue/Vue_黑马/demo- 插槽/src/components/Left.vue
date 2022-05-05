<template>
  <div class="left-container">
    <h3>Left 组件</h3>


<!--    声明一个插槽

        Vue官方规定，每个插槽都要有一个name名称。省略的时候，默认为default
-->
    <slot name="PJXs"></slot>
    <slot name="default"> 默认区域</slot>
  </div>
</template>

<script>
export default {}
</script>

<style lang="less">
.left-container {
  padding: 0 20px 20px;
  background-color: orange;
  min-height: 250px;
  flex: 1;
}
</style>
