

// 导入了Vue
import Vue from 'vue'

// 导入了app.vue根组件. 将来要把它渲染到HTML中.
import App from './App.vue'

import Count from '@/components/Count.vue'

import test from '@/components/test'

Vue.config.productionTip = false

// Vue.component('test',test)
Vue.component('myCount',Count)
//创建vue的实例对象
new Vue({
  // el:'#app'   // 手动指定要渲染的地方.
  // 把render函数制定的组件渲染到HTML中
  render: h => h(App),
}).$mount('#app') // 指定到#app 区域下. 与用el的作用一样 两者2选一
