package java对象引用;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String [] Args) {

    Result r = process() ;
  //   List<DataBean> datas = (List<DataBean>) r.getData();  //方式一

    List<DataBean> datas = new ArrayList<>() ; // 方式二
     datas = (List<DataBean>) r.getData();
    //改变前
    System.out.println("改变前");
    for (DataBean d: datas
         ) {
        System.out.println(d.getName());
    }
    //改变1
    datas.get(0).setName("000000000");
    datas.get(1).setName("111111111");

    //改变2
    for(int i = 2;i<3;i++){
        DataBean d = datas.get(i) ;
        d.setName("局部变量改变，也影响");
    }

    //改变后
    System.out.println("改变后");
    for (DataBean d: (List<DataBean>) r.getData()
    ) {
        System.out.println(d.getName());
    }

}


    public static Result process() {
        Result result  = new Result() ;
        List<DataBean> datas = new ArrayList<>();
        for(int i = 0 ; i< 3 ; i++) {
            DataBean  data = new DataBean() ;
            data.setName("name"+i);
            datas.add(data) ;
        }
        result.setData(datas);
        return result;
    }

}





class DataBean{
    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class Result {
    private  Object data ;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
