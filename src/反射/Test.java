package 反射;

public class Test {
    public static void main(String args[]) {
        try {
            // 创建对象
            ReflectClass.reflectNewInstance();

            // 反射私有的构造方法
            ReflectClass.reflectPrivateConstructor();

            // 反射私有属性
            ReflectClass.reflectPrivateField();

            // 反射私有方法
            ReflectClass.reflectPrivateMethod();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
