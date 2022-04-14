package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	
	public static void main(String[] args) {
		
//		Exam exam= new NewlecExam();
//		console.setExam(exam);
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam=context.getBean(Exam.class);
		System.out.println(exam.toString());
		System.out.println("test");
		//비선호하는 방법 re>꺼내올때 타입을 몰라서 형변환을 해야 하기 때문에
//		ExamConsole console=(ExamConsole) context.getBean("console");
		ExamConsole console=context.getBean(ExamConsole.class);
		console.print();
	}
}
