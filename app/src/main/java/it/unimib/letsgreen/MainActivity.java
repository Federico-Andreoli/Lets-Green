package it.unimib.letsgreen;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import it.unimib.letsgreen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    /*private static final String TAG = "MainActivity";
     private MaterialToolbar Toolbar;*/
    private BottomNavigationView NavigationView;
    private MaterialToolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);

        /*NavigationView = findViewById(R.id.bottom_navigation);*/

        /*
        Toolbar=findViewById(R.id.topAppBar);
        NavigationView= findViewById(R.id.bottom_navigation);
        NavigationView.setOnNavigationItemSelectedListener(listenerBottomNavigationView);*/


        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home, R.id.catalogo, R.id.settings).build();

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment1);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(mBinding.topAppBar, navController);


        /*NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);*/

        /*Fragment home= Home.newInstance();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.addToBackStack("home");
        ft.commit();

    }


   private final BottomNavigationView.OnNavigationItemSelectedListener listenerBottomNavigationView= new BottomNavigationView.OnNavigationItemSelectedListener() {
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
    };*/


    }
}

