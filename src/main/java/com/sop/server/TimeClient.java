package com.sop.server;

import java.io.BufferedReader;
import java.net.Socket;

/**
 * @Description TODO
 * @Author zjm
 * @Date 2019/3/9 22:33
 * @Version 1.0
 **/
public class TimeClient {
    public  static  void main(String[] args){
        int port = 8080;
        if (args != null && args.length > 0){
            try {
                port = Integer.valueOf(args[0]);
            }catch (NumberFormatException e){

            }
        }
        Socket socket = null;
        BufferedReader in = null;
    }
}
