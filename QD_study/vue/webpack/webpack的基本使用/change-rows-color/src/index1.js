

/*
在 webpack中一切皆模块，都用es6的语法导入
 */


// 1.   使用ue6 导入 jQuery
import $ from 'jquery'


// 2.  定义jq的入口函数
$(function () {
    // 3  实现奇偶变色
    $('li:odd').css('background-color', '#2c572e');  //奇数行
    $('li:even').css('background-color', '#0f8cee'); // 偶数行
})


// 导入样式 css
import './css/index.css'

import './css/index.less'

// 1. 导入图片，得到图片地址

import lf from '../images/1.png'
// 2. 给img 标签src动态赋值
$('.box').attr('src',lf)



// 装饰器 函数
function info(target){

    target.info = 'Person info.'
}
//定义一个类

@info
class Person{

}

console.log(Person.info)