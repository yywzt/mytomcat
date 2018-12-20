package com.mytomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/19 10:11
 * @desc
 */
public class MyRequest {

    private String url;
    private String method;

    public MyRequest(InputStream inputStream) throws IOException {
        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length=0;
        if((length = inputStream.read(httpRequestBytes)) > 0){
            httpRequest = new String(httpRequestBytes,0,length);
        }

//        GET /hello HTTP/1.1
//        Host: localhost:8080
//        Connection: keep-alive
//        Cache-Control: max-age=0
//        Upgrade-Insecure-Requests: 1
//        User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.92 Safari/537.36
//        Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//        Accept-Encoding: gzip, deflate, br
//        Accept-Language: zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7
//        Cookie: Idea-b5163d1e=2dbc64ce-4e33-4560-be31-cc923e4a8f29; Idea-417e815e=74ae7a34-d835-44e6-ab2c-616e13c00100

        try {
            String httpHead = httpRequest.split("\n")[0];
            url = httpHead.split("\\s")[1];
            method = httpHead.split("\\s")[0];
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("none request");
        }
        System.out.println(this);
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

}
