package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	@Autowired
	@Qualifier("exam2")
	private Exam exam;

	// �⺻ ������
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	// Program.java�� console�� ��ü�� �Ѱ��ִ� ����
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	// ExamConsole.java�� implements�ؼ� �������̽��� ����
	@Override
	public void print() {
		System.out.printf("�̰��� Grid�̴�. total : %d avg : %f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {

		this.exam = exam;

	}

}
