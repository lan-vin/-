const path = require('path');

module.exports = {
    mode: "development",
    entry: {
        index:'./src/index.js',
        log_in:'./src/log_in.js',
        accomplish:'./src/accomplish.js',
        register:'./src/register.js',
        makewish:'./src/makewish.js',
        upload:'./src/upload.js'
    },
    output: {
        filename: '[name].js',
        path: path.resolve(__dirname, 'dist'),
        assetModuleFilename: 'images/[hash][ext][query]'
    },
    module: {
        rules: [
            {
                test: /\.css$/i,
                use: ['style-loader', 'css-loader'],
            },
            {
                test: /\.(png|svg|jpg|jpeg|gif)$/i,
                type: 'asset/resource',
            },
        ],
    },
};