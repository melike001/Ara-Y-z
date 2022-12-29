package AraYuzler;

public class Rectangle implements Plygon {
	public void getArea() {
		int en=6;
		int boy=5;
		int area=en*boy;
		System.out.println("Dikdörtgenin alanı: "+area);
	}
	public void getSide() {
		System.out.println("Dikdörtgenin 4 kenarı vardır");
	}
}
