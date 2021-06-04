package question14;

public class Cylinder implements C {
	public double radius;
	public String color;
	public double height;
		public Cylinder(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}
		@Override
		public double area() {
			double area = 2*PI*this.radius*this.height + 2*PI*this.radius*this.radius;
			return area;
		}

		@Override
		public double volume() {
			double volume = PI*this.radius*this.radius*this.height;
			return volume;
		}


		@Override
		public void setColor(String color) {
			
			this.color = color;
		}
		public static void main(String[] args) {
		Cylinder cyl = new Cylinder(8.9,9.8);
		System.out.println("The area is: " + cyl.area());
		System.out.println("The volume is: " + cyl.volume());
		cyl.setColor("Tie-Dye");
		System.out.println("The color is: " + cyl.color);
		}
}
