package p2;


	public class ZooWorker {
		/*public static void feed(Reptile reptile) {
			System.out.println("Feeding reptile " + reptile.getName());
			if (reptile instanceof Crocodile){
				((Crocodile)reptile).swim();
			}
		}*/
		
		public static void feed(Crocodile  reptile) {
			System.out.println("Feeding reptile " + reptile.getName());			
				((Crocodile)reptile).swim();
			
		}
		public static void feed(Alligator  reptile) {
			System.out.println("Feeding reptile " + reptile.getName());
			
		}
		
		

		public static void main(String[] args) {
			feed(new Alligator());
			feed(new Crocodile());
			//feed(new Reptile());
		}
	}


