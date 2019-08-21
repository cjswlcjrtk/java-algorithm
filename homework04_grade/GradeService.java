package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String result = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		double total = grade.getTotal();
		
		total = kor + eng + math;
		
//		result = String.format("%s", total);
		
		return String.format("%0.1f", total);
	}
	public String getAvg(Grade grade) {
		String avg = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		double total = grade.getTotal();	
		double evg = grade.getEvg();
		total = kor + eng + math;
		evg = total/3;
//		avg = String.format("%d", evg);
		return String.format("%.1f", evg);
	}
}
