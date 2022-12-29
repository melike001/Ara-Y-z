package AraYuzler;

public class Triangle implements Plygon{
	protected int a,b,c;
	double s;
	protected int area;
	
	Triangle(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		s=0;
	}
	
	public void getArea() {
		s=(double)(a+b+c)/2;
		area=(int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("ucgenin alanı: "+area);
	}
}
