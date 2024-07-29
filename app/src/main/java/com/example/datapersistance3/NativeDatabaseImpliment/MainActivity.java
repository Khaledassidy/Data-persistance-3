package com.example.datapersistance3.NativeDatabaseImpliment;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//hala2 ba3d ma 5als l databse bade eje tab2o houn
//2awl she bade 2a3ml layout feha 3 edit text model,color,dpl w 2button save w read

//bade 5ale l user y7ot data bel edit text w bas 2a3mel save yzedle yehoun 3ala databse ya3meloun insert
//w bade bas ekbous kabset l read yjeble 3adad l 3anser bel table ya3ne number of rows



//1-ba3mel mo2sher 3ala class le 3mlto le esmo mydatabse w ba3mlo public  Mydatabase db=new Mydatabase(this); houn ka2no 3am 2olo nshe2le databse law meshmawjoude w law mawjoude 3atene mo2sher 3lyha
//2-b2alb l save bjeeb l data le l user 7a y7ota le heye l model,color,dpl
//3-bade 2a3mel object mno3 car w bst3mel l consturctor le ma fe id l2no bel write insert ana 7atet l l id autoincreament so iza 3am est3mel l insert st3mel l consturctr bala id iza 3am 2a3mel update sta3mel l consturctor le fe id
//4-ba3mel db.insercar(car);
//hala2 badna na3mel sah8le na3mel eno l model ykoun unique w n8ayer l version 3ashen yeje ya3mel delete lal table w yerja3 ye2dar yfout 3ala 3ala l oncreate w yerja3 ya3mel databse jdeed 2aw bta3mel unstall lal app bterja3 betnazlo
import com.example.datapersistance3.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText model,color,dpl;
    Button save,read;
    Mydatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        model=findViewById(R.id.model);
        color=findViewById(R.id.color);
        dpl=findViewById(R.id.dpl);
        save=findViewById(R.id.button_save);
        read=findViewById(R.id.button_read);
        db=new Mydatabase(this);

        save.setOnClickListener(v->{
            String user_model=model.getText().toString();
            String user_color=color.getText().toString();
            double user_dpl=Double.parseDouble(dpl.getText().toString());
            Car car=new Car(user_model,user_color,user_dpl);
            boolean res= db.insertCar(car);
            if(res){
                Toast.makeText(this, "Success insertion", Toast.LENGTH_SHORT).show();
            }



        });

        read.setOnClickListener(v->{
            long carsCount=db.getCarsCount();
            Toast.makeText(this, "number of cars are"+carsCount, Toast.LENGTH_SHORT).show();
            //hala2 houn bade est5dem getallcars le 3mlta w etb3oun 3ala logcat:
            ArrayList<Car> cars=db.GetAllCars();

            //et2akad eno meshe 7ala betba3 l size ta3ela
            Toast.makeText(this, ""+cars.size(), Toast.LENGTH_SHORT).show();

            //ba3mel for each lakel object mno3  Car c mawjoud bel arraylist le esma cars jeble yeh w 7oto b variable c w ba3den betb3lo l model w l id bel log cat :
            if (cars != null) {
                for (Car c:cars){
                    Log.d("car #"+c.getId(),c.getMode());
                }
            }



            //hala2 houn bade est5dem searchcars le 3mlta w etb3oun 3ala logcat la kel cars le 3andoun model 2015:
            ArrayList<Car> cars1=db.SearchCars("2015");
            //ba3mel for each lakel object mno3  Car c mawjoud bel arraylist le esma cars1 jeble yeh w 7oto b variable c w ba3den betb3lo l model w l id bel log cat :
            if(cars1!=null){
                for (Car c:cars1){
                    Log.d("car #"+c.getId(),c.getMode());
                }
            }

        });


    }
}