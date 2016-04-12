package xyz.copypastestd.yamobilization;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;
    FragmentManager myFragmentManager;
    Fragment myFragment1;
    Fragment myFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (FrameLayout) findViewById(R.id.container);

        myFragmentManager = getSupportFragmentManager();
        myFragment1 = new ArtistListFragment();
        //myFragment2 = new ArtistInfoFragment();

        String fragmentFlag = "ArtistList";

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.container, myFragment1);

        /*switch (fragmentFlag) {
            case "ArtistList":
                ft.add(R.id.container, myFragment1);
                Log.i("TAG", "frag1");
                break;
            case "Studio":
                ft.add(R.id.container, myFragment2);
                Log.i("TAG", "frag2");
                break;
        }*/
        ft.commit();
    }
}
