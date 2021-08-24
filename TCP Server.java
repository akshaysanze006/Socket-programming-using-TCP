import java.io.*; 
import java.net.*; 
public class Tcpserver extends Thread 
{ 
Thread t1,t2; 
BufferedReader br,buf; 
PrintWriter pout; 
String str,a; 
ServerSocket server; 
Socket client; 
Tcpserver() 
{ 
try 
{ 
server=new ServerSocket(5555); 
client=server.accept();
23 

br=new BufferedReader(new  
InputStreamReader(System.in)); 
buf=new BufferedReader(new  
InputStreamReader(client.getInputStream())); 
pout=new PrintWriter(client.getOutputStream(),true); 
} 
catch(Exception e) 
{ System.out.println("error :"+e); 
} 
} 
public void run() 
{ 
while(true) 
{ 
if(Thread.currentThread()==t1) 
{ 
try 
{ 
str=br.readLine(); 
pout.println(str); 
} 
catch(Exception e) 
{ System.out.println("error :"+e); 
} 
} 
else 
{ 
try 
{ 
a=buf.readLine(); 
System.out.println("from client :"+a); 
} 
catch(Exception e) 
{ System.out.println("error :"+e); 
} 
} 
} 
} 
public static void main(String args[]) 
{ Tcpserver s=new Tcpserver(); 
s.t1=new Thread(s); 
s.t2=new Thread(s);
24 

s.t1.start(); 
s.t2.start(); 
} 
} 
