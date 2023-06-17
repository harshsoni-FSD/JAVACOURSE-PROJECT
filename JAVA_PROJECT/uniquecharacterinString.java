public class uniquecharacterinString {
    


    public static void main(String[] args) {
        boolean flag=false;

        String str="SSchol";
        
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=true;
                    break;
                }
            }

        }
        if(flag==true){
            System.out.println("string dont have unique");
        }
        else{
            System.out.println("string have unique");
        }
      
    }
}
