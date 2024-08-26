import com.sun.net.httpserver.HttpServer;
import com.unimater.controller.HelloWorldHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
public class Main {
    public static void main(String[] args) {
        try{
        HttpServer servidor = HttpServer.create(
                new InetSocketAddress(8080),0
        );
        servidor.createContext("/HelloWorld",new HelloWorldHandler());
servidor.setExecutor(null);
        servidor.start();
        System.out.println("servidor rodando na porta 8080h");
    }catch (IOException e){
            System.out.println(e);
}}}