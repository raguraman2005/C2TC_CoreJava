package dayfive;
import java.io.*;
public class bufferReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("src/ifet.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
	    System.out.println(s);

	}

}
