package it.unimib.letsgreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private BottomNavigationView NavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView= findViewById(R.id.bottom_navigation);
        NavigationView.setOnNavigationItemSelectedListener(listener);
        View sceneRoot =findViewById(R.id.scene_root);



        Fragment home= Home.newInstance();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.scene_root, home);
        ft.addToBackStack("home");
        ft.commit();

    }

    private final BottomNavigationView.OnNavigationItemSelectedListener listener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment selected_fragment =null;
            switch (item.getItemId()){

                case R.id.home:
                    selected_fragment =Home.newInstance();
                    break;

                case R.id.catalogo:
                    selected_fragment =Catalogo.newInstance();
                    break;

                case R.id.settings:
                    selected_fragment =Settings.newInstance();
                    break;
            }
            if (selected_fragment != null) {
                FragmentManager fm= getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.scene_root, selected_fragment);
                ft.addToBackStack("attività");
                ft.commit();

            }
            return true;
        }
    };
}