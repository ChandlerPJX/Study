Vue学习：vue的指令、组建、路由、vuex、vue组建库

认识Vue

     1. 使用vue 要创建一个vue实例对象，且要传入配置对象。
     2. root 容器里的代码依然符合html规范，只是混入了vue语法。
     3. root容器里的代码被称为【vue模版】
     4. 容器和vue实例对象是一一对应的.

模版语法

    用于解析标签内容. 写法:{{xxx}} , xxx为js表达式,由data中的属性读到.
    用于解析标签(标签属性,标签内容...) 如 v-bind:href=“xxxx”, xxx为js表达式,由data的属性读到.
        指令语法有很多. 
        格式: v-xxxx

数据绑定

    Vue 之中两种绑定：
    1· 单向绑定（v-bind） ，数据从data流向页面
    v-bind 可以简写为 ：
    2· 双向绑定（v-model），数据双向流。 注意：双向绑定一般用于表单类元素（input、select、...）
    v-model:value 可以简写为 v-model 其默认绑定value

el与data的两种写法

MVVM

    M 模型：对应data中的数据   Plan JS Objects(Data Bindings)
    V 视图： 模版               DOM (DOMListeners)
    VM 视图模型 ： Vue实例对象   Vue
    
    
指令：

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

过滤器:

    过滤器的基本使用.  用在 查值表达式{{}} 与 v-bind之中

    定义在filter下  , 过滤器本质上是函数 

    注意：过滤器函数形参中的 val，永远都是“管道符(|)”前面的那个值 

    /* 
    全局过滤器 - 独立与每个vm实力之外.
    Vue.filter() <-- 接受2个参数,一个是全局过滤器的名字,一个是全局过滤器的处理函数.
    */    

    