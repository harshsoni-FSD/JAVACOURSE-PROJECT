public class array {
    public static void main(String[] args) {
        int nums[]={5,6,7,8,9};
        for(int i=0;i<5;i++){
        System.out.println(nums[i]);}
            //jagged array declaration
            int num [][]= new int[3][];
            num[0]=new int[5];
            num[1]=new int[4];
            num[2]=new int[6];
       // int nums2[][]=new int[3][2];
       int nums2[][]={
        {5,2,7,8},{4,1},{9,7,0}
       };
        for(int i=0;i<=2;i++){
            for(int j=0;j<nums2[i].length;j++){
                System.out.print(nums2[i][j]);
            }
            System.out.println();
        }

        //////////for Each loop or enhanced for loop

        int beta[]={6,4,4,5,6,6};
        for(int n:beta){
            System.out.println(n);
        }

        /// for each loop for 2d array
        int nums3[][]={
        {5,2,7,8},{4,1,4,7},{9,7,0,6}
       };
       for(int a[]:nums3){
         for(int b:a){
                System.out.print(b + "");
            }
            System.out.println();

       }
    }
}
