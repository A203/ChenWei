package com.example.user001.bmi;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import java.text.DecimalFormat;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
public class MainActivity extends Activity {

    EditText fieldheight;
    EditText fieldweight;
    TextView result;
    TextView fieldsuggest;

    private  Button button;

    private Button bt_clear;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳转第二个界面(第一个参数Context,第二个参数是目标对象)
                   //封装Intent对象(第一个参数Context,第二个参数是目标对象)
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);
                //启动Activity
                startActivity(intent);
            }
        });

        final String str1 = "";
        Button button=(Button)findViewById(R.id.submit);
        bt_clear=(Button)findViewById(R.id.bt_clear);
        button.setOnClickListener(calcBMI);
        bt_clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }

            private void clear() {
                fieldheight.setText(str1);
                fieldweight.setText(str1);
                result.setText(str1);
                fieldsuggest.setText(str1);
            }
        });
    }
    private OnClickListener calcBMI=new OnClickListener(){
        public void onClick(View v){
            DecimalFormat nf=new DecimalFormat("0.00");
            fieldheight=(EditText)findViewById(R.id.height);
            fieldweight=(EditText)findViewById(R.id.weight);
            double height=Double.parseDouble(fieldheight.getText().toString())/100;
            double weight=Double.parseDouble(fieldweight.getText().toString());
            double BMI=weight/(height*height);

            result=(TextView)findViewById(R.id.result);
            result.setText("您的BMI值是:"+nf.format(BMI));

            fieldsuggest=(TextView)findViewById(R.id.suggest);
            if(BMI>=28){
                fieldsuggest.setText(R.string.suggest_fat);
            }else if(BMI<=27.9 && BMI>=24){
                fieldsuggest.setText(R.string.suggest_heavy);
            }else if (BMI<=23.9 && BMI>=18.5){
                fieldsuggest.setText(R.string.suggest_average);
            } else {
                fieldsuggest.setText(R.string.suggest_light);
            }
        }
    };
}

