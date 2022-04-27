module.exports = {

    // 声明 babel可插件
    // waepack在调用 babel-loader的时候  会先调用这里
    plugins: [['@babel/plugin-proposal-decorators', {legacy: true}]]
}