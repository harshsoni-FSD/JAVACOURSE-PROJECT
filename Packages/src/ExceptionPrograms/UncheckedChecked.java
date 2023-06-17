package ExceptionPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;

public class UncheckedChecked {
    public static void main(String[] args) {
       // int result=10/0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String s=br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
