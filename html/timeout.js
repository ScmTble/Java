function timeout(ms) {
    return new Promise((resolve, reject) => {
        setTimeout(reject, ms, 'done');
    });
}

timeout(100).then(console.log,console.log)
.then(console.log)