package queue;

public class ArrayRotation {

	public static void main(String[] args) {
int[] ary = {90, 43, 32, 21, 88};
		
		int n = 1;
		System.out.println("Array: ");
		for(int i = 0; i<ary.length; i++) {
			System.out.print(ary[i]+ " ");
		}
		for(int i=0; i<n; i++) {
			int j, last;
			last=ary[ary.length-1];
			for(j = ary.length-1; j>0; j--) {
				ary[j]= ary[j-1];
			}
			ary[0] = last;
		}
		System.out.println();
		System.out.println("After Rotation: ");
		for(int i = 0; i<ary.length; i++) {
			System.out.print(ary[i]+ " ");
		}
		

	}

}
