package com.edubit.curriculapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;
import android.content.Intent;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        NavigationView nav_view = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
        case R.id.nav_perfil:
            Toast.makeText(getApplicationContext(), R.string.menu_perfil, Toast.LENGTH_LONG).show();
            Intent intent_nav_perfil = new Intent(this, Perfil.class);
            startActivity(intent_nav_perfil);
            break;
        case R.id.nav_miscursos:
            Toast.makeText(getApplicationContext(), R.string.menu_miscursos, Toast.LENGTH_LONG).show();
            Intent intent_nav_miscursos = new Intent(this, MisCursos.class);
            startActivity(intent_nav_miscursos);
            break;
        case R.id.nav_optativas:
            Toast.makeText(getApplicationContext(), R.string.menu_optativas, Toast.LENGTH_LONG).show();
            Intent intent_nav_optativas = new Intent(this, Optativas.class);
            startActivity(intent_nav_optativas);
            break;
        case R.id.nav_electivas:
            Toast.makeText(getApplicationContext(), R.string.menu_electivas, Toast.LENGTH_LONG).show();
            Intent intent_nav_electivas = new Intent(this, Electivas.class);
            startActivity(intent_nav_electivas);
            break;
        case R.id.nav_informacion:
            Toast.makeText(getApplicationContext(), R.string.menu_informacion, Toast.LENGTH_LONG).show();
            Intent intent_nav_informacion = new Intent(this, Informacion.class);
            startActivity(intent_nav_informacion);
            break;
        case R.id.nav_configuracion:
            Toast.makeText(getApplicationContext(), R.string.menu_configuracion, Toast.LENGTH_LONG).show();
            Intent intent_nav_configuracion = new Intent(this, Configuracion.class);
            startActivity(intent_nav_configuracion);
            break;
        default:
            throw new IllegalArgumentException("Opción no existente");

        }

        return true;
    }
}