<template>
  <div class="app-container">
    <h1 v-color="color">App 根组件</h1>
    <button @click="color='green'">change color</button>
    <hr/>

    <Article>

      <template #header>
        <h4> this is header</h4>
      </template>
      <template #content>
        <h3> this is content</h3>
      </template>
      <template #author>
        <h2> this is author</h2>
      </template>

    </Article>
    <hr/>

    <div class="box" style="display:none">
      <!-- 渲染 Left 组件和 Right 组件 -->
      <Left>
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
  },

  data() {
    return {
      color: 'red'

    }
  },
  directives: {
    // 定义名为color的指令，配置一个对象。
    /*
    color: {
      // 当指令第一次被绑定到元素上，会立即触发bind(只会调用一次。)
      // el 表示绑定的DOM对象.
      bind(el, binding) {
        el.style.color = binding.value
      } ,
      //update 函数会在每次 DOM 更新时被调用
      update(el, binding) {
        el.style.color = binding.value
      }
  }
  */
    //简写,当bind与update逻辑相同的时候.
    color(el, binding) {
      el.style.color = binding.value
    }
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
