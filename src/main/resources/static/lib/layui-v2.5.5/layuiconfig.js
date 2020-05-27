window.rootPath = (function (src) {
    src = document.scripts[document.scripts.length - 1].src;
    return src.substring(0, src.lastIndexOf("/") + 1);
})();

layui.config({
    base: rootPath,
    version: true
}).extend({
    layuicrm: "layuicrm",
    eleTree: "eleTree",
    echarts: 'echarts', // echarts图表扩展
    echartsTheme: 'echartsTheme' // echarts图表主题扩展
});