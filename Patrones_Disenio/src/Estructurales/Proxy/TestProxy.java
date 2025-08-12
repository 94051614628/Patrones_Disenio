package Estructurales.Proxy;

import Estructurales.Proxy.information.FileImplemente;

public class TestProxy {
    public static void main(String[] args) {
       var  fileImplemente = new FileImplemente();
       fileImplemente.newFile("Postgres");
       ProxyDatabase proxyDatabase = new ProxyDatabase(fileImplemente);

       proxyDatabase.load("Postgres");
       System.out.println(proxyDatabase.getInformationDatabase().toString());

       proxyDatabase.getInformationDatabase().setNumberSelect(10);
       proxyDatabase.getInformationDatabase().setNumberConnection(50);

       proxyDatabase.write("Postgres");
       proxyDatabase.load("Postgres");
       System.out.println(proxyDatabase.getInformationDatabase().toString());




    }
}
