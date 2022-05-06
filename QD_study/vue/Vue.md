# Vue学习：vue的指令、组建、路由、vuex、vue组建库

# 认识Vue

     1. 使用vue 要创建一个vue实例对象，且要传入配置对象。
     2. root 容器里的代码依然符合html规范，只是混入了vue语法。
     3. root容器里的代码被称为【vue模版】
     4. 容器和vue实例对象是一一对应的.

# 模版语法

    用于解析标签内容. 写法:{{xxx}} , xxx为js表达式,由data中的属性读到.
    用于解析标签(标签属性,标签内容...) 如 v-bind:href=“xxxx”, xxx为js表达式,由data的属性读到.
        指令语法有很多. 
        格式: v-xxxx

# 数据绑定

    Vue 之中两种绑定：
    1· 单向绑定（v-bind） ，数据从data流向页面
    v-bind 可以简写为 ：
    2· 双向绑定（v-model），数据双向流。 注意：双向绑定一般用于表单类元素（input、select、...）
    v-model:value 可以简写为 v-model 其默认绑定value

# el与data的两种写法

# MVVM

    M 模型：对应data中的数据   Plan JS Objects(Data Bindings)
    V 视图： 模版               DOM (DOMListeners)
    VM 视图模型 ： Vue实例对象   Vue
    
    
# 指令：

    1· 内容渲染指令
        v-text  会覆盖元素原有内容
        {{}}    插值表达式 (只能用在内容节点，不能用在属性节点)
        v-html  渲染带有html标签的字符串

    2· 属性绑定指令
        单向绑定（v-bind） :数据从data流向页面
                           v-bind 可以简写为 ：
        双向绑定（v-model）:数据双向流。 注意：双向绑定一般用于表单类元素（input、select、...）
                          v-model:value 可以简写为 v-model 其默认绑定value

    3· 事件绑定指令
        v-on: 可以简写为@(不要写成@：) , 如： v-on:click -> @click / v-on:input -> @input
        $event   :vue 提供了内置变量 $event 他是原生的DOM的事件对象
        事件修饰符：
                .prevent 阻止默认行为
                .stop   阻止事件冒泡
                .capture    以捕获模式触发当前的事件处理函数
                .once   绑定的事件只触发一次
                .self   只有在event.target是当前元素自身时，触发事件处理函数

    4· 双向绑定指令
        双向绑定（v-model）:数据双向流。 注意：双向绑定一般用于表单类元素（input、select、...）
        v-model:value 可以简写为 v-model 其默认绑定value
   
 	5· 条件渲染指令

              v-show: 动态为元素添加或移除 display:none 样式 . 频繁切换元素显示状态,用show
              v-if:   动态删除或创建元素.  某些元素不需要被展示,后期也不太需要使用,用if

    6· 列表渲染指令
            v-for : 基于一个属嘴来循环渲染一个列表结构. v-for 指令需要使用item in items 形式的特殊语法.
            v-for还支持可选的第二个参数(即当前项的索引),语法格式为 (item,index) in items 如: (item,index) in list
            V-for 简写为:for

            PS: 官方建议,如果使用了v-for指令那么一定要绑定:key属性. 且尽量把id作为key的值. (:key='item.id'). <-- 既能提升性能,又防止列表状态紊乱.
                key的值类型只能是字符串或者数字类型.
                key的值是不能重复的. (重复会报错: Duplicate keys detected).

# 过滤器:

    过滤器的基本使用.  用在 查值表达式{{}} 与 v-bind之中

    定义在filter下  , 过滤器本质上是函数 

    注意：过滤器函数形参中的 val，永远都是“管道符(|)”前面的那个值 

    /* 
    全局过滤器 - 独立与每个vm实力之外.
    Vue.filter() <-- 接受2个参数,一个是全局过滤器的名字,一个是全局过滤器的处理函数.

    */   


# 侦听器：

    所有的侦听器，都应该被定义到 watch 节点下
    侦听器本质上是一个函数，要监视哪个数据的变化，就把数据名作为方法名即可
    新值在前，旧值在后

    侦听器的两种格式：
    1· 方法格式的侦听器(比较简单)
        · 缺点：无法在刚进入页面的时候自动触发。
        · 如果侦听的是一个对象,如果对象内容改变了,不会触发侦听器.
    2· 对象格式的侦听器(需要自动触发式在用)
        · 可以通过immediate 选项，自动触发。
        · 可以通过deep选项,让侦听器深度侦听对象中每个属性的变化.



