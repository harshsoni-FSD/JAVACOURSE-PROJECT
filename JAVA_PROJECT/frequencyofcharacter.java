public class frequencyofcharacter {
    public static void main(String[] args) {
        String str="Schoolll";
        int []freq=new int[256];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c]++;

            
        }
        char maxChar=0;
        int maxfreq=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxfreq){
                maxChar=(char)i;
                //System.out.println(maxChar);
                maxfreq=freq[i];
            }
        }

        System.out.println("maximum freq character is "+ maxChar );

    }
}
