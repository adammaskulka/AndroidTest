package com.example.adammaskulka.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.adammaskulka.androidtest.rest.RestApiClient;
import com.example.adammaskulka.androidtest.rest.RestApiInterface;
import com.example.adammaskulka.androidtest.rest.model.ApiResponse;

import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private RestApiInterface restApiService;
    private Call<ApiResponse> call_1;
    private Call<ApiResponse> call_2;
    private Call<ApiResponse> call_3;
    private Call<ApiResponse> call_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        restApiService = RestApiClient.getClient().create(RestApiInterface.class);

        call_1 = restApiService.call_1();
        call_2 = restApiService.call_2();
        call_3 = restApiService.call_3();
        call_4 = restApiService.call_4();
    }

    @OnClick(R.id.button1)
    public void call1() {
        Log.d(TAG, "call1() called");

        call_1.clone().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");

                Toast.makeText(MainActivity.this,response.body().getValue(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");

            }
        });

    }

    @OnClick(R.id.button2)
    public void call2() {
        Log.d(TAG, "call2() called");

        call_2.clone().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");

                Toast.makeText(MainActivity.this,response.body().getValue(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");

            }
        });

    }

    @OnClick(R.id.button3)
    public void call3() {
        Log.d(TAG, "call3() called");

        call_3.clone().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");

                Toast.makeText(MainActivity.this,response.body().getValue(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");

            }
        });

    }

    @OnClick(R.id.button4)
    public void call4() {
        Log.d(TAG, "call4() called");

        call_4.clone().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");

                Toast.makeText(MainActivity.this,response.body().getValue(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");

            }
        });

    }


}
