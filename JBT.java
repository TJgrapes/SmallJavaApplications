class JBT {
	public static void main(String[] args) {
		JBT obj = new JBT();
		obj.methodTwo();
	}
	void methodOne(){
		System.out.println("Inside Method ONE");
		}
	void methodTwo(){
		System.out.println("Inside Method TWO");
		methodOne();// same as calling methodOne()
	}
}