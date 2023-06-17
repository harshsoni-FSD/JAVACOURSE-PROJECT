import javax.annotation.processing.ProcessingEnvironment;

public class removeduplicatesecondway {
    public static void main(String[] args) {
        String str="helloWorld";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            String str3=Character.toString(str.charAt(i));
           
            if(sb.indexOf(str3)==-1){
                sb.append(str3);
            }

        }
        System.out.print(sb.toString());
    }
}
