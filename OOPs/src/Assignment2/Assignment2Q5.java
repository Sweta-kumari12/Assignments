package Assignment2;
abstract class Shape5 {
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "four line";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "single line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "six line";
    }
}
public class Assignment2Q5 {
	public static void main(String[] args) {
		Rectangle5 rect=new Rectangle5();
		Line5 li=new Line5();
		Cube5 cu=new Cube5();
		System.out.println(rect.draw());
		System.out.println(li.draw());
		System.out.println(cu.draw());
	}

}
