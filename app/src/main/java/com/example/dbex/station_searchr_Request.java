package com.example.dbex;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class station_searchr_Request extends StringRequest {
    //서버 url 설정(php파일 연동)
    final static  private String URL="http://10.0.2.2/station_search.php";
    private Map<String, String> map;

    public station_searchr_Request(String UserEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener,null);

        map = new HashMap<>();
        map.put("ID", UserEmail);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}