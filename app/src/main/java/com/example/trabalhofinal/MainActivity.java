package com.example.trabalhofinal;

import android.os.Bundle;

import com.example.trabalhofinal.classes.database.LocalDatabase;
import com.example.trabalhofinal.classes.entities.Tag;
import com.example.trabalhofinal.classes.entities.Usuario;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.trabalhofinal.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Tag> tags = new ArrayList<Tag>();

    public static Usuario user = new Usuario("Fulanonono","00000000","67 999999999","gmail@gmail.com");

    private LocalDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        db = LocalDatabase.getDatabase(getApplicationContext());

        try {
            tags.add(new Tag("CACHORRO"));
            tags.add(new Tag("GATO"));
            tags.add(new Tag("LAGARTO"));
            tags.add(new Tag("VIRA LATA"));


            db.tagModel().insertAll(tags);

            tags.clear();

            tags.add(new Tag("CHAU CHAU", db.tagModel().getTag("CACHORRO").getId()));
            tags.add(new Tag("PINSCHER", db.tagModel().getTag("CACHORRO").getId()));
            tags.add(new Tag("GOLDEN RETRIEVER", db.tagModel().getTag("CACHORRO").getId()));
            tags.add(new Tag("HUSKY SIBERIANO", db.tagModel().getTag("CACHORRO").getId()));

            tags.add(new Tag("SIAMES", db.tagModel().getTag("GATO").getId()));
            tags.add(new Tag("PERSA", db.tagModel().getTag("GATO").getId()));
            tags.add(new Tag("SPHINX", db.tagModel().getTag("GATO").getId()));

            db.tagModel().insertAll(tags);

            tags.clear();
        }catch(Exception ignored){}
    }

}