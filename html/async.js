function test() {
    // 此函数返回一个promise对象

    return new Promise(resolve => {
        console.log("开始执行：");
        setTimeout(() => {
            console.log("执行结束！");
            resolve("test");
        }, 5000);
    });
}


// 使用async关键字来定义异步函数
async function Hello(){



    let a = await test();
    // await等待异步操作结果，将此函数阻塞，交出执行权执行其他操作;

    let b = await test();

    console.log(a);
    console.log(b);
    return "success";

}

Hello().then((msg)=>console.log(msg));

// Hello().then((msg)=>{console.log(msg)})
//     .catch((msg)=>{console.log(msg)});

