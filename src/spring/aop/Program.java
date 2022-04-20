package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlecDiConfig;

public class Program {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context =
//				new AnnotationConfigApplicationContext(NewlecDiConfig.class);
		new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam proxy = (Exam) context.getBean("proxy");
		System.out.printf("total= %d\n",proxy.total());
		System.out.printf("avg= %f\n",proxy.avg());
//		Exam exam= new NewlecExam(1,1,1,1);
		
//		Exam proxy=(Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//				new Class[] {Exam.class},
//				new InvocationHandler() {
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						
//						Object result=method.invoke(exam, args);
//						
//						return result;
//					}
//			
//		});
		
		
		
		
		
	}
}
