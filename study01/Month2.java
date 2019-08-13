package study01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Month2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		System.out.println("sdf값 = " + sdf);
		String today = sdf.format(date);
//		System.out.println("today값 = " + today);
		int flag = Integer.parseInt(today.substring(5, 7));
//		System.out.println("flag값 = " + flag);
		
		String eval = "";
		
		switch(flag) {
		
		case 1: eval="1월"; break;
		case 2: eval="2월"; break;
		case 3: eval="3월"; break;
		case 4: eval="4월"; break;
		case 5: eval="5월"; break;
		case 6: eval="6월"; break;
		case 7: eval="7월"; break;
		case 8: eval="8월"; break;
		case 9: eval="9월"; break;
		case 10: eval="10월"; break;
		case 11: eval="11월"; break;
		case 12: eval="12월"; break;
		default: eval="x"; break;	
		
		}
		System.out.println(eval);
		
		
		
		
	}

}