# 计算属性

    特点：
    1. 定义的时候，要被定义为“方法”
    2. 在使用计算属性的时候，当普通的属性使用即可

    好处：
    1. 实现了代码的复用
    2. 只要计算属性中依赖的数据源变化了，则计算属性会自动重新求值！

axios

    axios 是一个专注于网络请求的库！

使用:


       解构赋值的时候，使用 : 进行重命名
       1. 调用 axios 之后，使用 async/await 进行简化
       2. 使用解构赋值，从 axios 封装的大对象中，把 data 属性解构出来
       3. 把解构出来的 data 属性，使用 冒号 进行重命名，一般都重命名为 { data: res }
       4. PS:调用 axios 方法得到的返回值是 Promise 对象

1. 发起 GET 请求：

    ```js
    axios({
        // 请求方式
        method: 'GET',
        // 请求的地址
        url: 'http://www.xxx.com',
        // URL 中的查询参数
        params: {
        id: 1
        }
    }).then(function (result) {
        console.log(result)
    })
    ```

2. 发起 POST 请求：
    ```js
    document.querySelector('#btnPost').addEventListener('click', async function () {
        // 如果调用某个方法的返回值是 Promise 实例，则前面可以添加 await！
        // await 只能用在被 async “修饰”的方法中
        const { data: res } = await axios({
        method: 'POST', 
        url: 'http://www.xxx.com',
        data: {
            name: 'zs',
            age: 20
        }
        })
    
        console.log(res)
    })
    ```


## vue-cil  
### 中文官网:   https://cli.vuejs.org/zh/
        简化了webpack创建工程化的vue项目.

        使用vue-cli 快速生成工程化的vue项目
        vue create  项目名

 
### vue 项目中 src 目录的构成：

   ```
   assets 文件夹：存放项目中用到的静态资源文件，例如：css 样式表、图片资源
   components 文件夹：程序员封装的、可复用的组件，都要放到 components 目录下
   main.js 是项目的入口文件。整个项目的运行，要先执行 main.js
   App.vue 是项目的根组件。
   ```


### vue 项目的运行流程
	
	通过main.js把App.vue 渲染到index.html中.
	



## Vue组件

## 组件化的开发
	
	vue 是一个支持组件化开发的前端框架。
	vue 中规定:组件的后缀名是 .vue。之前接触到的 App.vue 文件本质上就是一个 vue 的组件。
	

## 组建的三个组成部分
	

	template -> 组件的模板结构
	script -> 组件的 JavaScript 行为
	style -> 组件的样式
	其中，每个组件中必须包含 template 模板结构，而 script 行为和 style 样式是可选的组成部分。


## template
	vue 规定:每个组件对应的模板结构，需要定义到 <template> 节点中。
	注意:
	template 是 vue 提供的容器标签，只起到包裹性质的作用，它不会被渲染为真正的 DOM 元素 template 中只能包含唯一的根节点



## script

	vue 规定:开发者可以在 <script> 节点中封装组件的 JavaScript 业务逻辑。 <script > 节点的基本结构如下:


```js
<script>
//默认导出,为固定写法.
export default {
  // data数据源
  // 组件中的data不能是对象.
  /*
    data:{
        name: 'chandler'
    }
    */
  data() {
    return {
	name:'xxx'
     }
  },

  methods: {
    changeName() {
     
    },
  },

// 当前组件的侦听器
  watch:{},
// 当前组件的计算属性
  computed:{},
// 当前组件的过滤器
  filters:{}
}
</script>

```

## style

	vue 规定:组件内的 <style> 节点是可选的，开发者可以在 <style> 节点中编写样式美化当前组件的 UI 结构。 <script > 节点的基本结构如下

```less
<style lang='less'>
// 启用less就把 lang 设置为less  不用lang  默认是css/
.test-box {
  background-color: aqua;
  h3{
      color: blue;
  }
}
</style>

```

