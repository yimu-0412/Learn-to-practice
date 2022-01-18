import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-16-10:29
 */
public class HttpClient {
    private Socket socket;
    private String ip;
    private int port;

    public HttpClient(String ip,int port) throws IOException {
        this.ip = ip;
        this.port = port;
        this.socket = new Socket(ip,port);
    }

    public String get(String url) throws IOException {
        StringBuilder request = new StringBuilder();
        // 构造首行
        request.append("GET" + url + "HTTP/1.1\n");
        // 构造 header
        request.append("Host"  + ip + ":" + port + "\n");
        // GET 请求不需要 body，就构造完毕了
        request.append("\n");

        // 发送数据
        OutputStream outputStream = socket.getOutputStream();
        // outputStream 是一个字节流，以字节为单位进行写入，因此需要把 StringBulider 转换成 byte[]
        outputStream.write(request.toString().getBytes());

        // 读取响应数据
        InputStream inputStream = socket.getInputStream();
        // 建立 1M 大小的缓存区，存放响应数据
        byte[] buffer = new byte[1024 * 1024];
        // n 表示读到的字节数
        int n = inputStream.read(buffer);
        return new String(buffer,0,n,"utf-8");

    }

    // post 的实现和 GET 的实现基本一致，只是多了一步构造 body
    public String post(String url,String  body) throws IOException {
        StringBuilder request = new StringBuilder();
        // 构造首行
        request.append("POST" + url + "HTTP/1.1\n");
        // 构造 header
        request.append("Host"  + ip + ":" + port + "\n");
        request.append("Content-Type:text/html\n");
        request.append("Content-length:" + body.getBytes().length + "\n");
        // 构造空行
        request.append("\n");
        // 构造 body
        request.append(body);

        // 发送数据
        OutputStream outputStream = socket.getOutputStream();
        // outputStream 是一个字节流，以字节为单位进行写入，因此需要把 StringBulider 转换成 byte[]
        outputStream.write(request.toString().getBytes());

        // 读取响应数据
        InputStream inputStream = socket.getInputStream();
        // 建立 1M 大小的缓存区，存放响应数据
        byte[] buffer = new byte[1024 * 1024];
        // n 表示读到的字节数
        int n = inputStream.read(buffer);
        return new String(buffer,0,n,"utf-8");


    }

    public static void main(String[] args) throws Exception {
        HttpClient httpClient = new HttpClient("183.36.114.45",80);
        /*String resp1 = httpClient.get("/index.html");
        System.out.println(resp1);*/
        // System.out.println();
        String resp2 = httpClient.post("/index.html","这是正文");
        System.out.println(resp2);

    }
}
