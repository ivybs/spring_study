import com.ibs.dao.UserDaoImp;
import com.ibs.dao.UserDaoMysqlImp;
import com.ibs.service.UserServiceImp;

public class MyTest {

    public static void main(String[] args) {

        // 用户实际调用的是业务层
        UserServiceImp userServiceImp = new UserServiceImp();
        // 这样的话不管用户的需求是什么，都不用去修改dao和service层，
        // 只需要在用户的调用层才进行选择具体的就行了
        userServiceImp.setUserDao(new UserDaoMysqlImp());
        userServiceImp.getUser();
    }

}
