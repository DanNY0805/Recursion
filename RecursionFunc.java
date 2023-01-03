class RecursionFunc {
	
	public int RecursionChallenge(int num) {
    if (num == 1) {
        return 1;
    }
    return num * RecursionChallenge(num - 1);
}
public static void main(String []args){
	  RecursionFunc rf = new RecursionFunc();
	 int result = rf.RecursionChallenge(5);
	 System.out.println(result);
}
}