public class Stringquestiontocountvovelsconsonets {
    

public class string {
    public static void main(String[] args) {
        String s="Hello have a good day";
       int  vovelscount=0;
       int  consonetscount=0;
       int specialchar=0;
   
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
            vovelscount++;
        }
        else if(ch==' '||ch=='@'||ch=='/'){
            specialchar++;
        }
        else{
            consonetscount++;
        }
      }
      System.out.println(vovelscount);
      System.out.println(specialchar);
      System.out.println(consonetscount);
   
    }
    
}

}
