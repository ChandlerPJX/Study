对Node.js学习

Node.js 

    node -v     查看版本


NPM使用

    npm -v      查看版本

    // 使用淘宝镜像（建议配置） 
    //你可以使用淘宝定制的 cnpm (gzip 压缩支持) 命令行工具代替默认的 npm
    // 如： cnpm install [name]
    npm install -g cnpm --registry=https://registry.npmmirror.com

    sudo npm install npm -g   升级npm 版本

    npm uninstall express 卸载

    npm update express 更新模块

    npm ls 查看包名字

    npm init  创建模块(创建模块，package.json 文件是必不可少的。我们可以使用 NPM 生成 package.json 文件)

    npm search express 搜索模块

    npm publish 发布模块



package.json

    name - 包名。

    version - 包的版本号。
    
    description - 包的描述。
    
    homepage - 包的官网 url 。
    
    author - 包的作者姓名。
    
    contributors - 包的其他贡献者姓名。
    
    dependencies - 依赖包列表。如果依赖包没有安装，npm 会自动将依赖包安装在 node_module 目录下。
    
    repository - 包代码存放的地方的类型，可以是 git 或 svn，git 可在 Github 上。
    
    main - main 字段指定了程序的主入口文件，require('moduleName') 就会加载这个文件。这个字段的默认值是模块根目录下面的 index.js。
    
    keywords - 关键字

Node.js 的使用
    
    使用fs模块读写操作文件

    使用path模块处理路径

    使用http模块写一个基本的web服务器

 