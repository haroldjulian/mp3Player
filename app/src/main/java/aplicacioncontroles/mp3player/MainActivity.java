package aplicacioncontroles.mp3player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(this, R.raw.cancion);
    }

    @Override
    protected void onResume() {
        player.start();
        super.onResume();
    }

    @Override
    protected void onStop() {  //cuando lo minimizo pauso la cancion, caso contrario seguira tocando
        player.pause();
        super.onStop();
    }
}
