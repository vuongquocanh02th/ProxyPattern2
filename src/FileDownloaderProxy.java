public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        // Sử dụng User-Agent của Firefox
        this.fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
    }

    @Override
    public void download(String url, String destination) {
        // Gọi phương thức download của FileDownloader
        fileDownloader.download(url, destination);
    }
}
