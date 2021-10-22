package DSLKDON;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Linkist list = new Linkist();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("nhap ho ten:");
			String hoten = sc.next();
			if(hoten.length()==1) {
				System.out.print(hoten.length());
				break;
			} else {
				System.out.print("nhap diem: ");
				float diem = sc.nextFloat();
						sc.nextLine();
				list.insert(hoten,diem);
			}
		}
		list.printLink();
		list.score8();
	}

}
