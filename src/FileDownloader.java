import java.io.*;
import java.net.*;
import java.nio.file.*;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String destination) {
        try{
            //tao url object tu url
            URL fileUrl = new URL(url);
            //Mo ket noi
            URLConnection connection = fileUrl.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);
            //Doc du lieu tu url
            InputStream inputStream = connection.getInputStream();
            Path outputPath = Paths.get(destination);
            //Luu file vao he thong
            Files.copy(inputStream, outputPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File downloaded to: " + destination);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
