
public class Checkpoint {
	public static void main(String[] args) {
		System.out.println("(Microphone Static) Testing, attention please");
		System.out.println("HI");
	}
	void doubletake(Double[] morethanonce){
		for(int i = 0; i < morethanonce.length; i++) {
			for(int j = 0; j < morethanonce.length - i - 1; j++) {
				if(morethanonce[j] < morethanonce[j+1]) {
					
				}
				else {
					double temp = morethanonce[j];
					morethanonce[j] = morethanonce[j+1];
					morethanonce[j+1] = temp;
				}
		}
	}
}
	boolean integertake(int[] inttakeem, int g) {
		for(int i = 0; i < inttakeem.length; i++) {
			for(int j = 0; j < inttakeem.length - i - 1; j++) {
				if(inttakeem[j] == g) {
					return true;
					
				}
				else {
					int temp = inttakeem[j];
					inttakeem[j] = inttakeem[j+1];
					inttakeem[j+1] = temp;
				}	
		}
		
	}
		return false;
	}
}
