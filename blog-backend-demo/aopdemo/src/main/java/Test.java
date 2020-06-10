import utils.Cal;
import utils.MyInvocationHandler;
import utils.impl.CalImp;

public class Test {
    public static void main(String[] args) {
//        Cal cal = new CalImp();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(1,3);
//        cal.div(3,1);

        Cal cal = new CalImp();
        //拿到代理对象
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal proxy = (Cal)myInvocationHandler.bind(cal);
        proxy.add(1,1);
        proxy.sub(2,1);
        proxy.mul(1,3);
        proxy.div(3,1);
    }
}
