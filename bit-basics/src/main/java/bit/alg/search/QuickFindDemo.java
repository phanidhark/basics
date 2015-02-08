package bit.alg.search;

/**
 * 
 * @author phanidhar
 * This is used for dynamic connectivity problem ,
 * union (p,q) -> connected p and q nodes , p array values will be replaced by q array value
 * connected(p,q) -> verifies the connected between p and q nodes
 * This algorithm is used to find out the path exist in between two nodes ,dynamic connectivity problem
 */

public class QuickFindDemo {
	int array[];
	
	public QuickFindDemo(int length){
		array = new int[length];
		for(int i=0;i<length;i++){
			array[i] = i;
		}
	}
	
	public boolean connected(int p, int q){
		return array[p]==array[q];
	}
	
	public void union(int p, int q){
		System.out.println();
		
		int pid = array[p];
		int qid = array[q];
		for (int i = 0; i < array.length; i++) {
			if(array[i]== pid){
				System.out.print(array[i]+" to "+qid+" ");
				array[i] = qid;}
		}
	}
	
	public static void main(String[] args) {
		QuickFindDemo qf = new QuickFindDemo(10);
		print(qf.array);
		qf.union(4, 5);
		qf.union(5, 3);
		qf.union(3, 6);
		qf.union(1, 9);
		print(qf.array);
		System.out.println(qf.connected(4, 6));
		System.out.println(qf.connected(4, 9));
	}
	
	public static void print(int print[]){
		System.out.println();
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i]+" ");
		}
	}
}
