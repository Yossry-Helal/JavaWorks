package org;

public class PointCoordinates {
	private int x, y;

	public PointCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public int display() {
		return x+y;
	}


		public static void main(String[] args) {
			PointCoordinates point = new PointCoordinates(10, 10);
			
			//Using the default ObjectToString() Method
			System.out.println("Object to String Method:  " + point.display());
			
			
			//Implicitly call toString() on Obj as Part of String concatenation
			String s=point.display()+" testing";
			System.out.println(s);
			
		}

	}
