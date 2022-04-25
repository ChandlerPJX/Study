1. 了解DOM
   1. DOM 文档对象模型，处理可扩展标记语言的接口。（了解下DOM树）
      ·文档：一个页面就是一个文档
      ·元素：页面中所有标签都是元素， DOM中使用element表示
      ·节点：网页中所有内容叫做节点。用node表示


2. 获取元素
   · ID      getElementById
   · 标签     getElementsByTagName
   · html5的方法通过类名/id名字  1. getElementsByClassName  2. 选择器 querySelector/querySelectorAll
   · 元素  body/html /head  document.body / document.documentElement/ document.head


3. 事件基础 : 触发--响应 机制
   1. 事件源
   2. 事件类型
   3. 事件处理程序
   4. 执行事件的步骤
            获取事件源
           注册事件（绑定）
            添加事件处理程序

4. 操作元素 
      1. 改变元素内容   innerText 与 innerHTML
      2. 操作元素的属性
5. 节点操作


常见鼠标事件：
        onclick  点击左键
        onmouseover 经过
        onmouseout 离开
        onfocus 获得焦点
        onblur  失去焦点
        onmousemove 鼠标移动
        onmouseup   鼠标弹起
        onmousedown  鼠标按下


案例练习：

        通过className修改样式属性
        
        循环精灵图
        
        密码框验证信息
        
        文本框显示/隐式
        
        排他思想
        
        百度换肤案例
        
        表格隔行变色
        
        全选与反选案例
        
        自定义属性
        
        tab栏 切换布局分析

H5自定义属性（以data开头）：  
    所有自定义属性都要用data-开头
        e.setAttribute 设置自定义属性
        e.getAttribute 获得自定义属性
        h5新增的：   e.dataset.属性 和 e.dataset['index']    <---只能获取data开头的

DOM 节点层次：
    Node
    Document
    Element
    Text
    Comment
    CDATASection  
    DocumentType
    DocumentFragment
    Attr

DOM 操作技术：

节点操作：
        父节点： parentNode 
        子节点： childNodes 

        取节点
        创建节点/添加节点   :三种创建的区别。
        删除节点
        复制节点
        
练习案例： 

        下拉菜单

        发布/删除留言

        动态生成表格
        
事件：

注册事件（绑定事件）：

        传统方式： 利用on开头。 如 onclick  。  特点有唯一性，一个元素只能设置一个处理函数。
        方法监听:  addEventListener()    推荐使用
删除事件（解绑事件）
事件流程
        捕获阶段   document -> html -> body -> div
        当前目标阶段
        冒泡阶段   div -> body -> html -> document

