<template>
  <div class="app-container">
    <h1>App 根组件</h1>
    <hr/>

    <button @click="comName='Left'"> show Left</button>
    <button @click="comName='Right'"> show Right</button>

    <div class="box">
      <!-- 渲染 Left 组件和 Right 组件 -->
      <!--    component 标签是vue的内置占位符， is 是要渲染的名字.-->

<!--keep-alive 可以把内部组件进行缓存。
    include 指定哪些组件被缓存。多个的时候中间使用, 分割.
    exclude 指定哪些组件不被缓存.
    PS:两者二选一。
-->
      <keep-alive include="myLeft">
        <component :is="comName"></component>
      </keep-alive>


    </div>
  </div>
</template>

<script>
import Left from "@/components/Left";
import Right from "@/components/Right";

export default {
  data() {
    return {
      comName: ''
    }
  },

  components: {
    Left,
    Right

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
