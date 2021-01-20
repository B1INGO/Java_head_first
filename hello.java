// 最简java程序
// class:用于声明一个类(class)
// public:一个表示可见性的访问修饰符
public class hello{
    /*  static:可以用static声明任何方法，被static修饰后的方法称之为静态(static)方法
              静态方法不需要为其创建对象就能调用
        void:表示该方法不返回任何值
        main:表示该方法为主方法，即程序运行时必须要通过的唯一入口。
            main()由java虚拟机执行，配合static关键字后，可以不用创建对象直接被调用，可以节省不少内存空间。
        string[] args:声明了一个类型为字符串型、参数名为args的变量作为main()方法的参数

    */
    public static void main(String[] args){
        //此句暂时不注解
        System.out.println("飞流直下三千尺，疑似银河落九天。");
    }
}