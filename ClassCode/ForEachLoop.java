
public class ForEachLoop {

	public static void main(String[] args) {
		
		int[]listA = {5,10,15,20,25,30,35};
		int[]listB = {4,5,1,10,22,20,30};
		int[]listC = new int[listA.length];
		int values = 0;
		for(int i : listA) {
			
			for(int j : listB) {
				
				if (i ==j) {
					listC[values] = i;
					values++;
				}
			}
		}
		for(int c: listC) {
			System.out.println(c);
		}
	}
}
