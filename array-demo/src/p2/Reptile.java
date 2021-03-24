package p2;

 interface Reptile {
	public String getName() ;

}

class Alligator implements Reptile {
	public String getName() {
		return "Alligator";
	}
}

class Crocodile implements Reptile {
	public String getName() {
		return "Crocodile";
	}
	public void swim(){
		System.out.println("crocodile specific method called");
	}
}



