package AraYuzler;

public interface Plygon {
void getArea();
default void getSides() {
	System.out.println("Plygon kenar sayısı");
}
default void getPerimeter(int... sides) {
	int perimeter=0;
	for(int side: sides) {
		perimeter += side;
	}
	System.out.println("Çokgenin çevresi: ");
}
}
