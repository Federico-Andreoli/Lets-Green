package it.unimib.letsgreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import it.unimib.letsgreen.ui.Actions;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button nbuttom;
    private BottomNavigationView NavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nbuttom = findViewById(R.id.button);
        NavigationView= findViewById(R.id.bottom_navigation);
        NavigationView.setOnNavigationItemSelectedListener(listener);


        nbuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "premuto bottone" );
                    Actions actions= Actions.newInstance();
                    FragmentManager fm= getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.frame_layout, actions);
                    ft.addToBackStack("attività");
                    ft.commit();



            }
        });
    }
    private final BottomNavigationView.OnNavigationItemSelectedListener listener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment selected_fragment =null;
            switch (item.getItemId()){
                case R.id.attività:
                    selected_fragment =Actions.newInstance();
                    break;

                case R.id.home:

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
                ft.replace(R.id.frame_layout, selected_fragment);
                ft.addToBackStack("attività");
                ft.commit();
            }
            return true;
        }
    };
}