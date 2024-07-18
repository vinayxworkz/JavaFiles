class BatRunner{
	public static void main(String[]args){
		
		if(args.length==2){
		System.out.println("2 args given");
		System.out.println("Running main");
		String name = args[0];
		String id = "name";
		
		double convertedDouble = Double.parseDouble(id);
		
		Bat.cat(name,convertedDouble);
		}
		else{
			System.out.println("need 2 args");
		}
	}
}