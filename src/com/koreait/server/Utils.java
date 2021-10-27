package com.koreait.server;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

    public static String getJson(HttpServletRequest req) throws IOException {
        String reqStr = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = req.getInputStream();
            if(inputStream != null){
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer =
        }

    }


}
