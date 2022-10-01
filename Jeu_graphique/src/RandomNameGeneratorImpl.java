import java.util.Random;

public class RandomNameGeneratorImpl {

	Random r;
	String letters;
	
	public RandomNameGeneratorImpl()
    {
        r = new Random();
        letters = "abcdefghijklmnopqrstuvwxyz";
         
    }
	
	public String createName() {
	StringBuilder nom = new StringBuilder("") ;
    for(int i = 0; i < 8; i++)
    {
        nom.append(letters.charAt(r.nextInt(letters.length())));
    }

    return nom.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
