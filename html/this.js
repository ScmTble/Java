function f() {
    return '姓名：'+ this.name;
}

let A = {
    name: '张三',
    describe: f
};

let B = {
    name: '李四',
    describe: f
};

// A.describe() // "姓名：张三"
// B.describe() // "姓名：李四"

// console.log(A.describe())
// console.log(B.describe())

let a = 1;

console.log(a)