package com.example.dbex;

import com.android.volley.Request;
import com.android.volley.Response;

import java.util.HashMap;
import java.util.Map;

public class pension { //패션 의 모든값 출력을 위해 던질 부분 만들기

    final static private String URL =  "http://10.0.2.2/pension.php";
    private Map<String,String> map;

    public pension(String ID, Response.Listener<String> listener){
        //super(Request.Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("ID",ID);

    }

}
