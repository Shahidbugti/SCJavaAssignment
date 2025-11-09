package Figures;



interface CloudHostingProvider {
    void createServer(String region);
    void liveServer();
}

interface CDNProvider {
    void getCDNAddress();
}

interface CloudStorageProvider {
    void storeFile(String fileName);
    void getFile(String fileName);
}

// Amazon provides hosting, CDN, and storage
class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    public void createServer(String region) {
        System.out.println("Amazon: Created server in region " + region);
    }

    public void liveServer() {
        System.out.println("Amazon: Server is live now");
    }

    public void getCDNAddress() {
        System.out.println("Amazon: CDN address is cdn.amazon.com");
    }

    public void storeFile(String fileName) {
        System.out.println("Amazon: Stored file '" + fileName + "'");
    }

    public void getFile(String fileName) {
        System.out.println("Amazon: Retrieved file '" + fileName + "'");
    }
}

// Dropbox provides only storage
class Dropbox implements CloudStorageProvider {

    public void storeFile(String fileName) {
        System.out.println("Dropbox: Stored file '" + fileName + "'");
    }

    public void getFile(String fileName) {
        System.out.println("Dropbox: Retrieved file '" + fileName + "'");
    }
}

public class Fig1 {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();
        Dropbox dropbox = new Dropbox();

        // Amazon full services
        amazon.createServer("US-East");
        amazon.liveServer();
        amazon.getCDNAddress();
        amazon.storeFile("report.pdf");
        amazon.getFile("report.pdf");

        System.out.println("------------------------");

        // Dropbox storage only
        dropbox.storeFile("photo.png");
        dropbox.getFile("photo.png");
    }
}
