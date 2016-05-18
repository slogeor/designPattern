/**
 * 假如我们想在网页面里插入一些元素，而这些元素类型不固定，
 * 可能是图片，也有可能是连接，甚至可能是文本，
 * 根据工厂模式的定义，我们需要定义工厂类和相应的子类
 */
//==================子类==================
var page = page || {};
page.dom = page.dom || {};
//子函数1：处理文本
page.dom.Text = function() {
    this.insert = function(where) {
        var txt = document.createTextNode(this.url);
        where.appendChild(txt);
    };
};

//子函数2：处理链接
page.dom.Link = function() {
    this.insert = function(where) {
        var link = document.createElement('a');
        link.href = this.url;
        link.appendChild(document.createTextNode(this.url));
        where.appendChild(link);
    };
};

//子函数3：处理图片
page.dom.Image = function() {
    this.insert = function(where) {
        var im = document.createElement('img');
        im.src = this.url;
        where.appendChild(im);
    };
};


//==================厂方法==================
page.dom.factory = function(type) {
    return new page.dom[type];
};

//==================test==================
var o = page.dom.factory('Link');
o.url = 'http://www.cnblogs.com';
o.insert(document.body);