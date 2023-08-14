package mobil.tekin.com.vibration;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Vibrasyon v1=new Vibrasyon(this);
    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init();

    }


    private void init()
    {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               v1.Titrestir();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.Titrestir2();
            }
        });
    }

    public void btnkisa_Click(View v)
    {
        v1.Titrestir();
    }

    public void btnuzun_Click(View v)
    {
        v1.Titrestir2();
    }

}
