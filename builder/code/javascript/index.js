function getBeerById(id, callback) {
  // 使用ID来请求数据，然后返回数据.
  asyncRequest('GET', 'beer.uri?id=' + id, function(resp) {
    // callback调用 response
    callback(resp.responseText);
  });
}

var el = document.querySelector('#test');
el.addEventListener('click', getBeerByIdBridge, false);

function getBeerByIdBridge(e) {
  getBeerById(this.id, function(beer) {
    console.log('Requested Beer: ' + beer);
  });
}

//表相即是回调，也就是说获取数据以后如何显示和处理取决于回调函数
//相应地回调函数在处理数据的时候不需要关注是如何获取数据