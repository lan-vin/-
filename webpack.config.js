const path = require('path');

module.exports = {
    mode: "development",
    entry: {
        index:'./src/index.js',
        log_in:'./src/log_in.js',
        register:'./src/register.js',
        accomplish:'./src/accomplish.js',
        makewish:'./src/makewish.js',
        upload:'./src/upload.js'
    },
    output: {
        filename: '[name].js',
        path: path.resolve(__dirname, 'dist'),
    },module: {
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
