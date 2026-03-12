public class Main
{
	public static void main(String[] args) {
	    int[] freqDATA=new int [Character.MAX_VALUE];
		String str="You can't change me";
		for(int i=0;i<str.length();i++){
		    try {
		        freqDATA[str.charAt(i)]++;
		        
		    } catch(StringIndexOutOfBoundsException e) {
		        System.out.println("indexeror detected :"+ i+ "not in range "+"");
		    }
		}
		System.out.println("Character frequency for string:\"");
		for(int i=0;i<freqDATA.length();i++){
		    if(freqDATA[i] !=0)
		    {
		        System.out.println((char)i+"(code "+i+"):"+freqDATA);
		    }
		}
	}
}
