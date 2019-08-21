package study06;

import javax.swing.JOptionPane;

public class Engine {
	

	public static void main(String[] args) {
		
		Member member = null;
		Service service = new Service();
		while (true) {
			int flag = 0;
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.마이페이지  3.아이디찾기 4.BMI "
					+ "5.ReportCard 6.Tax")){				
			case "0": System.out.println("종료"); 
			return;
			case "1": 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호 입력"));
//				member.setName(JOptionPane.showInputDialog("이름 입력"));
//				member.setBirth(JOptionPane.showInputDialog("생년월일 입력"));
//				System.out.print("키(소수점 첫째자리까지) : ");		
////				member.setHeight(scanner.nextDouble());
//				System.out.print("몸무게(소수점 첫째자리까지) : ");
////				member.setWeight(scanner.nextDouble());
//				System.out.print("혈액형(A) : ");
////				member.setBlood(scanner.next());
//				System.out.println("국어점수");
////				member.setKor(scanner.nextInt());
//				System.out.println("영어점수");
////				member.setEng(scanner.nextInt());
//				System.out.println("수학점수");
////				member.setMath(scanner.nextInt());
//				System.out.println("연봉입력");
////				member.setMoney(scanner.nextInt());
//				tm.toString()
			break;
			case "2":
				System.out.println("2. 마이페이지");
				JOptionPane.showMessageDialog(null, "2. 마이페이지\n"+ member.toString());
				break;			
			case "3":
				System.out.println("ReportCard 구하기");
				System.out.println(service.getReportCard(member));
				break;
			case "4":
				System.out.println("Tax 구하기");
				System.out.println(service.getTax(member));
				break;
			}
			
			
		}

	}

}