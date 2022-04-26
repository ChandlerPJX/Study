// 1    使用ue6 导入 jQuery
import $ from 'jquery'

// 2  定义jq的入口函数
$(function () {
    // 3  实现奇偶变色
    $('li:odd').css('background-color', '#5bde5c');  //奇数行
    $('li:even').css('background-color', '#448ec9'); // 偶数行
})