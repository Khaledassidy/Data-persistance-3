package com.example.datapersistance3.NativeDatabseImpliment_External_Databse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.datapersistance3.NativeDatabaseImpliment_internal_Database.Car;

import java.util.ArrayList;

//bade deef fe 3mlyet l wosoul la database ma fe extend la aye she  fa 2awl she:
//bjeeb mo2sher 3ala databse ta3ele l mydatabse
//bade 3aref mo2sher 3ala openhelper l class ra3el l mydatabse b2lbo ma kenet e7kelo bel methods l ta3del w insert w kel method elo getwritble wala getreadble kenet jeba mn class SQLiteDatabase le 3mele extend mn sqliteopenhelper wa2t kont 3emel extend mn sqliteassetheler fa ba3mel reference 3ala l sqliteopenhelper 3ashen est5dmo b 3mlyet l wosol wa2t 2olo efta7 ka3det baynet 2aw saker ka3edet bayanet seer 2olo getreadble 2aw getwritable
//hala2 bensa5 l function mn insert,update,delete..etc enta hala2 jebt l function le btelzm lal most5demen b clas esmo databseAcces
//hala2 bade 2a3mel constructor btare2et l singleton design pattern:
//fekretha eno enta mesh deymn lezm ta3mel objcet hal mante2e eno enta bshshe l wa7de masln fe 5ams ma7let badak test3mel l code ya3ne mara badak test3mel code yjeblak sayrat ,mara badak ta3mel insert mara delete b nafs shshe fe 3andak 5ams matare7 testa3mel feha l code 2aw law keen fe aktr mn shshe hal mante2e eno kel ma trou7 ta3mel 3mlye 3ala databse trou7 ta3mel object mnha la databse alak la2 fe she 3andak esmo sigleton design pattern howe 3ebra 3an tare2a 3ashn mesh kel mara ya3mel object bte7faz l object b mot8ayer w bt2olak law keen hal mot8yer fe object rou7 sta3mlo la heda l object law ma fe object 3meel object
//fa brou7 ba3mel constructor private 3ashen emna3 aye 7ada ya3mlo la heda l consturctor bye5od context 3mlto prvate 3ashn ybtel feek mn bara ta3mel Databaseacces databse=new Databaseacces(); hay saret mano3 ta3mela bas 5alyto private beje houn ba3mel public static btrje3 object mn nafs nou3 l esm l class getinstance  bada te5od l context 3mlta static 3ashn bade yeha
//ba3den b3ref variable mno3 DatabaseAcces w esmo instance
//w jowa l method getinstance b2olo law kenet l intance null 3meel new insatnce Databseacces db=new Databceaacces() iza la2 mana null 3meel return bas lal instance fa hala2 bas bade et3emal ma3 l class bseer b2olo DatabseAcces.getinstance w 2a3te l context ma3neta eno enta ma trou7 kel mara tenshe2 new databse acces kel mara 3ayet lal getinstance law kenet equll null 3meel instance jdeede iza la2 raj3lee l instance l mawjoude
//hala2 bel constructor ba3mel 3al databse ta3ele =newmydatabase w ba3te l context

//private DatabasesAcces(Context context){
//    this.database=new Mydatabase(context);
//}
//public static DatabasesAcces getInstance(Context context){
//    if(instance==null){
//        instance=new DatabasesAcces(context);
//    }
//    return instance;
//}

//le sar houn:
//3mlt constuctor pivate bye5od context 3ashn ma 7ada ye2dar yosal mn bara w ya3mel object w 2oltelo fe eno bado yenshe2 databse mn class heda tab3an hay l databse lezmtle 3ashn 2e2dar 2a3mel insert dlete...etc
//ba3d heek 2oltelo badak ta3mel function tredele object mno3 l class w iza keen heda l object null 3mele elo intillize ya3ne 7a yenshe2le l constructor heda 7a ya3mel object mn le ana fe iza la2 3mle return lal heda l instance
//lezm ta3mel 2 function:
//method esma open method close
//lesh aye method bta3mela ma3 databse lezm tefta7 5at ma3 databse w bas t5les tsaker l 5at l2no bas yeje la ya3mel she tene operation teneye yle2e l 5at msakar ma yla2eha maftou7a w ma ye2dar yesta5dema metl l file law keen l malaf maftou7 ma bye2dar 7ada 8ayrak yesta5dmo
//7a 2olo bel open getwritbale sawe2 keen read 2aw wriete select 2aw insert 2aw delete

