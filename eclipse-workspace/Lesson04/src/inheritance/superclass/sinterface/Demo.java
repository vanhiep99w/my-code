package inheritance.superclass.sinterface;

public class Demo {

	public static void main(String[] args) {
		/**
		 * Interface :
		 * + bắt buộc phải override các hàm từ cha .
		 * + sử dụng interface khi method chưa xác định rõ nội dung 
		 * + adstract method 
		 * + thường được áp dụng trong các tâng service ,manager trong project
		 * + Không thể tạo contructor
		 * Class :
		 * + lớp con không bắt buộc phải override lại các method
		 * + method đã xác định rõ nôi dung
		 * + normal method
		 * 
		 */
		StudentManager stManagerImp=new StudentManagerImp();
		stManagerImp.add();
		stManagerImp.delete();
			
		//anonymous class : dis _ encourage (không chính thức )
		StudentManager stManager=new StudentManager() {
			
			@Override
			public boolean delete() {
				System.out.println("Demo deleting student");
				return false;
			}
			
			@Override
			public boolean add() {
				System.out.println("Demo adding student");
				return false;
			}
		};
		stManager.add();
		stManager.delete();
	}
}
