package unit03.conditionals.day14;

public class MethodExampleWithMainMEthod {
    public static void sayHello(){
        System.out.println("Hello User");
    }


    public static void sayHellowithName(String name){
        System.out.println("hello" + name);
    }
    public static void main(String[] args) {
        sayHello();
        sayHellowithName("John");
    }

}