## 使用组件的三个步骤
	1·使用 import 语法导入需要的组件
	2·使用 components 节点注册组件(通过 components 注册的是私有子组件)
	3·以标签形式使用刚才注册的组件
	
	PS:注册全局组件 -->在 vue 项目的 main.js 入口文件中，通过 Vue.component() 方法，可以注册全局组件。

(在main.js中)如:
```js
	import Count from '@/components/Count.vue'

	Vue.config.productionTip = false

	Vue.component('myCount','Count')
```


## 组件的 props
### 1.	props 是组件的自定义属性，在封装通用组件的时候，合理地使用 props 可以极大的提高组件的复用性!

```js
  props:['init'],

  data() {
    return {
      count: this.init
    }
  },
		

```
### 2.	props 是只读的
	vue 规定:组件中封装的自定义属性是只读的，程序员不能直接修改 props 的值。否则会直接报错:
	要想修改 props 的值，可以把 props 的值转存到 data 中，因为 data 中的数据都是可读可写的!


### 3.	props 的 default 默认值
	需要默认值的时候要改为对象,可以通过 default 来定义属性的默认值。
```js
 props:{
    //自定义属性A  ：{ }
    init:{
      default: 0  // 默认值
    }
  },
```

### 4.	 props 的 type 值类型
	在声明自定义属性时，可以通过 type 来定义属性的值类型。
```js
 props:{
    //自定义属性A  ：{ }
    init:{
      default: 0 , // 默认值
      
      type:Number //定义为必须为数字属性
    }
  },
```




### 5.props 的 required 必填项
	在声明自定义属性时，可以通过 required 选项，将属性设置为必填项，强制用户必须传递属性的值。
```js
props: {
    //自定义属性A  ：{ }
    init: {
      default: 0, // 默认值

      type: Number,//定义为必须为数字属性]
      
      required: true // 必选项校验
    }
  },
```


### 6. 组件之间的样式冲突问题
	默认情况下，写在 .vue 组件中的样式会全局生效，因此很容易造成多个组件之间的样式冲突问题。

	导致组件之间样式冲突的根本原因是:
	1. 单页面应用程序中，所有组件的 DOM 结构，都是基于唯一的 index.html 页面进行呈现的 
	2. 每个组件中的样式，都会影响整个 index.html 页面中的 DOM 元素


####  解决组件之间的样式冲突:
```less
1. 使用style 节点的 scoped 属性, 为了提高开发效率和开发体验，vue 为 style 节点提供了 scoped 属性，从而防止组件之间的样式冲突问题.
<style lang="less" scoped>
```
```less
PS: 如果给当前组件的 style 节点添加了 scoped 属性，则当前组件的样式对其子组件是不生效的。如果想让某些样 式对子组件生效，可以使用 /deep/ 深度选择器。
 

/deep/ h5{
  color: aqua;

}

```
<-- 当使用第三方组件库的时候,如果要修改第三方的样式,会使用到/deep/


## 组件的生命周期

### 官方图解: https://cn.vuejs.org/v2/guide/instance.html#





## 组件之间的数据共享
### 组件之间的关系

	在项目开发中，组件之间的最常见的关系分为如下两种: 
	1 父子关系:
		父子组件之间的数据共享又分为:
		 1. 父 -> 子共享数据.  父组件向子组件共享数据需要使用自定义属性。
 
		 2. 子 -> 父共享数据.  子组件向父组件共享数据使用自定义事件。
	2 兄弟关系:
		 1. 在 vue2.x 中，兄弟组件之间数据共享的方案是 EventBus。

### EventBus 的使用步骤

	1. 创建 eventBus.js 模块，并向外共享一个 Vue 的实例对象
	2.  在数据发送方，调用 bus.$emit('事件名称', 要发送的数据) 方法触发自定义事件 
	3. 在数据接收方，调用 bus.$on('事件名称', 事件处理函数) 方法注册一个自定义事件


## ref

### 1. 什么是 ref 引用
	ref 用来辅助开发者在不依赖于 jQuery 的情况下，获取 DOM 元素或组件的引用。
	每个 vue 的组件实例上，都包含一个 $refs 对象，里面存储着对应的 DOM 元素或组件的引用。默认情况下， 组件的 $refs 指向一个空对象。 

### 2. 使用 ref 引用 DOM 元素
	给元素或组件添加 ref="xxx" 的引用名称
