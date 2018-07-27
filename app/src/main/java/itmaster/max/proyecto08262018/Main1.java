package itmaster.max.proyecto08262018;

import android.location.GpsStatus;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main1 extends AppCompatActivity {
    private EditText et1, et2, et3;
    private Button confirmar, reset;
    private ListenConfirmar listenerConfirmar;
    private ListenerReset listenerReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        confirmar = findViewById(R.id.confirmar);
        reset = findViewById(R.id.reset);
        listenerConfirmar = new ListenConfirmar(this);
        listenerReset = new ListenerReset(this);

    }
}
