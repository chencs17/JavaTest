class Book{
	private String title;
	private double price;
	public Book(String title, double price){
		this.title = title;
		this.price = price;
	}
	//setter,getter略
	public String getInfo(){
		return "书名：" + this.title + ",价格：" + this.price;
	}
}

public class ObjArray{
	public static void main(String args[]){
		Book books[] = new Book[3];
		books[0] = new Book("Java", 79.8);
		books[1] = new Book("Jsp" , 90.8);
		books[2] = new Book("oracle", 77.9);
		for(int i = 0; i < books.length; i++){
			System.out.println(books[i].getInfo());
		}
	}	
} 
