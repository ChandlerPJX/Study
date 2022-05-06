import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')

Vue.directive('color',{
    // bind(el, binding) {
    //   el.style.color = binding.value
    // } ,
    // //update 函数会在每次 DOM 更新时被调用
    // update(el, binding) {
    //   el.style.color = binding.value
    // }，
    //
    // 简写,当bind与update逻辑相同的时候.
    color(el, binding) {
        el.style.color = binding.value
    }
})