class Book{
	private String title;
	private double price;

	public void setTitle(String t){
		title = t;
	}

	public String getTitle(){
		return title;
	}

	public void setPrice(double p){
		price = p;
	}

	public double getPrice(){
		return price;
	}

	public void getInfo(){
		System.out.println("图书名称：" + title + "，价格：" + price);
	}
}

public class TestDemo{
	public static void main(String args[]){
		Book bk = new Book();
		//bk.title = "Java开发";
		//bk.price = 89.9;
		bk.setTitle("Java开发");
		bk.setPrice(89.9);
		bk.getInfo();
	}
}
