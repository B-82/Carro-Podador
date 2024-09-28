import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ControlPanelActivity extends AppCompatActivity {

    private Button btnPause;
    private Button btnPowerOff;
    private Button btnSync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);

        btnPause = findViewById(R.id.btnPause);
        btnPowerOff = findViewById(R.id.btnPowerOff);
        btnSync = findViewById(R.id.btnSync);

        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic for pausing the mower
            }
        });

        btnPowerOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic for turning off the mower
            }
        });

        btnSync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic for syncing the mower
            }
        });
    }
}
