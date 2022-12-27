package enumStudy;

public class EnumExp {
	public static void main(String[] args) {
        /* 
        // 컴파일 오류 발생
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
		
		//enum 사용하기
		System.out.println("---------enum 사용하기---------");
        Fruit type = Fruit.APPLE;
        switch(type){
        case APPLE:
            System.out.println(57 + " kcal, " + Fruit.APPLE.getColor());
            break;
        case PEACH:
            System.out.println(34 + " kcal" + Fruit.PEACH.getColor());
            break;
        case BANANA:
            System.out.println(93 + " kcal" + Fruit.BANANA.getColor());
            break;
        }

        System.out.println("---------enum 반복문---------");
        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }        
        
        //class 사용하기
        System.out.println("---------class 사용하기---------");
        FruitClass typeClass = FruitClass.APPLE;
        switch(typeClass.type){
        case "APPLE":
            System.out.println("[Class Type] " + 57 + " kcal, " + FruitClass.APPLE.color);
            break;
        case "PEACH":
            System.out.println("[Class Type] " + 34+" kcal"+FruitClass.PEACH.color);
            break;
        case "BANANA":
            System.out.println("[Class Type] " + 93+" kcal"+FruitClass.BANANA.color);
            break;
        }  
	}
}

	