```html
   <h1 ref="myh1">App 根组件 </h1>
```

	
### 3. 使用 ref 引用组件实例
	通过 this.$refs.xxx 获取元素或组件的实例
```js
 this.$refs.myh1.style.color = 'red'
```


### 4. 控制文本框和按钮的按需切换
	通过布尔值 inputVisible 来控制组件中的文本框与按钮的按需切换。


### 5. 让文本框自动获得焦点
	当文本框展示出来之后，如果希望它立即获得焦点，则可以为其添加 ref 引用，并调用原生 DOM 对象的 .focus() 方法即可。

### 6. this.$nextTick(cb) 方法
	组件的 $nextTick(cb) 方法，会把 cb 回调推迟到下一个 DOM 更新周期之后执行。
	'通俗的理解是:等组件的 DOM 更新完成之后，再执行 cb 回调函数。从而能保证 cb 回调函数可以操作到最新的 DOM 元素。'


# 案例练习;购物车案例
	进行了案例模仿练习.

## 动态组件

### 1. 什么是动态组件
	动态组件指的是动态切换组件的显示与隐藏。


### 2. 如何实现动态组件渲染
	vue 提供了一个内置的 <component> 组件，专门用来实现动态组件的渲染。
```js
 <component :is="comName"></component>
```

### 3. 使用 keep-alive 保持状态
	默认情况下，切换动态组件时无法保持组件的状态。此时可以使用 vue 内置的 <keep-alive> 组件保持动态组 件的状态。
```js
      <keep-alive >
        <component :is="comName"></component>
      </keep-alive>
```

### 4. keep-alive 对应的生命周期函数
	当组件被缓存时，会自动触发组件的 deactivated 生命周期函数。 当组件被激活时，会自动触发组件的 activated 生命周期函数。
```js
  // 组件被创建时 也会执行activated生命周期
  activated() {
    console.log(' left activated')
  },
  deactivated() {
    console.log('left deactivated')
  }
```

###  keep-alive 的 include 属性
	include 属性用来指定:只有名称匹配的组件会被缓存。多个组件名之间使用英文的逗号分隔
```js
   <keep-alive include="myLeft">
        <component :is="comName"></component>
      </keep-alive>
```

## 插槽
### 1. 什么是插槽
	插槽(Slot)是 vue 为组件的封装者提供的能力。允许开发者在封装组件时，把不确定的、希望由用户指定的 部分定义为插槽。
### 2. 体验插槽的基础用法
	在封装组件时，可以通过 <slot> 元素定义插槽，从而为用户预留内容占位符。
	1. 没有预留插槽的内容会被丢弃
	   如果在封装组件时没有预留任何 <slot> 插槽，则用户提供的任何自定义内容都会被丢弃。
	2. 封装组件时，可以为预留的 <slot> 插槽提供后备内容(默认内容)。如果组件的使用者没有为插槽提供任何 内容，则后备内容会生效。
### 3. 具名插槽
	如果在封装组件时需要预留多个插槽节点，则需要为每个 <slot> 插槽指定具体的 name 名称。这种带有具体 名称的插槽叫做“具名插槽”

```js
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

``` 

	3.1 为具名插槽提供内容
	    在向具名插槽提供内容的时候，我们可以在一个 <template> 元素上使用 v-slot 指令，并以 v-slot 的参数的 形式提供其名称。
```js
 <template #header>
        <h4> this is header</h4>
      </template> <template #content>
        <h3> this is content</h3>
      </template>
      <template #author>
        <h2> this is author</h2>
      </template>
```
	3.2 具名插槽的简写形式
	v-slot也有缩写，即 v-slot: 替换为字符 #。例如 v-slot:header 可以被重写为 #header


## 自定义指令
	vue 官方提供了 v-text、v-for、v-model、v-if 等常用的指令。除此之外 vue 还允许开发者自定义指令。

	vue 中的自定义指令分为两类，分别是:
	 私有自定义指令
	 全局自定义指令
### 私有自定义指令(定义在组件内部)
	1. 在每个 vue 组件中，可以在 directives 节点下声明私有自定义指令。
```js
 directives:{
    // 定义名为color的指令，配置一个对象。
    // el 表示绑定的DOM对象.
    color:{
        // 当指令第一次被绑定到元素上，会立即触发bind(只会调用一次。)      
		bind(el){
        el.style.color='red'
      }
    }
  }
```
	2. 在使用自定义指令时，需要加上 v- 前缀。
