package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

private Exam exam;
	
	//�⺻ ������
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	//Program.java�� console�� ��ü�� �Ѱ��ִ� ����
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	//ExamConsole.java�� implements�ؼ� �������̽��� ����
	@Override
	public void print() {
		System.out.printf("�̰��� Grid�̴�. total : %d avg : %f\n",exam.total(),exam.avg());
	}

	@Override
	public void setExam(Exam exam) {

		this.exam=exam;
		
	}

}
