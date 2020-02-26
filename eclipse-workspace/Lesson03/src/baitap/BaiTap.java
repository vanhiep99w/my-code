package baitap;

import java.util.Scanner;


public class BaiTap {

	static Scanner sc=new Scanner(System.in);
	static Vehicle[] listVehicles=new Vehicle[10];
	static int amount=0;
	
    public static void main(String[] args) {
    	Menu();
	}
    private static void scanInfo(int amount) {
    	for(int i=0;i<amount;i++) {
    		System.out.println("Nhập vào thông tin chủ xe :");
    		System.out.print(" +  CMND :");
    		String id=sc.nextLine();
    		System.out.print(" +  Họ và Tên :");
    		String name=sc.nextLine();
    		Owner owner=new Owner(id, name);
    		System.out.println("Nhập vào thông tin xe :");
    		System.out.print(" +  Nhập vào loại xe :");
    		String kindOfVehicle=sc.nextLine();
    		System.out.print(" +  Nhập vào dung tích xe :");
    		int capacity=Integer.parseInt(sc.nextLine());
    		System.out.print(" +  Nhập vào giá xe :");
    		int value=Integer.parseInt(sc.nextLine());
    		Vehicle v=new Vehicle(owner, kindOfVehicle, capacity, value);
    		listVehicles[i]=v;	
    	}
    }
    private static void showInfo(int amount) {
    	for(int i=0;i<amount;i++) {
    		Vehicle v=listVehicles[i];
    		System.out.printf("%-15s%-15s%-15s%-15s%-15s","Tên chủ xe","Loại xe","Dung Tích","Giá Trị","Thuế");
    		System.out.println("\n");
    		System.out.println("================================================================");
    		System.out.printf("%-15s%-15s%-15s%-15s%-15s"
    				,v.getOwner().getName()
    				,v.getKindOfVehicle()
    				,v.getCapacity()
    				,v.getValue()
    				,v.getTax());
    	}
    	System.out.println();
    }
    private static void Menu() {
    	
    	int choose;
    	do {
    		System.out.println("=========Menu=========");
        	System.out.println("1 .Nhập thông tin ");
        	System.out.println("2 .Xuất bảng kê khai tiền thuế ");
        	System.out.println("3 .Thoát");
        	System.out.println("======================");
        	System.out.print("Nhập vào lựa chọn : ");
        	choose=Integer.parseInt(sc.nextLine());
        	if(choose==1) {
        		System.out.println("Nhập vào số lượng cần thêm ");
        		amount=Integer.parseInt(sc.nextLine());
        		scanInfo(amount);
        	}else if(choose==2) {
        		
        		showInfo(amount);
        	}else {
        		System.exit(0);;
        	}
        	
    	}while(choose>0 && choose<3);
    }
}

