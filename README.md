# Socket-programming-using-TCP

Network-based systems consist of a server, client, and a media for communication. A  computer running a program that makes a request for services is called client machine. A computer  running a program that offers requested services from one or more clients is called server machine.  The media for communication can be wired or wireless network. Generally, programs running on  client machines make requests to a program (often called as server program) running on a server  machine. They involve networking services provided by the transport layer, which is part of the  Internet software stack, often called TCP/IP (Transport Control Protocol/Internet Protocol) stack.  The transport layer comprises two types of protocols, TCP (Transport Control Protocol) and UDP  (User Datagram Protocol). The most widely used programming interfaces for these protocols are  sockets. TCP is a connection-oriented protocol that provides a reliable flow of data between two  computers. Example applications that use such services are HTTP, FTP, and Telnet.  
A socket is an endpoint of a two-way communication link between two programs running  on the network. Socket is bound to a port number so that the TCP layer can identify the application  that data is destined to be sent. Sockets provide an interface for programming networks at the  transport layer. Network communication using Sockets is very much similar to performing fi le  I/O. In fact, socket handle is treated like fi le handle. The streams used in fi le I/O operation are  also applicable to socket-based I/O. Socket-based communication is independent of a  programming language used for implementing it. That means, a socket program written in Java  language can communicate to a program written in non-Java (say C or C++) socket program. A  server (program) runs on a specific computer and has a socket that is bound to a specific port. The  server listens to the socket for a client to make a connection request. If everything goes well, the  server accepts the connection. Upon acceptance, the server gets a new socket bound to a different  port. It needs a new socket (consequently a different port number) so that it can continue to listen  to the original socket for connection requests while serving the connected client. 
The two key classes from the java.net package used in creation of server and client  programs are:  
• ServerSocket 
• Socket 
A server program creates a specific type of socket that is used to listen for client requests (server  socket). In the case of a connection request, the program creates a new socket through which it  will exchange data with the client using input and output streams. The socket abstraction is very 
22 

similar to the fi le concept: developers have to open a socket, perform I/O, and close 

 Algorithm 
• TCP Server: 
1. Create server socket 
2. Wait for client request 
3. If client request received then  
a. Get message from client’s input stream 
b. Write acknowledgement to client’s output stream 
c. Close client 
• TCP Client: 
1. Create client socket 
2. Read input from user and send it to server 
3. Print acknowledgement 

