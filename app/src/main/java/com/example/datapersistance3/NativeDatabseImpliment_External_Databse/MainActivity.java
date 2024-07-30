package com.example.datapersistance3.NativeDatabseImpliment_External_Databse;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.datapersistance3.Addapter.Myaddapter;
import com.example.datapersistance3.NativeDatabaseImpliment_internal_Database.Car;
import com.example.datapersistance3.NativeDatabaseImpliment_internal_Database.Mydatabase;
import com.example.datapersistance3.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Car> cars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=findViewById(R.id.recycle);
        DatabasesAcces db=DatabasesAcces.getInstance(this);
        cars=new ArrayList<>();
        db.open();
        cars=db.GetAllCars();
        db.close();
        Myaddapter myaddapter=new Myaddapter(cars);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myaddapter);








    }
}