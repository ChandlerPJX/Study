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