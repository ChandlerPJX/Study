事件：
事件对象的常见属性与方法：
e.target      返回出发事件的对象
e.srcElement
e.type
e.preventDefault()   阻止默认事件
e.stopPropagation()   阻止冒泡

注册事件（绑定事件）：

        传统方式： 利用on开头。 如 onclick  。  特点有唯一性，一个元素只能设置一个处理函数。
        方法监听:  addEventListener()    推荐使用
删除事件（解绑事件）


事件流程
捕获阶段   document -> html -> body -> div
当前目标阶段
冒泡阶段   div -> body -> html -> document

事件委托（代理）:

        原理： 不给每个子结点设置单独的监听器，而是给其父节点设置监听器，之后利用冒泡原理设置影响的每个子节点。


    