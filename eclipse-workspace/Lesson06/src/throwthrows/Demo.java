package throwthrows;

public class Demo {

	public static void main(String[] args) {
		ClasicalBook math = new ClasicalBook(101, "Toan", true);
		ClasicalBook chem = new ClasicalBook(102, "Hoa", false);
		ReferenceBook mathRef = new ReferenceBook(999, "Sach Giai Toan", 10);
		Book[] books= {math,mathRef,chem};
	}
	private static void printNewClasicalBook(Book[] books) {
		for(Book book: books) {
			if(book instanceof ClasicalBook) {
				if(((ClasicalBook) book).isStatus()) {
					System.out.println(book.getId()+", "+book.getName());
				}
			}
		}
	}
	
	
}
