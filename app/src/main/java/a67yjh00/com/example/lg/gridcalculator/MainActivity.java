package a67yjh00.com.example.lg.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button[] butNums = new Button[10];
    Button[] butOps=new Button[4];
//    int[] ids = {R.id.but_num1, R.id.but_num2, R.id.but_num3, R.id.but_num4, R.id.but_num5,
//                 R.id.but_num6, R.id.but_num7, R.id.but_num8, R.id.but_num9, R.id.but_num10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0; i<butNums.length; i++) {
//            butNums[i] = (Button)findViewById(R.id.but_num1+i);
            butNums[i] = (Button)findViewById(R.id.but_num1+i);
            butNums[i].setOnClickListener(butNumHandler);
        }
        for(int i=0; i<butOps.length; i++){
            butOps[i]=(Button)findViewById(R.id.but_num1+i);
            butOps[i].setOnClickListener();
        }
    }

    View.OnClickListener butNumHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
    View.OnClickListener butOpHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
}
