package Estructurales.Proxy;

import Estructurales.Proxy.information.FileDatabase;
import Estructurales.Proxy.information.FileImplemente;
import Estructurales.Proxy.information.InformationDatabase;

public class ProxyDatabase implements FileDatabase {
    private InformationDatabase informationDatabase;
    private FileImplemente fileImplemente;

    public ProxyDatabase(FileImplemente fileImplemente) {
        this.fileImplemente = fileImplemente;
    }

    public InformationDatabase getInformationDatabase() {
        return informationDatabase;
    }

    public void setInformationDatabase(InformationDatabase informationDatabase) {
        this.informationDatabase = informationDatabase;
    }

    public FileImplemente getFileImplemente() {
        return fileImplemente;
    }

    public void setFileImplemente(FileImplemente fileImplemente) {
        this.fileImplemente = fileImplemente;
    }


    @Override
    public void write(String name) {

        fileImplemente.setInformationDatabase(informationDatabase);
        fileImplemente.write(name);
    }

    @Override
    public InformationDatabase load(String name) {
        setInformationDatabase(fileImplemente.getInformationDatabase());
        return getInformationDatabase();
    }
}
