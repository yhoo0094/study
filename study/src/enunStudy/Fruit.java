package enunStudy;

public enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
    
	Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
	
    String getColor(){
        return this.color;
    }	
    
    //컴파일 오류
    /*
    public Fruit(){
        System.out.println("Call Constructor "+this);
    }
    */    
}

	