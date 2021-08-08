package assesment;

class Rectangle{
	private double largeur;
	private double longueur;
	
	public Rectangle(double largeur,double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public double surface() {
		return largeur * longueur;
	}
}

class ManipRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Surface : " + new Rectangle(4, 7).surface());
	}
}
