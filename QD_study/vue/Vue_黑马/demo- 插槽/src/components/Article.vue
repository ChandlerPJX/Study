<template>
  <div class="article-container">
    <!--  标题  -->

    <div class="header-box">
      <slot name="header"></slot>
    </div>

    <!--  内容  -->
    <div class="content-box">
      <slot name="content"></slot>
    </div>
    <!--  作者  -->
    <div class="writer-box">

      <slot name="author"></slot>
    </div>


  </div>
</template>

<script>
export default {
  name: "Article"
}
</script>

<style lang="less" scoped>


.article-container {

  > div {
    min-height: 150px;

  }

  .header-box {
    background-color: aqua;
  }

  .content-box {
    background-color: purple;
  }

  .writer-box {
    background-color: pink;
  }
}

</style>