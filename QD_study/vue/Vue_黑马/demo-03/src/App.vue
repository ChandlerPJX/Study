<template>
  <div class="app-container">
    <h1 ref="myh1">App 根组件 </h1>
    <button @click="showInfo"> 打印this</button>
    <button @click="restLeft"> Reset Left</button>
    <hr/>

    <input type="text" v-if="viewInput" @blur="showButton" ref="inputRef">
    <button v-else @click="showInput">展示输入框</button>

    <br/>

    <div class="box">
      <Left ref="comLeft"></Left>
    </div>
  </div>
</template>


<script>

import Left from "@/components/Left";

export default {
  data() {
    return {
      viewInput: false
    }
  },

  methods: {
    showInfo() {
      console.log(this)
      this.$refs.myh1.style.color = 'red'
    },

    restLeft() {
      this.$refs.comLeft.resetCount()
    },

    showInput() {
      this.viewInput = true

      // 延迟执行。
      this.$nextTick(() => {
        this.$refs.inputRef.focus()
      })
    },

    showButton() {
      this.viewInput = false
    }

  },

  components: {
    Left
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
