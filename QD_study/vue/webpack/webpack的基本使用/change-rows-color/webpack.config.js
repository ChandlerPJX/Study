// 使用node.js的语法向外到处webpack对象

const HtmlPlugin = require('html-webpack-plugin') // 导入html 插件
const path = require('path')  // 导入node.js的专门操作目录的模块


const htmlPlugin = new HtmlPlugin({
    template: './src/index.html', //指定原文件存放位置
    filename: './index.html' // 复制文件存放位置
})


module.exports = {
    // mode 代表webpack的运行模式，可选值为 development(开发的时候用) 和 production（上线的时候用）
    mode: 'development',

    // 在webpack.config.js 中可以通过 entry节点，指定打包的入口。通过 output节点指定打包的出口。

    entry: path.join(__dirname, './src/index1.js'), // 打包入口文件的路径 __dirname表示当前文件所处的目录

    output: {
        path: path.join(__dirname, 'dist'),
        filename: 'bundle.js' //输出文件的路径
    },

    // 配置文件的插件
    plugins: [htmlPlugin],


    //
    devServer: {
        open: true,  // 初次完成更改自动打开浏览器
        // host: '127.0.0.1',// 主机地址
        // port: 80    //端口号

    }
}



