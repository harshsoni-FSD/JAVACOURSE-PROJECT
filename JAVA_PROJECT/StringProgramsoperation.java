public class StringProgramsoperation {
    public static void main(String[] args) {
        String str1="PWJAVA";
        String str2="";
        String str3="PWSKILL JAVA";
        String str4="";
        String str5="";
        String str6="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
            
        }
        System.out.println(str2);
    

    String arr[]=str3.split(" ");
    for(int j=arr.length-1;j>=0;j--){
            str4=str4+arr[j]+" ";
            
        }
         System.out.println("Before manupulation12:::"+str3);
        System.out.println("After manupulation:::"+str4);



         for(int j=str3.length()-1;j>=0;j--){
            str5=str5+str3.charAt(j);
            
        }
         System.out.println("Before manupulation:::"+str3);
        System.out.println("After manupulation:::"+str5);
        /////////////////////case4/////////////////
        String arr1[]=str3.split(" ");
        for(String elem:arr){
             for(int j=elem.length()-1;j>=0;j--){
            str6=str6+elem.charAt(j);
            
                }
                str6=str6+" ";
        
        }
         System.out.println("Before manupulation:::"+str3);
        System.out.println("After manupulation:::"+str6);
    }
}
