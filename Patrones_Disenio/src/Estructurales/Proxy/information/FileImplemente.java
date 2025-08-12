package Estructurales.Proxy.information;

import Estructurales.Flyweight.databases.Databases;

import java.io.*;

public class FileImplemente implements  FileDatabase{

    private InformationDatabase informationDatabase;

    public InformationDatabase getInformationDatabase() {
        return informationDatabase;
    }

    public void setInformationDatabase(InformationDatabase informationDatabase) {
        this.informationDatabase = informationDatabase;
    }

    @Override
    public void write(String name) {

        try {
            writeObject(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public InformationDatabase load(String name) {
        try {
            setInformationDatabase((InformationDatabase) readObjct(name));
            return getInformationDatabase();
        } catch (RuntimeException | IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private void
    writeObject(String name) throws IOException {
        FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(getInformationDatabase());
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    private Object readObjct(String name) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object stats = ois.readObject();
        ois.close();
        fis.close();
        return stats;
    }

    public void newFile(String name){
        File file = new File(name);
        informationDatabase = new InformationDatabase();
        informationDatabase.setName(name);
        informationDatabase.setType("Any");
        informationDatabase.setNumberConnection(1);
        informationDatabase.setNumberSelect(1);
    }


}
