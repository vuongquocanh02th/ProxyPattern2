public class Client {
    public static void main(String[] args) {
        // Tạo đối tượng proxy
        Downloader downloader = new FileDownloaderProxy();

        // Địa chỉ URL và nơi lưu trữ file
        String url = "https://example.com/file-to-download.jpg";
        String destination = "downloaded_file.jpg";

        // Gọi phương thức download() mà không cần truyền User-Agent
        downloader.download(url, destination);
    }
}
