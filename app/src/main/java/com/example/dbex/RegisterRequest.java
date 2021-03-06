package com.example.dbex;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest { //가입부분에서 던질 부분 만들기

    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://10.0.2.2/Register.php";
    private Map<String, String> map;


    public RegisterRequest(String userID, String userPassword, String userName, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}