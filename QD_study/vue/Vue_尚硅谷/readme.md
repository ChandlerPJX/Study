Vue学习：

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
    V 视图： 模版               DOM (DOMLIsteners)
    VM 视图模型 ： Vue实例对象   Vue
    
    
    
    