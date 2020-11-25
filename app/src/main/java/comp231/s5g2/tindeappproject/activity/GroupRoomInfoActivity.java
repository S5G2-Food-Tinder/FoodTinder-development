package comp231.s5g2.tindeappproject.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import comp231.s5g2.tindeappproject.R;

public class GroupRoomInfoActivity extends AppCompatActivity {

    private TextView roomCode, roomAdmin;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_room_info);

        roomCode = findViewById(R.id.tvRoomCode);
        roomAdmin = findViewById(R.id.tvRoomAdminUser);
        btnStart = findViewById(R.id.btnStartFoodMatch);

        //Random code
        final Random random = new Random();
        int d4Roll = random.nextInt(9999)+1011;
        roomCode.setText(Integer.toString(d4Roll));

    }
}