package com.example.microproyecto;

 import android.support.annotation.Nullable;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    private button btnScanner;
    private TextView tvBarCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        btnScanner = findViewById(R.id.btnScanner);
        tvBarCode = findViewById(R.id.tvBarcode);

        btnScaanner.setOnClickListener(mOnClickListener);

    }

    @Override
    protected void  onActivityResult(int requesCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requesCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requesCode, resultCode, data);
        if (result  != null)
            if (result.getContext() != null){
                tvBarCode.setText("El codigo de barras es"+ result.getContents());

            }else{
                tvBarCode.setText("error escaner:");
            }
        }
    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btnScanner;
                new IntentIntegrador(activity MainActivity.this).initiateScan();
                break;
            }
        }
    };
}

