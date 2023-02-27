public class Pangram {
    public static void main(String[] args) {
        boolean flag=false;
        String str="The QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str=str.replace(" ","");
        str=str.toUpperCase();
       char c[]= str.toCharArray();
       int arr1[]=new int[26];
       for(int i=0;i<c.length;i++){
        arr1[c[i]-65]++;
       }
       System.out.println(arr1);
       for(int a : arr1){
        System.out.println("a==A");
        if(arr1[a]==0){
            System.out.println("sting is not pangram");
            flag=true;
        }
        // else{
        //     System.out.println("String is pengram");
        // }
       }
       if(flag==false)
       System.out.println("It is pangram");
       

String s1= "Java";

String s2=new String("java"); 

//line-1
s1=s2;
//if(s1.equalsIgnoreCase(s2))
if(s1==s2)
{

System.out.println("equal");

}else{

System.out.println("not equal");

}

 




// String s1=s2;

// if(s1==s2)


 


    }
}
