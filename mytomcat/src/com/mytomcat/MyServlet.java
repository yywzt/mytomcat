package com.mytomcat;

/**
 * @author ywyw2424@foxmail.com
 * @date 2018/9/19 10:24
 * @desc
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest,MyResponse myResponse){
        if(myRequest.getMethod().equalsIgnoreCase("GET")){
            doGet(myRequest, myResponse);
        }else if(myRequest.getMethod().equalsIgnoreCase("POST")){
            doPost(myRequest, myResponse);
        }
    }
}
