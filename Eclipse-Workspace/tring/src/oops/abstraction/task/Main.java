package oops.abstraction.task;

public class Main {

	public static void main(String[] args) {
		Pen pen;
		pen = new Black();
		pen.refillcolor();
		pen = new Blue();
		pen.refillcolor();

	}

}
