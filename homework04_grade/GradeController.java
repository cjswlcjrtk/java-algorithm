package homework04_grade;

import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		
		Grade grade = null;
		GradeService service = new GradeService();
		while(true) {
//			String flag = "";
//			flag = JOptionPane.showInputDialog("0.종료 1.이름과 성적을 입력해주세요 3.결과입니다");
			switch(JOptionPane.showInputDialog("0.종료 1.이름과 성적을 입력해주세요 2.결과입니다")) {
			case "0":
				return;
			case "1":
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름 입력"));
				String kor = JOptionPane.showInputDialog("국어점수 입력");
				grade.setKor(Integer.parseInt(kor));
				String eng = JOptionPane.showInputDialog("영어점수 입력");
				grade.setEng(Integer.parseInt(eng));
				String math = JOptionPane.showInputDialog("수학점수 입력");
				grade.setMath(Integer.parseInt(math));
				break;
			case "2": 
				JOptionPane.showMessageDialog(null, "2.결과창입니다. 총점수는 " + 
						service.getTotal(grade) + 
						"평균은" + service.getAvg(grade) + "입니다.");
				
				break;
			
			}
		}

	}

}
