let promise = new Promise(function (resolve, reject,a=2){
    // 回调函数默认传入resolve, reject(两个函数)
    // resolve()：改变promise对象状态，未完成 变为 成功,
    // reject()：改变rejecte对象状态，未完成 变为 失败
    // setTimeout(()=>{console.log("Hello")},1000)
    if (a==1){
        resolve("成功！");
    }// 并将value传递出去
    if (a==2){
        // console.log("Hello")
        reject("失败！");
    }// 并将value传递出去
})

// then,catch函数返回一个promise对象
promise.then((value)=>{console.log(value)})
    .catch((error)=>{console.log(error)})