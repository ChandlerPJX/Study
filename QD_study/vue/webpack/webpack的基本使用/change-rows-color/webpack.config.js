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

    performance: {
        hints: 'warning', // 枚举 false关闭
        maxEntrypointSize: 100000000, // 最大入口文件大小
        maxAssetSize: 100000000, // 最大资源文件大小
        assetFilter: function (assetFilename) { //只给出js文件的性能提示
            return assetFilename.endsWith('.js');
        }
    },

    // 在webpack.config.js 中可以通过 entry节点，指定打包的入口。通过 output节点指定打包的出口。
    // 打包入口文件的路径 __dirname表示当前文件所处的目录
    entry: path.join(__dirname, './src/index1.js'),

    output: {
        path: path.join(__dirname, 'dist'),
        filename: 'js/bundle.js' //输出文件的路径
    },

    // 配置文件的插件
    plugins: [htmlPlugin],

    devServer: {
        open: true,  // 初次完成更改自动打开浏览器
        // host: '127.0.0.1',// 主机地址
        // port: 80    //端口号

    },

    //添加匹配规则
    // 文件后缀名匹配规则  从后往前调用
    module: {
        rules: [
            {
                test: /\.less$/,
                use: ['style-loader',
                    'css-loader',
                    'less-loader']
            },

            {
                test: /\.css$/,
                use:
                    ['style-loader',
                        'css-loader',
                    ]
            },
            {
                test: /\.jpg|png|gif$/,
                use: 'url-loader'
                //url-loader?limit =470 这里的limit 是限制图片转换的大小。如果小于470 就会被转换为base64。
            },
            {
                // 注意： 必须使用exclude 指定排除项； 因为node_modules 目录下的第三方不需要被打包
                test: /\.js$/, use: 'babel-loader', exclude: /node_modules/
            }
        ]
    },


}



