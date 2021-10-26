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
	
	public void search1(String hoten) {
		Link p = first;
		int d = 0;
		while (p!= null) {
			if (p.hoten.equals(hoten)==true) {
				d++;
				p.printLink();
			}
			p=p.nextLink;
		}
		if(d==0) {
			System.out.print("không có trong danh sách");
		}
	}
	
	public Link search(String hoten) {
		Link p = first;
		while (p!= null) {
			if (p.hoten.equals(hoten)==true) {
				break;
			}
		}
		return p;
	}
	
	public void kqsearch(String hoten) {
		if(search(hoten)!=null) {
			search(hoten).printLink();
		} else {
			System.out.println("Không có trong danh sách");
		}
	}
	
	public void delete(String ht) {
//		Link p = first;
		Link p,q;
		if(first.hoten.equals(ht)==true) {
			first=first.nextLink;
		} else {
			p=search(ht);
			q=first;
			while ((q!=null)&&(q.nextLink!=p)) {
				q.nextLink=p.nextLink;
			}	
		}
	}
	
	public void sort() {
		Link q,p;
		String ht;
		double diem;
		p =first;
		while (p!=null) {
			q=p.nextLink;
			while (q!=null) {
				if (p.hoten.compareTo(q.hoten)>0) {
					ht=q.hoten;
					diem=q.diem;
					q.hoten=p.hoten;
					q.diem=p.diem;
					p.hoten=ht;
					p.diem=diem;
				}
				p=p.nextLink;
			}
		}
	}
}
