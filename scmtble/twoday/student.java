package scmtble.twoday;

public class student {
    //属性
    String name;
    int age;
    //方法

    public student(){
        this.name = "NO Name";
        this.age = 0;
    }



    public student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("name :"+this.name +"\t"+"age :" + this.age);
    }

    public void study(){
        System.out.println(this.name + "在学习");
    }
}
