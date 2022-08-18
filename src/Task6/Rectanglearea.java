package Task6;

class Rectanglearea {
	
	int length;
	int breadth;
	
	public Rectanglearea() {
		int length = 0;
		int breadth = 0;
	}
	
    public Rectanglearea(int length,int breadth) {
		this.length = 5;
		this.breadth = 9;
	}

    public Rectanglearea(int length) {
		this.length = 8;
		breadth = 4;
	}
    
    public void area() {
    	System.out.println(length*breadth);
    }

}


