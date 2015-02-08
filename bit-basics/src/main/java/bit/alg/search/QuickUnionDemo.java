package bit.alg.search;

/**
 * 
 * @author phanidhar
 * This is used for dynamic connectivity problem ,
 * union (p,q) -> connects p and q nodes , p value will be changed by q
 * connected(p,q) -> verifies the connected between p and q nodes,verifies the root of p and root of q are same
 * This algorithm is used to find out the path exist in between two nodes ,dynamic connectivity problem
 * Union is fast , finding connectivity is slow
 */

public class QuickUnionDemo {
	int array[];
	
	public QuickUnionDemo(int length){
		array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}
	
	/**
	 * 
	 * @param i
	 * @return
	 * This methods returns the root element of i, 
	 * if root element root is not same then it increments other wise one level up and check for their root
	 */
	private int root(int i){
		while(i!= array[i]) i = array[i];
		return i;
	}
	
	public void union(int p , int q){
		array[p] = array[q];
	}
	
	public boolean connected(int p, int q){
		int i = root(p);
		int j = root(q);
		return i ==j;
	}
	
	public static void main(String[] args) {
		QuickUnionDemo qu = new QuickUnionDemo(10);
		print(qu.array);
		qu.union(4, 5);
		qu.union(5, 3);
		qu.union(3, 6);
		qu.union(4, 9);
		print(qu.array);
		System.out.println(qu.connected(4, 6));
		System.out.println(qu.connected(4, 9));
	}
	
	public static void print(int print[]){
		System.out.println();
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i]+" ");
		}
	}
}
