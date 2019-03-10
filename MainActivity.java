package example.com.prince.usamp15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    Button displayDate;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1);
        picker = (DatePicker)findViewById(R.id.datePicker);
        displayDate=(Button)findViewById(R.id.button1);

        textView1.setText("Current Date: "+getCurrentDate());
        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("Change Date: "+getCurrentDate());
            }
        });
    }
    public String getCurrentDate(){
        StringBuilder builder = new StringBuilder();
        builder.append((picker.getDayOfMonth())+"/");
        builder.append((picker.getMonth() +1)+"/");

        builder.append(picker.getYear());
        return builder.toString();
    }
}
