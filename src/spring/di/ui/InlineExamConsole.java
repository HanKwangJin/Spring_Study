package spring.di.ui;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	//�⺻������
	public InlineExamConsole() {
	}
	//Program.java�� console�� ��ü�� �Ѱ��ִ� ����
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	//ExamConsole.java�� implements�ؼ� �������̽��� ����
	@Override
	public void print() {
		System.out.printf("�̰��� Inline �̴�. total : %d avg : %f\n",exam.total(),exam.avg());
	}
	@Override
	public void setExam(Exam exam) {

		this.exam=exam;
		
	}

}