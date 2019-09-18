package mcacciuttolo.example.gpa__yournetid__calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//--------------------------------------------------------------------------------------------
// RAN OUT OF TIME COMMENTED EVERYTHING OUT THAT WAS CAUSING THE PROGRAM TO NOT RUN
// AFTER I GOT THE ONCLICK FUNCTIONALITY I WOULD SET IT TO CHANGE THE BACKGROUND COLOR BASED ON GRADE AVERAGE
//-----------------------------------------------------------------------------------------
public class MainActivity extends AppCompatActivity {

    Button mybutton;

    TextView myTextView;
    EditText myEditText;
    EditText myEditText2;
    EditText myEditText3;
    EditText myEditText4;
    EditText myEditText5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView=(TextView)findViewById(R.id.textView);

        myEditText=(EditText)findViewById(R.id.editText);
        myEditText2=(EditText)findViewById(R.id.editText2);
        myEditText3=(EditText)findViewById(R.id.editText3);
        myEditText4=(EditText)findViewById(R.id.editText4);
        myEditText5=(EditText)findViewById(R.id.editText5);
        mybutton =(Button)findViewById(R.id.btn);

       // int num1 = Integear.parseInt(myEditText);
       // int num2 = Integear.parseInt(myEditText2);
       // int num3 = Integear.parseInt(myEditText3);
       // int num4 = Integear.parseInt(myEditText4);
       // int num5 = Integear.parseInt(myEditText5);

      //  string myEditText = editText.getText().toString();
      //  string myEditText2 = editText.getText().toString();
      //  string myEditText3 = editText.getText().toString();
      //  string myEditText4 = editText.getText().toString();
      //  string myEditText5 = editText.getText().toString();

    }

    /*
    mybutton.setOnClickListener(new View.OnClickListener()){

        public void getAverage(View arg0) {
            int calculate = num1 + num2 + num3 + num4 + num5/5;
            int result = calculate;

            Button OnClick (setText" " + result);

            if (result <60){


            }



    }



    }
    */
}
