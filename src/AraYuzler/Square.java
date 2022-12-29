package AraYuzler;

public class Square implements Plygon {
	public void getArea() {
		int kenar=5;
		int area=kenar*kenar;
		System.out.println("Karenin alanı: "+area);
	}
	public void getSide() {
		System.out.println("Karenin eşit 4 kenarı vardır");
	}
}
