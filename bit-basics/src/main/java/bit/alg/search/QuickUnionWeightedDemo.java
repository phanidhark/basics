package bit.alg.search;

/**
 * This is the hybrid version of quick union ,we calculate the weight and merge the tree 
 * instead of making large straigt trees
 * @author phanidhar
 *
 */
public class QuickUnionWeightedDemo {
	int array[];
	int size[];
	public QuickUnionWeightedDemo(int length) {
		array = new int[length];
		size = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			size[i] = i;
		}
	}

	/**
	 * 
	 * @param i
	 * @return This methods returns the root element of i, if root element root
	 *         is not same then it increments other wise one level up and check
	 *         for their root
	 */
	private int root(int i) {
		while (i != array[i])
			i = array[i];
		return i;
	}
	
	/**
	 * Please understand the logic carefully
	 * if root of p & q are same then no they are already connected
	 * based on the size we need to merge the array values and their size of the elements
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ  = root(q);
		if(rootP == rootQ)return;
		
		if(size[rootP]<size[rootQ]){
			array[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
		else{
			array[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}
		
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
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

	public static void print(int print[]) {
		System.out.println();
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i] + " ");
		}
	}
}