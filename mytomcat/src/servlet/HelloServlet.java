package servlet;

import com.mytomcat.MyRequest;
import com.mytomcat.MyResponse;
import com.mytomcat.MyServlet;

import java.io.IOException;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/19 10:44
 * @desc
 */
public class HelloServlet extends MyServlet {


    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get method...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get method...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
