public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String s="School";
        String s1="";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int j=0;
            for(j=0;j<i;j++){
                if(ch[i]==ch[j]){
                    break;
                }


            }
            if(i==j){

                s1=s1+ch[i];
            }
        }
        System.out.println(s1);
    }
}
