package Deepskilling.Week3_Spring_Core_Maven.LibraryManagementAOP.src.main.java.com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.library.service.*.*(..))")
    public void beforeServiceMethod() {
        System.out.println("🔔 [LOG] Method is about to execute...");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void afterServiceMethod() {
        System.out.println("✅ [LOG] Method execution completed.");
    }
}
