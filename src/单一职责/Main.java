package 单一职责;

public class Main {
    public static void main(String arg[]){
        IUserInfo userInfo = new UserInfo() ;

        IUserBo bo = userInfo ;
        IUserBiz Biz = userInfo ;

    }
}
