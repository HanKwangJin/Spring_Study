package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	@Autowired
	@Qualifier("exam2")
	private Exam exam;

	// 기본 생성자
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	// Program.java에 console에 객체를 넘겨주는 역할
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	// ExamConsole.java를 implements해서 인터페이스를 구현
	@Override
	public void print() {
		System.out.printf("이것은 Grid이다. total : %d avg : %f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {

		this.exam = exam;

	}

}
