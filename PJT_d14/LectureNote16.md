## 통신 : 네트워크 프로그램 - 서로 데이터 주고받음
* 클라이언트와 서버
    * 클라이언트 : 접속시도
    * 서버 : 접속 기다림
    * 서버가 클라이언트의 주소를 알고 있어야 접속가능
    * 클라이언트가 알맞는 패스워드(port)를 가지고 있어야 접속가능

* ServerSocket : 대장소켓
* InetSocketAddress
    * bind : 나의 주소를 알려주겠습니다.

```java
    package pack;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server
{
    public static void main(String[] args)
    {
        System.out.println("Server");
        new Scanner(System.in).nextInt();
        ServerSocket mss = null;
        try
        {
            mss = new ServerSocket();//대장소켓
            //localhost >> 192.168.98.13
            mss.bind(new InetSocketAddress("localhost", 5001));
            System.out.println("binding complete");

            //wait: a blocking method 누군가 접속하면  blocking 풀림
            Socket ss = mss.accept();
            System.out.println("Someone linked");
        } catch (Exception e) {}
        System.out.println("Server terminated");
    }
}

    ```