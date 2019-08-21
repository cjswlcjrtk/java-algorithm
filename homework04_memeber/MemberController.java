package homework04_memeber;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		
		Member member = null;
		MemberService service = new MemberService();
		
		while(true) {
			String flag = "";
//			flag = JOptionPane.showInputDialog("0.종료, 1.회원가입, 2.마이페이지, 3.BMI");			
			switch(JOptionPane.showInputDialog("0.종료, 1.회원가입, 2.마이페이지, 3.BMI")) {
			case "0" : 
				return;
			
			case "1" : 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("PW 입력"));
				member.setName(JOptionPane.showInputDialog("이름 입력"));
				String heigth = JOptionPane.showInputDialog("키 입력");
                member.setHeight(Double.parseDouble(heigth));
                String weight = JOptionPane.showInputDialog("몸무게 입력");
                member.setWeight(Double.parseDouble(weight));
				break;
			
			case "2" : 
				JOptionPane.showMessageDialog(null, "2. 마이페이지\n" + service.getMyPage(member));				
				break;
			
			case "3" : 
				JOptionPane.showMessageDialog(null, "3. BMI결과\n" + service.getBMI(member));
				break;
			
			
			}
		}

	}

}
