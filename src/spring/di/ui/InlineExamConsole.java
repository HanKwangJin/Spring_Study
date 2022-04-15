package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	//기본생성자
	public InlineExamConsole() {
	}
	//Program.java에 console에 객체를 넘겨주는 역할
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	//ExamConsole.java를 implements해서 인터페이스를 구현
	@Override
	public void print() {
		System.out.printf("이것은 Inline 이다. total : %d avg : %f\n",exam.total(),exam.avg());
	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {

		this.exam=exam;
		
	}

}