```html
 <h1 v-color>App 根组件</h1>
```
	3. 为自定义指令动态绑定参数值
	   在 template 结构中使用自定义指令时，可以通过等号(=)的方式，为当前指令动态绑定参数值
```html
<h1 v-color="color">App 根组件</h1>
```
```js
data(){
    return{
      color:'red'
    }
  },
```

	4. 通过 binding 获取指令的参数值

```js
  color:{
      // el 表示绑定的DOM对象.
      bind(el,binding){
        el.style.color=binding.value
      }
    }
```
	5. update 函数
	由于	bind 函数只调用 1 次:当指令第一次绑定到元素时调用，当 DOM 更新时 bind 函数不会被触发.
	update 函数会在每次 DOM 更新时被调用。

```js
color: {
      bind(el, binding) {
        el.style.color = binding.value
      },

      update(el, binding) {
        el.style.color = binding.value
      }
    }
```

上述(update与bind)可以简写为:
```js
 //简写 .当bind与update逻辑相同的时候.
    color(el, binding) {
      el.style.color = binding.value
    }
```

### 全局自定义(定义在Main.js 中)

在main下面写.

	全局共享的自定义指令需要通过“Vue.directive()”进行声明
 
```js
Vue.directive('color',{

     bind(el, binding) {
       el.style.color = binding.value
     },

     update(el, binding) {
       el.style.color = binding.value
     },
    
---------------------
    // 简写,当bind与update逻辑相同的时候.
    color(el, binding) {
        el.style.color = binding.value
    }
})
```


## 前端路由(router)
	其实就是Hash 地址与组件之间的对应关系。
 

### 1. 前端路由的工作方式
	1. 用户点击了页面上的路由链接
	2. 导致了 URL 地址栏中的 Hash 值发生了变化
	3. 前端路由监听了到 Hash 地址的变化
	4. 前端路由把当前 Hash 地址对应的组件渲染都浏览器中

### 2. 实现简单的路由
	1. 通过 <component> 标签，结合 comName 动态渲染组件。
```html
   <component :is="comName"></component>
```
	2. 在 App.vue 组件中，为 <a> 链接添加对应的 hash 值.其中#/home 其实就是哈希值.
```html
<a href="#/home">首页</a>
<a href="#/movie">电影</a>
```
 
	3. 在 created 生命周期函数中，监听浏览器地址栏中 hash 地址的变化，动态切换要展示的组件的名称.
```js
created() {
// 只要当前的 App 组件一被创建，就立即监听 window 对象的 onhashchange 事件
    window.onhashchange = () => {
      console.log('监听到了 hash 地址的变化', location.hash)
      switch (location.hash) {
        case '#/home':
          this.comName = 'Home'
          break
        case '#/movie':
          this.comName = 'Movie'
          break
        case '#/about':
          this.comName = 'About'
          break
      }
    }
  }
```

### 3. vue-router 的基本用法
vue-router 的官方文档地址:
https://router.vuejs.org/zh/

		vue-router 是 vue.js 官方给出的路由解决方案。它只能结合 vue 项目进行使用，能够轻松的管理 SPA 项目 中组件的切换。

### 使用router
	
	1. 安装 vue-router 包
		安装 router  npm i vue-router@3.5.2 -S

	2. 创建路由模块
		在 src 源代码目录下，新建 router/index.js 路由模块

	3. 导入并挂载路由模块
		在 src/main.js 入口文件中，导入并挂载路由模块。


```js

import Vue from 'vue'
import VueRouter from 'vue-router'

// 把 VueRouter 安装为 Vue 项目的插件
// Vue.use() 函数的作用，就是来安装插件的
Vue.use(VueRouter)

// 创建路由的实例对象
const router = new VueRouter({
    // routes 是一个数组，作用：定义 “hash 地址” 与 “组件” 之间的对应关系
    routes: []
})

export default router

```
 	 4. 声明路由链接和占位符	
```html
 <!-- 只要在项目中安装和配置了 vue-router，就可以使用 router-view 这个组件了 
	 它的作用很单纯：占位符 . 给要展示的组件占位。-->
    <router-view></router-view>
```
	5. 声明路由的匹配规则
		路由重定向 redirect
		开启路由传参 props
		嵌套路由 children . 通过 children 属性声明子路由规则
