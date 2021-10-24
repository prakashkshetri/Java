package String;

public class Array_2d {

	public static void main(String[] args) {
//		************** Addition of 2D Array ****************
        int[][] ary1 = {{15,25,35}, {45, 55, 65}};
        int[][] ary2 = {{12,22,32}, {55, 25, 85}};
        int [][] sum = new int[2][3];
        int a; int b;
        for(a=0; a<ary1.length; a++){
            for(b=0; b<ary1[a].length; b++){
                sum[a][b] = ary1[a][b] + ary2[a][b];
            }
        }
        for(a=0; a<ary1.length; a++){
        	for(b=0;b<ary1[a].length; b++){
        		System.out.printf("%d \t", sum[a][b]); //System.out.format(%d \t, sum[a][b])
        	}
        		System.out.println();
        }

    }
}





