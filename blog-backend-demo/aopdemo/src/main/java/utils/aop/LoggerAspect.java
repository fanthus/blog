package utils.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import utils.impl.CalImp;

import java.util.Arrays;

@Aspect   //表示改类为切面类
@Component //将该类的对象注入到 IoC 容器中
public class LoggerAspect {
    //具体方法的注解
    //表示方法执行的具体位置和时机
    @Before("execution(public int utils.impl.CalImp.*(..))")
    public void before(JoinPoint joinPoint) {
        //获取方法名
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法参数是"+ args);
    }

}
