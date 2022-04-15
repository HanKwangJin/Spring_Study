package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class GridExamConsole implements ExamConsole {
	@Autowired
//	@Qualifier("exam2")
	private Exam exam;

	// �⺻ ������
	public GridExamConsole() {
		System.out.println("constructor");
	}
	// Program.java�� console�� ��ü�� �Ѱ��ִ� ����
	public GridExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	// ExamConsole.java�� implements�ؼ� �������̽��� ����
	@Override
	public void print() {
		if(exam == null) 
			System.out.printf("�̰��� Grid�̴�. total : %d avg : %f\n", 0, 0.0);
		else
			System.out.printf("�̰��� Grid�̴�. total : %d avg : %f\n", exam.total(), exam.avg());
	}
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;

	}

}
