public class MyFirstApp{
    public static void main(String[] args) {
        // 定义变量与python类似，但是可以同时赋值

        int x = 1;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        //double d = Math.random();
        // 搞个注释？？？
        //玩个循环  for  while   
        // 与c语言的循环语句个是完全相同
        while (x > 12) {
            x = x- 1;
            System.out.println(x);
        }
        // 与c语言完全相同
        //Java滴条件语句
        x = (int) Math.random()*1000;// double转换成int数据赋值给int型的x
        System.out.println(x);
        // 关系运算符与c相同
        if (x == 10){
            System.out.println("x must be 10");
        } else{
            System.out.println("x isn't 10");
        }
        if ((x < 3) & (name.equals("Dirk"))) {
            System.out.println("Gently");
            
        }
        System.out.println("this line runs no matter what");

        //其他
        for (x = 0; x < 10; x = x + 1){
            System.out.println("x is now " + x);
        }
        System.out.println("I Rule!");
        System.out.println("The World");
    }
}