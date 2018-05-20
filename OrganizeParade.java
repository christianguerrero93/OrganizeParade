
public class OrganizeParade {
	
	public static int organizeParade(int lengthOfParade){
		if(lengthOfParade == 1){
			return 2; //  F  || B
		}
		else if(lengthOfParade == 2){
			return 3;
		}
		else{
			return ( organizeParade(lengthOfParade-1) +  organizeParade(lengthOfParade-2) );
		}
	}

}
