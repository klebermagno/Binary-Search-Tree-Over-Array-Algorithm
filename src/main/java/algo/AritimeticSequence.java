package algo;

public class AritimeticSequence {

	public static void main(String[] args) {
		
		int[] seq = {1,2,3,6};
		
		if(isArqSeq(seq)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		

	}

	private static boolean isArqSeq(int[] seq) {
		if(seq.length <= 1)
			return true;
		
		int progression  = seq[0]-seq[1];
		for(int i = 1 ; i < seq.length-1; i++){
			if(progression != seq[i]-seq[i+1])
				return false;
			
		}
		return true;
	}
}
