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
捕获阶段   

        document -> html -> body -> div
当前目标阶段
冒泡阶段   

        div -> body -> html -> document

事件委托（代理）:

        原理： 不给每个子结点设置单独的监听器，而是给其父节点设置监听器，之后利用冒泡原理设置影响的每个子节点。

常用的鼠标事件对象：

        e.clientX       返回鼠标相当于与窗口可视区的X坐标
        e.clientY       返回鼠标相当于与窗口可视区的Y坐标
        e.pageX         返回鼠标相当于与文档页面的X坐标
        e.pageY         返回鼠标相当于与文档页面的Y坐标
        e.screenX       返回鼠标相当于与电脑屏幕的X坐标
        e.screenY       返回鼠标相当于与电脑屏幕的Y坐标
常用的键盘事件：

        onkeyup         某个键盘按键被松开时
        ondkeydown      某个键盘按键被按下时
        onkeypress      某个键盘按键被按下时  它不识别功能键， ctrl shift
    