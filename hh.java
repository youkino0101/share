package luyencode;

import java.util.Scanner;

public class Text {
	public static Scanner sc = new Scanner(System.in);
	public static int n, temp;
	public static int a[] = new int[100];
	
	public static void inputArray() {
		System.out.println("Bao nhieu phan tu: ");
		n = sc.nextInt();
        System.out.printf("Nhap %d phan tu cua mang: ", n);
		for(int i=0;i<n;i++) {
		    a[i]= sc.nextInt();      
		}
	}
	
	public static void showArray() {
		System.out.println("Mang vua nhap: ");
		for(int i=0;i<n;i++) {
		    System.out.print("\t"+a[i]);
		}
	}
	
		
	public static void sort() {
		for (int i = 0; i < n - 1; i++) {
	        for (int j = i+1; j <= n - 1; j++) {
	            if (a[j] < a[i]) {
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	}
			
		
	public static void search() {
		System.out.println("Nhập số nguyên cần tìm: ");
	    int k = sc.nextInt(), l;
	    
	    int d = 0;
	    int c = n - 1;
	    
	    while (d <= c) {
	        l = (d + c) / 2;
	        if (a[l] == k) {
	            System.out.println("Tìm thấy phần tử " + k + " tại vị trí " + l);
	            return;
	        } else if (a[l] < k) {
	            d = l + 1;
	        } else {
	            c = l - 1;
	        }
	    }
	    
	    System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
	}
	
	public static void delete() {
		int c, i, k;
		System.out.println("Nhập số nguyên để xóa: ");
		k = sc.nextInt();
		for (c = i = 0; i < n; i++) {
	        if (a[i] != k) {
	            a[c] = a[i];
	            c++;
	        }
	    }
		n=c;
		System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
	    for (i = 0; i < n; i++) {
	        System.out.print(a[i] + "\t");
	    }
	}
	
	public static void main(String[] args) {
		boolean exitMain = false;
		showMenu();
		int choose;
		while(true) {
			choose = sc.nextInt();
			switch (choose) {
			case 1: 
				inputArray();
				break;
			case 2:
				showArray();
				break;
			case 3 :
				sort();
				break;
			case 4 :
				search();
				break;
			case 5 :
				delete();
				break;
			case 0 :
				exitMain=true;
				break;
			}
			if (exitMain) {
					break;
			}
			showMenu();
		}
	}

	private static void showMenu() {
		System.out.println("\n1. Nhập mảng!!!");
		System.out.println("2. Hiện thị mảng!!!");
		System.out.println("3. Sắp xếp mảng!!!");
		System.out.println("4. Tìm kiếm mảng!!!");
		System.out.println("5. Xóa mảng");
	}

}