public class DatabasesAcces {
   private SQLiteOpenHelper OpenHelper;
    private SQLiteDatabase database;
    private static DatabasesAcces instance;

   private DatabasesAcces(Context context){
       this.OpenHelper=new com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase(context);
   }
   public static DatabasesAcces getInstance(Context context){
            if(instance==null){
                instance=new DatabasesAcces(context);
            }
            return instance;
   }

   public void open(){
       this.database=this.OpenHelper.getWritableDatabase();
   }

   public void close(){
       //ba3mel check iza databse maftou7a fe 7ada 3am yest5dema sakera
       if(database!=null){
           this.database.close();
           //oltelo rou7 3al open helper le howe 2asln database ta3ele mydatabase w sakro
       }
   }

    public boolean insertCar(Car car) {
        ContentValues values = new ContentValues();
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_MODEL, car.getMode());
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_COLOR, car.getColor());
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_DPL, car.getDpl());
        long result = database.insert(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME, null, values);
        //OR
        //db.execSQL("INSERT INTO car (model,color,distanceforlitter) VALUES ("+car.getMode()+","+car.getColor()+","+car.getDpl()+")");
        return result != -1;
    }

    public boolean updateCar(Car car) {
        ContentValues values = new ContentValues();
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_MODEL, car.getMode());
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_COLOR, car.getColor());
        values.put(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_DPL, car.getDpl());
        String[] args = {String.valueOf(car.getId())};
        //car.getId()+"" or tostring() class l string ya3ne
        int result = database.update(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME, values, "id=?", args);
        //OR
        //ba3mel db.exc(update set....etc)
        return result > 0;
    }

    public long getCarsCount() {
        long result = DatabaseUtils.queryNumEntries(database, com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME);
        //law badak testa3mel selection w selection arg:
        //String [] args ={"10"};
        //long result=DatabaseUtils.queryNumEntries(db,CAR_TAB_NAME,"id=?",args);
        //raj3le 3adad l rows le l id ta3eloun equll 10

        //or tare2a tenye:
        //db.execSQL("SELECT COUNT(*) FROM "+CAR_TAB_NAME);
        return result;
    }

    public boolean DeleteCar(Car car) {
        String[] args = {String.valueOf(car.getId())};
        int result = database.delete(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME, "id=?", args);

        //feek enta mesh darore teb3at l car ka object yemken teb3at String x w b2alb l array int ars={"%x%"} w ta3bel db.edlete(Car_tab_name,"model LIKE ?" ,args ya3ne 7zefle l row le l model like jomle l user b faweta ya3ne la n2ol l x kenet 2020 fa 3mle delete la row le model ta3ela b2lbo 2020 metl ya3ne iza keen l model dededed2020dfee 3mle delete la heda row

        //w feek ta3mel delete btare2a tenye le heye excute qury ya3ne db.excsql("Delete...etc")
        return result > 0;

    }

    public ArrayList<Car> GetAllCars() {
        ArrayList<Car> cars = new ArrayList<>();
        //know cursor in row -1 w hay jomle kola raj3lek table metl le mawjoud bel database mra2m rom mn 0 w l column 0 w howe bekoun 2awl ma 3mlne 3ala l -1
        Cursor cursor = database.rawQuery("SELECT * FROM " + com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME, null);
        // hay fa7stlk eno hal fe keyam bel cursor wala la2 w iza l 3onour l 2awl mawjoud 2aw la2 l2no l cursor lezm 2awl ma yerja3 ykoun fe b2labo kel table ma howe berja3 data metl shakl dataabse table w cursor.move.tofirst btshoflak bten2lak 3ala 2awl 3onour l2no 2awl ma na3ml l cursor bekoun 3al -1 w btrj3lk true iza fe b2alb 2awl row data iza la2 btrje3 false  iza hala2 l cursor 3ned l 3onsour l 2awal l 0 row 0 l move to first btrj3lak boolean ya3ne iza nta2al 3end 2awl 3nousur w fe 3osnour berj3lak treu iza ma fe 3osnour false ya3ne fene 2olo iza l cirsor.movetofirst raja3 true jeble meno data iza false
        if (cursor != null && cursor.moveToFirst()) {
            //hala2 bjeeb data:
            //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
            do {
                //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_ID));
                //l model  string so getstring() w ba3te l index taba3 l model le howe 1:
                String model = cursor.getString(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_MODEL));
                //l color string so getstring() w ba3te l index taba3 l color le howe 2:
                String color = cursor.getString(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_COLOR));
                //l dpl double so getdouble() w ba3te l index taba3 l dpl le howe 3:
                double dpl = cursor.getDouble(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_DPL));

                //hala2 ana bade raje3 l data ka array list so kel mara bye2rha ba3mel object car w b7eta bel arraylist
                Car car = new Car(id, model, color, dpl);
                cars.add(car);
            } while (cursor.moveToNext());

            //hala2 mafroud ba3d ma t5les kera2a mn cursor tsaker l cursor cursor.close() hala2 howe telk2eyan beskro bas y5les bas l a7san tsakro yadaweyan
            cursor.close();

            //hala2 bel move:
            //3ande movetopostion() bta3te aye postion berou7 3lyha
            //3ande moveto() bta3te kamen postion perou7 3lyha


        }
        return cars;


    }

    public ArrayList<Car> SearchCars(String modelSearch) {
        ArrayList<Car> cars = new ArrayList<>();
        //know cursor in row -1 w hay jomle kola raj3lek table metl le mawjoud bel database mra2m rom mn 0 w l column 0 w howe bekoun 2awl ma 3mlne 3ala l -1
        Cursor cursor = database.rawQuery("SELECT * FROM " + com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_NAME + " WHERE " + Mydatabase.CAR_TAB_MODEL + "=?", new String[]{modelSearch});
        // hay fa7stlk eno hal fe keyam bel cursor wala la2 w iza l 3onour l 2awl mawjoud 2aw la2 l2no l cursor lezm 2awl ma yerja3 ykoun fe b2labo kel table ma howe berja3 data metl shakl dataabse table w cursor.move.tofirst btshoflak bten2lak 3ala 2awl 3onour l2no 2awl ma na3ml l cursor bekoun 3al -1 w btrj3lk true iza fe b2alb 2awl row data iza la2 btrje3 false  iza hala2 l cursor 3ned l 3onsour l 2awal l 0 row 0 l move to first btrj3lak boolean ya3ne iza nta2al 3end 2awl 3nousur w fe 3osnour berj3lak treu iza ma fe 3osnour false ya3ne fene 2olo iza l cirsor.movetofirst raja3 true jeble meno data iza false
        if (cursor != null && cursor.moveToFirst()) {
            //hala2 bjeeb data:
            //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
            do {
                //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(Mydatabase.CAR_TAB_ID));
                //l model  string so getstring() w ba3te l index taba3 l model le howe 1:
                String model = cursor.getString(cursor.getColumnIndexOrThrow(Mydatabase.CAR_TAB_MODEL));
                //l color string so getstring() w ba3te l index taba3 l color le howe 2:
                String color = cursor.getString(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_COLOR));
                //l dpl double so getdouble() w ba3te l index taba3 l dpl le howe 3:
                double dpl = cursor.getDouble(cursor.getColumnIndexOrThrow(com.example.datapersistance3.NativeDatabseImpliment_External_Databse.Mydatabase.CAR_TAB_DPL));

                //hala2 ana bade raje3 l data ka array list so kel mara bye2rha ba3mel object car w b7eta bel arraylist
                Car car = new Car(id, model, color, dpl);
                cars.add(car);
            } while (cursor.moveToNext());

            //hala2 mafroud ba3d ma t5les kera2a mn cursor tsaker l cursor cursor.close() hala2 howe telk2eyan beskro bas y5les bas l a7san tsakro yadaweyan
            cursor.close();

            //hala2 bel move:
            //3ande movetopostion() bta3te aye postion berou7 3lyha
            //3ande moveto() bta3te kamen postion perou7 3lyha


        }

        return cars;


    }
}
