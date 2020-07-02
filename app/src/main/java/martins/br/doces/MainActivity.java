package martins.br.doces;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);


    }
    public void chamaBolo(View view){
      setContentView(R.layout.bolo);
}

    public void chamaPizza(View view){
        setContentView(R.layout.pizza);
    }

    public void chamaPudim(View view){
        setContentView(R.layout.pudim);
    }

    private void setContentView(int pudim) {
    }

    public void chamaTorta(View view){
        setContentView(R.layout.torta);
    }

    public void chamaVoltar(View view){
        setContentView(R.layout.activity_main);
    }

}
