import java.io.*;
import java.net.*;

public class clientlb{
	public static void main(String []args) throws IOException{
	Socket clientlb = new Socket("192.168.234.129",1234);
	DataOutputStream outtoserver=new DataOutputStream(clientlb.getOutputStream());
	BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
	String sentence=infromuser.readLine();
	outtoserver.writeBytes(sentence);
	clientlb.close();
}
}
