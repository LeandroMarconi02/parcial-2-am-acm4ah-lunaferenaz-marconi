package ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi;
import static ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.R.id.bottom_navigation;
import static ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.R.id.firstFragment;
import static ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.R.id.secondFragment;
import static ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.R.id.thirdFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import ar.edu.parcial_1_am_acm4ah_lunaferenaz_marconi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment SecondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    VentaFragment ventaFragment = new VentaFragment();
    InventoryFragment inventoryFragment = new InventoryFragment();



    ActivityMainBinding binding;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btnMostrarBarra;
//        btnMostrarBarra= (Button) findViewById(R.id.btnMostrarBarra);
        final boolean[] invisible = {true};

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
//        navigation.setOnItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btnBuscarLibro;



        btnBuscarLibro = (Button) findViewById(R.id.btnBuscarLibro);


        btnBuscarLibro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Buscar.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"El libro no existee",Toast.LENGTH_SHORT).show();


            }
        })


        ;
//        btnMostrarBarra.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (invisible[0]){
//                    bottomNavigationView.setVisibility(view.INVISIBLE);
//                    invisible[0] = false;
//                }else{
//                    bottomNavigationView.setVisibility((view.VISIBLE));
//                    invisible[0] = true;
//                }
//            }
//        });







    }

    };

//    public void loadFragment(Fragment fragment) {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.frame_container, fragment);
//        transaction.commit();
//    }
//}