```html
<!--    子级连接 -->
    <router-link to="/about/tab1">tab1</router-link>
    <router-link to="/about/tab2">tab2</router-link>
    <hr/>
<!--   子级占位符  -->
    <router-view></router-view>
```


		
```js
// 创建路由的实例对象
const router = new VueRouter({
    // routes 是一个数组，作用：定义 “hash 地址” 与 “组件” 之间的对应关系
    routes: [
        // 重定向的路由规则 redirect
        {
            path: '/',
            redirect: '/home'
        },
        // 路由规则
        {
            path: '/home',
            component: Home         
        },

        // 需求：在 Movie 组件中，希望根据 id 的值，展示对应电影的详情信息
        // 可以为路由规则开启 props 传参，从而方便的拿到动态参数的值
        {
            path: '/movie/:id',
            component: Movie,
	 // 开启路由传参
            props:true
        },

        {
            path: '/about',
            component: About,
            redirect:'about/tab1',
            children:[
                // 子路由规则
                // 默认子路由：如果 children 数组中，某个路由规则的 path 值为空字符串，则这条路由规则，叫做“默认子路由”
                // { path: '', component: Tab1 }
                { path: 'tab1', component: Tab1 },
                { path: 'tab2', component: Tab2 }
            ]
        },

    ]
})
```


### 动态路由
	1. 概念:  动态路由指的是:把 Hash 地址中可变的部分定义为参数项，从而提高路由规则的复用性。 在 vue-router 中使用英文的冒号(:)来定义路由的参数项。

```js
 { path: '/movie/1', component: Movie}
 { path: '/movie/2', component: Movie}
 { path: '/movie/3', component: Movie}	

// 上面3个可以合写为

 { path: '/movie/:id', component: Movie}

```

	2. $route.params 参数对象
	 在动态路由渲染出来的组件中，可以使用 this.$route.params 对象访问到动态匹配的参数值。
```html
 <h3> Movie 组件 --- {{ this.$route.params.id }} </h3>
```

	3. 使用 props 接收路由参数
	为了简化路由参数的获取形式，vue-router 允许在路由规则中开启 props 传参。
```html
<h3> Movie 组件 --- {{ id }} </h3>

<script>
export default {

  props: [
    'id'
  ],

}
</script>
```

### 声明式导航 & 编程式导航
	 4.1. 在浏览器中，点击链接实现导航的方式，叫做声明式导航。例如:
	普通网页中点击 <a> 链接、vue 项目中点击 <router-link> 都属于声明式导航

		·vue-router 中的编程式导航 API:
			1. this.$router.push('hash 地址') 跳转到指定 hash 地址，并增加一条历史记录 
			2. this.$router.replace('hash 地址') 跳转到指定的hash地址，并替换掉当前的历史记录
 			3. this.$router.go(数值 n) 实现导航历史前进、后退
				PS:在实际开发中，一般只会前进和后退一层页面。因此 vue-router 提供了如下两个便捷方法:
				· $router.back() 在历史记录中，后退到上一个页面 
				· $router.forward()  在历史记录中，前进到下一个页面
 



	 4.2. 在浏览器中，调用 API 方法实现导航的方式，叫做编程式导航。
	例如:  普通网页中调用 location.href 跳转到新页面的方式，属于编程式导航
 

### 导航守卫

	导航守卫可以控制路由的访问权限。


1. 全局前置守卫与守卫方法的 3 个形参

```js
// 为 router 实例对象，声明全局前置导航守卫
// 只要发生了路由的跳转，必然会触发 beforeEach 指定的 function 回调函数
/*
router.beforeEach(function (to,from,next){})
 to 表示将要访问的路由的信息对象
 from 表示将要离开的路由的信息对象
 next() 函数表示放行的意思
 */
router.beforeEach(function (to,from,next){
    next()
})

```
2. next 函数的 3 种调用方式

		当前用户拥有后台主页的访问权限，直接放行:next() 
		当前用户没有后台主页的访问权限，强制其跳转到登录页面:next('/login')
		当前用户没有后台主页的访问权限，不允许跳转到后台主页:next(false)


