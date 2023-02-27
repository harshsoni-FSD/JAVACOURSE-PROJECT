public class pwassignment {
    public static void main(String[] args) {
        int n=11;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //i==0 && j>0 && j<(n-1)/2
                if(j==0||j==n-1||i==0||i+j<=(n-1)/2||j-i>=(n-1)/2||i==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
