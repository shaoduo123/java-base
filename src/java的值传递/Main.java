package java的值传递;

public class Main {

    public static void main(String args []){
        String str = "transBefore" ;
        Integer num1 = 1 ;
        int num2 = 2 ;
        Obj o = new Obj();
        o.setFiled("a");

        System.out.println("传递前字符串:"+str+"  Integer："+num1+" int:"+num2+" 对象："+o.getFiled());
        trans(str,num1,num2,o);
        System.out.println("传递后字符串:"+str+"  Integer："+num1+" int:"+num2+" 对象："+o.getFiled());



    }

    public static void trans(String s,Integer n1,int n2,Obj obj) {
        s = "transAfter" ;
        n1 = 1111;
        n2 =  2222;
        obj.setFiled("b");
}




}

class  Obj {
    private String filed ;
    public void setFiled(String f) {

        this.filed = f ;
    }

    public String getFiled(){
        return this.filed ;
    }

}
