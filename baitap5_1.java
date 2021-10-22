package DSLKDON;

public class Link {
	public String hoten;
	public double diem;
	public Link nextLink;
	
	public Link(String ht, double d) {
		hoten = ht;
		diem = d;
	}
	
	public void printLink() {
		System.out.print("{" + hoten +", " +diem+"} ");
	}
}

class Linkist {
	private Link first;
	
	public Linkist() {
		first = null;
	}
	
	public void insert(String hoten, double diem) {
		Link nut = new Link(hoten, diem);
		nut.nextLink = first;
		first = nut;
	}
	
	public void printLink() {
		Link p = first;
		while (p!=null) {
			p.printLink();
			p= p.nextLink;
		}
		System.out.print("");
	}
	
	public void score8() {
		Link p = first;
		while (p!=null) {
			if(p.diem >=8)
			p.printLink();
			p= p.nextLink;
		}
		System.out.print("");
	}
}
