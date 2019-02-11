
 class SingletonPattern {

	public static void main(String[] args) {
		Abc obj=Abc.getInstance();
		Abc obj1=Abc.getInstance();
		System.out.println(obj);
		System.out.println(obj1);
		
	}
	
}
 class Abc {
	public static Abc obj;
	int i;
	
	private Abc() {
		System.out.println("Abc created");
	}
	public static Abc getInstance() {
		if(obj==null){

	obj=new Abc();
	}
		return obj;
	}
}