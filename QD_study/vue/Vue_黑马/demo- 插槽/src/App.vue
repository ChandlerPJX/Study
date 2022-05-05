<template>
  <div class="app-container">
    <h1>App 根组件</h1>
    <hr/>

    <Article>

      <template #header>
        <h4> this is header</h4>
      </template> <template #content>
        <h3> this is content</h3>
      </template>
      <template #author>
        <h2> this is author</h2>
      </template>

    </Article>
    <hr/>

    <div class="box" style="display:none">
      <!-- 渲染 Left 组件和 Right 组件 -->
      <Left  >
<!--        <p> hello Chandler </p>-->

        <!-- 如果要把内容填充到指定位置中， 要用template 进行包裹。
          然后使用 v-slot：名称. 简写为 #
          其中template为虚拟标签，不会真实的被渲染到标签中。
           -->
        <template v-slot:PJXs>
          <p> hello PJXs </p>
        </template>

      </Left>


    </div>
  </div>
</template>

<script>
import Left from "./components/Left";
import Article from "@/components/Article";

export default {

  components: {
    Left,
    Article
  }

}
</script>

<style lang="less">
.app-container {
  padding: 1px 20px 20px;
  background-color: #efefef;
}

.box {
  display: flex;
}
</style>
