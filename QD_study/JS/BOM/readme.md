
记录BOM对象的学习(操作BOM对象)

BOM ： 浏览器对象模型

    浏览器： IE 6～12
            Chrome
            Sarafi
            FireFox
            ...

· window :代表浏览器窗口

    window.onload  加载全部页面之后才会触发的页面
    window.alert()
    window.innerHeight
    window.innerWeight
    window.outerHeight
    window.

· Navigator : 封装了浏览器的信息 （了解且不建议使用）


· screen: 代表屏幕

    screen.width;
    screen.height;


·   location （重要）： 当前页面的url

         location.hash      获取主机(域名)
         location.href      获取整个URL
         location.port      获取端口号
         location.pathname  获取路径
         location.search    获取参数
         location.hash      获取片段（如 锚点，链接）
    
        location中的方法
        location.assign()  跳转页面
        location.reload()   重新加载，刷新页面
        location.replace() 替换当前页面 （不记录历史，所以不能回退）
   

·  history : 浏览器的历史信息

          history.back()    后退功能
          history.forward() 前进功能
          history.go(参数)  前进后退功能， 参数为1 表示前进一个页面。 参数为-1 表示后退一个页面