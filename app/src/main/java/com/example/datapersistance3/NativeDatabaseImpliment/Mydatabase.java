package com.example.datapersistance3.NativeDatabaseImpliment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

//2awl 5otwe ma3mela ba3mel class esmo Mydatabase
//2awl 5otwe 3ashen teshte8l databse lezm testa5dem class l waset le btet3emal fe 2awemer databse ya3ne enta badak toktob 2awemrak w teb3ata la class l waset heye le mn 5elela bada trou7 tnafezlak l 2awemer 3ala database l class l waset esmo SQLiteOpenHelper fa 2awl 5otwe ba3ml extend mn l class ta3ele la heda l class
//hay l methodology le 3am emshe feha heye mratabe bas enta feek toktob code bel mainactivity
//hala2 ba3d ma 3mlt extend mn sqlopenheleper 3atane 5ata2 w heda sababo l class le 3and l sqlopenhelper byesta2bel parameter w ana houn lisa ma ba3at elo wala parameter fa beje hala2 ba3mel consturctor w bye5od heda l consturctor ana byelzmne mn bara l context
//hala2 class l super le howe ta3el l sqlopenhelper bye5od 4 sha8let 2awl wa7de l context,tene wa7de bye5oda String name esm databse le badak tenshe2a mesh enta badak ta3mel database tyeb sho esma sameha metl ma badak la n2ol cars fa b3refa bshakl sebet bara static final w ba3teha lal super deymn t3awad l eshya sebte le ma tet8yar t3arefa sebet metl esm database,3 parameter howe l cursor factory ma bd2eyan bade 2a3teha null ba3d heek mneshra7a,4 parameter l version kel databse enta btenshe2a lezm ykoun ela version esdar lesh l2no wa2t t7ades databse t7ades l version taba3a fa kamen mn 3aref mot8ayer bara final w mna3teha yeh kel databse elha version 2aw nos5a 2aw esdar mo3ayan heda l esdar masaln l youm 3mlt database feha 3 tables law enta bokra jeet badak t7ades databse w deef table la yomken yet7adas law badak tsha8el application ta3lek malion mara ma byet7adas lesh l2no l version ba3do metl ma howe l version heda nezam l android d5leyan byesta5dema 3ando 3ashen ya3ref eno hal ana bade 7ades database hal 5aleha metl maheye hal fe wa7de jdede ejet fa btelzamo l verison de5lyan fa law keen l application nezel 3andak w l version 5asa bel database kenet 1 w ba3d heek enta 3adlt l database w 8ayrt l version la 2 w nazlt l application mara tenye 3ala l mobile telka2eyan l mobile la7 yestad3e function 2e3adet enshe2 database w y7adesa
//ba3den hala2 l 5otwe jeye  heda l class l sqliteopenhelper fe 3ando 2 method abstarct lezm ta3mleoun overide


//3ande 2 methods wa7de esma onCreate w hay l function btem ested3e2a 3end enshe2 databse mara wa7de bas btem ested3e2a hay l method 2awl ma ytem enshe2 databse sho lezm yseer ytem enshe2 l tables b2lba 2awl 5otwe la na3mel databse howe create tables bel databse fa bhya l function howe byeb3tlk bel parameter l databse (sqlitedatabse sqlitedatabse) mo2sher 3ala databse fa telk2eyan 2awl ma yenzal l application 3al mobile mobshratan btem ested3e2 l oncreate 2awl she w bas mara wa7de bebtel yestad3e2a abdan mara wa7de bas awal ma yenzal l application hala2 2awl sha8le badna na2mela badna noktob bel oncreate sql create table 3ashen na3mel table ween bade oktoba bel mo2sher heda l (Sqliteopenheleper sqliteopenhelper) fa beje b2olo:
//sqlitedatabse.excSQL:ya3ne excute query bas 2olo exute sql ya3ne bade 2a3te lsentence l sql le mna3refoun 3ashn ynafeza sho heye jomle w momken ta3mel akatr mn jomle bel exute ya3ne kaza sql statement:
//Create table:db.execSQL("CREATE TABLE car (id INTEGER PRIMARY KEY AUTOINCREMENT,model TEXT,color TEXT,distancePerLetter REAL)");
//onUpgrade:btem ested3e2a 3end kel ta7des la databse bas t3adel 3al version w tzedo bas heek btem ested3e2a mara tenye l onupgrade btem ested3e2a bas 3end ta8yer kemet l version mn 2eme la 2eme 2a3la mena ya3ne kenet 1 w tseer 2 keef ya3ne law enta sha8lt l application 3al mobile fa telk2eyan 2awl function la7 ytem ested3e2a heye l oncreate w la7 yenshe2lak l table 3ala l mobile bel internal storage law sha8lto rej3t mara tenye mesh la7 yestad3e l oncreate lesh l2no fe3layn ansha2 l jadwal 5als howe byesd3eha mara wa7de 2awl mara btefta7 l application ba3den 5als bebtel yestd3eha ela eza ma7et l application w rje3 nazlto tyeb t5ayl enta rje3t 3adlt l version w sha8lto mara tenye lal application mesh la7 yestad3e l oncreate la7 yestad3e l onupgrade lesh l2no mn wejhet nazaro shef fe ta8yer 3ala l version fa fehem telka2eyan eno fe ta7sen 3ala l database fa telka2eyan ra7 stad3a l method l esma onpgrade w ba3talk feha l version l 2ademe w l version l jdede ka parameter w database fa wazeftak houn bel onpgrade b2alba ta3mel ta7sen 3ala l database ya3ne teje houn w t2olo tzeed column masln ta3mel alter table badak tem7e l table w terja3 tensh2o mn 2awl w jdeed aye 3mlyet ta3del badak ta3mela 3end ta8yer l version bta3mela bel onupgrade hala2 bshkl mabda2e 7a na3mel 3mlyet delete la table w nerja3 nensh2o mn 2awl w jdeed ya3ne bade 2olo db.execsql("") w 2olo houn eno delete table w rja3 nsho2o mn 2awl w jdeed ya3ne badna na3ref sha8le iza ne7na mnazlen l application hala2 3al mobile 3adlt 3a function l oncreate w katbt w zedt column esmo x w naw3o text hala2 law enta rje3t sha8lt l application mara tenye y3ne 3mlt run mesh la7 yet3araf abdan 3al 3amoud le esmo x lesh l2no l oncreate ma yfouta 8eer mara wa7de 3end enshe2 l jadwal 2aw database most7el ba3d ma 3mel create la databse w la table yerja3 yfout 3al oncreate fa 3ashen ned7k 3lee sho mnrou7 mn2olo rou7 e7zef l table le esmo car bel onupgrade w rou7 ensh2o mn 2awl w jdeeed 3ashen yetar yfout 3ala l oncreate mara tenye w ynafez l code le feha ya3ne 2awl she 3mlna databse 3meel table esmo car rej3 8ayrt l version fa 7a yestd3e l onupgrade 7a yel8e table yerja3 stad3et l oncreate w 3atyta databse fa 7shof y2ol yee ana ma 3ende table fa fene lezm fout 3ala l oncreate fa bhay tare2a 7a yfout bas law keen fe table ba3do w stad3aha yadweyan ma 7yfout bas hounn keenm ma fe table      :
// db.execSQL("DROP TABLE IF EXISTS car");
//            onCreate(db);
//fa le sar ka2ne 2oltelo iza sar ta7sen 3ala databse 2aw ya3ne iza l programer 8ayar l version rou7 la7alk e7zef l jadwal le mawjoud 3andak w enshe2 l databse mn 2awl w jdeed
//2awl sha8le badak tefhama eno haw 2 method momken ested3e2oun yadaweyan 2aw ested3e2oun programing ya3ne la7loun
//hala2 ana heed class mydatabse bade jahzo ba3den est3mlo ya3ne law ra7 wa7ad 3ala l mainactivity w 3mel Mydatabse db=new MyDatabse(this); mobshrtan la7 ytem enshe2 l databse mobashrtan la7 ytem ested3e2 l oncreate 2awl she meen stad3aha enta stad3et l constuctor w l constuctor b ma 2no 3emel extend mn SQLiteOpenHelper howe law7do ra7 stad3a l oncreate  w ansh2lak databse w ansh2lak bede5la table esmo car 5ale belek eno meen 3mela mesh ana howe law7do stad3a l oncreate




//summary:
//l oncreate testd3a mara wwa7de 3end enshe2 l tables 2aw l database w l onupgrade testd3a bas iza 8ayrna l version l 2a3la
//hala2 law ana sha8lt l application fa 7a ya3mel databse yfot 3ala l oncreate w ya3mel table esmo car ba3den ana 7abet efta7 l code erja3 rou7 3al oncreate w zeed 3amoud esmo x mesh la7 yet3araf 3al 3amoud le esmo x l2no mn wejhet nazro ansha2 l jadwal mesh 7a yfout 3al oncreate mara tenye  aymta befout 3lee law  mesh mawjoud table fa houn l oncreate ma befout 3lyha w ta3del eno tzeed column enta zeto bel oncreate fa most7eel yseer ta3del fa eja 2alak ta3a net7ayal 3lee b7arake baseta ne7na law 8ayrna l version houn mesh la7 n5le yfout 3al onupgrade tmm lakn bel onupgrade mn2olo 3meel delete la table le esmo car w ensh2o mn 2awl w jdeeed ya3ne 3ayet lal oncreate w 3ateha databse stad3eha mara teney fa bhay tare2a 7a yshof eno la2 howe ma 3meel create la heda table le esmo car w howe ma befout 3al oncreate ela iza bado ya3mel create la table fa heek jabrto eno yfout 3al oncreate bt3del l jdeed le 3mlto bel oncreate law ma badak feek ta3mel mobshratn bel onupgrage alter table car w bt3del le badak yeh bas ne7na mne7ke law ba3dna b 3mlyet l tatwer bas law enta mnzleen 3andak l 3alam l application lezm ta3mel 3mlyet ta3del bel onupgrade lesh l2no yemken application ta3lak fe data w l data enta lama te7zef table la7 trou7 tabe3e fa 7a yrou7 fa 7a trou7 kel data ta3et l application fa l afdal law keen application ta3elak fe mar7le neh2eye nezel la nes release bta3mel l 3mlye bel alter table



//hala2 ka ste5dem afdal lal code le 2edeme le howe:
//public final static String DB_NAME="cars";
//public final static int DB_VERSION=1;
//
//public Mydatabase(Context context){
//    super(context,DB_NAME,null,DB_VERSION);
//}
//
//@Override
//public void onCreate(SQLiteDatabase db) {
//    //create table w edafto 3ala databse esmo table car create new table:
//    db.execSQL("CREATE TABLE car (id INTEGER PRIMARY KEY AUTOINCREMENT,model TEXT,color TEXT,distancePerLetter REAL)");
//}
//
//@Override
//public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//    db.execSQL("DROP TABLE IF EXISTS car");
//    onCreate(db);
//}
//}

//yofadal eno asme2 l column 3arefa bara fa final l2no ta7t law bade e7kelo 3mel inser 3al 3amoud le esmo kaza 2aw 3meel update badel ma dal 7afez asme2 l column 5als b3refa b parameter final

//hala2 badna nbalesh bel crud operation badna nafez majmo3a mn l function kel function ela 2awemer m3yane :
//2awl she badna na3mel function ta3mel insert 3ala database hala2 ana 3ashen 2e2dar et3emal bara l class heda ya3ne mn l mainactivity 2e2dar et3emal ma3 databse bade 2a3mel function tkoun waseta bayne w ben heda l class badal ma ektob code bara brateb code jowa function w bestad3eha bas bade:
//bade 2a3el function ta3mel insert la data 3ala databse btrje3 boolena iza raj3et true ya3ne sar fe 3mlyet insert 3ala databse in flase ya3ne ma sar fe 3mlyet inser 3ala databse esmo insertcar hala2 badel ma 2eb3at bel parameter integer id w string name l 2afdal 2a3mel object b class la7alo esmo car 7et fe data w setter w getter w bersel heda l object kemel ka parameter
//hala2 ba3d ma 3mlna class esmo Car b2olo la function l insercar 5od parameter Car car ya3ne enta badak deef object mno3 Car 3ala databse ya3ne hay l method le bada deef data mn l 5erej wazefeta eno ta3tene object mnou3 car w ta3mel insert iza 3mlet insert traj3le true w iza la2 traj3le false hala2 bel mainactivity bseer b2olo db.inserCar() w ba3te object mno3 car
//hala2 jowa hay l methode 2awl she lezm tjeeb mo2sher 3ala databse enta ma badak ta3mel query ya3ne badak tektob sentence so badak ta3mel exute so badak mo2sher 3ala databse 3ashen te2dar tektob sentnce l insert fa jowa l method b2olo SQliteDatabse db=:
//fe 3ande 2 method:getReadableDatabse(),or getWritableDatabse tnaynetoun btraje3lk mo2sher 3ala databse bas wa7de best3mela lal ketebe wa7de best3mela lal kera2a ya3ne ketebe ya3ne iza badak t7ot data 3ala table ya3ne insert wa7de read ya3ne badak ta3mel select ya3ne fe wa7de afdal mn wa7de bel kera2a wa7de afdal mn wa7de bel ketebe:
//law badak te2ra mn database sta3mel getreadabledatabse sho ya3ne: ya3ne bade 2a3mel select
//law badak tektob 3ala database sta3mel getwritabledatabse sho ya3ne: ya3ne badak ta3mel insert,update,drop kel 3amlyet l ed5el w ta3del heye 3mlyet ketebe
//fa hala2 ana bade 2a3mel 3mlyet ketbe ya3ne b2olo sqliteDatabse db=getwritableDatabse(); sar 3ande mo2sher 3ala database
//5oda ka3ede fe tare2ten lal insert:
//1-db.execsql(Inster into....);
//2-db.insert():badel ma ektob kel l query 3mlole method jehze esma insert 2awl parameter heye l table name,tene parameter esma nullcolumnhack mabd2eyan 7ota null,3 parameter esma l contentvalues 2alak l method le esma inser hay btry7ak mn enak tektob l query b2edak 2alak fe 3ande class esmo ContentValues hedl class:
//contentValues:heda l class byeshbah kteer l bundle ContentValues values=new ContentValues() alak badel ma enta deef b query metl insert w heek ana bade ray7ak sta5dem l method le esma insert w b3tlha l data le badak ta3mela insert bel table 3ala shakl class esmo ContentValues l contentvalues bkel wdou7 bzeed data b2lba mn 5elel key w values:
//values.put(String key,values):l7elo bel mawdo3 eno l key howe esm l cloumn ya3ne:
//values.put(Id,10); ,values.put(Color,"Red");
//w law badak t7ot contentvalues jowa contentvalues feek mn 5elel putAll(ContentValues values),w fee kamen she esmo putNull(Sting key) law enta badak teb3at 2eme fadye bas bet7ot l key w btemba3at null


//values.put(CAR_TAB_MODEL,car.getMode()); b2olo 7ot b2lab l model l data le heye ejten ka parameter 5od mena l model
//db.insert(CAR_TAB_NAME,null,values); hay l method btrj3lak long be2oalk l long law tamet 3mlyet l insert berj3lk ra2m l consour le tam edefto ya3ne row number w law ma tamet 3mlyet l edafe berj3lk -1
//return result!=-1;:iza result ma btsewe -1 raj3le true iza btsewe -1 raj3le false 2aw 3mela if else

//hala2 function l insert 5alsenha badnanna3mel hala2 function la n3adel heye nafsa zeta function l insert naf she le maktob ya3ne 7a 2a3mel function esma updatecar btrej3 boolean w bte5od Car object parameter 7a jeeb mo2shser 3ala databse kamen writable l2no ana bade 3adel fa ta3del howe writbale ktebe tene 5etwe kamen bjeeb class esmo contentvalue iza mnla7ez eno 3mlyet ta3del heye nafsa 3mlyet l insert bas le bye5telef howe eno lezm eb3at ma3a shart le howe masln where id=10 aw aye she fa kamen bel content value b7ot data le bade 3adela ok w ba3den ba3mel long result= bas hala2 best3ml method esma db.update() bte5od 4 parameter 2aw wa7de bte5od name of table le bada t3del 3lee ,tene parameter l values le badak t3adel 3lee le howe l content values,3 parameter howe l whereclause howe String le howe shart ta3el l where maslan where id=10:
//2alak where jemle le ba3d l where badak t7ota houn ana malsn bade 3adelo where l model =2015 so "model=2015, 2e5er parameter le howe where args fe t7oto null w byemshe l 7al bas alak:
//fe 3ande sha8le esma whereclause,whereArgs eja 2alak fe 5atar eno teb3at l keme fe nafs jomlet l where lesh? l2no fe 3ande sha8le esma sql injection eno momken l most5dem le beda5el data masln email w password badel ma yda5elak 2015 mesh l car fe b2lab keme t5ayal l user l 3atak hay l keme 2aw t5yal 3anadak parameter tene 7ed l car esmo String t t5ayal eno l user le bado ya3tek hay l 2eme w jomle hay badak trou7 ta3mel where bene2an 3lee ya3ne l 2015 le bed5ela l user  bada teje ma7al l whereclause ya3ne "model="+t example momken l user houn yeb3tlk l string metl heek 2015;DROP table car; fa bel 7arake hay ra7 damar kel jadwal taba3ak hay l 7arake esma sql injection eno mn5elel jomlet l sql yrou7 ya3mel 7a2n la code 5abes bel application ta3elak fa be2de la darar 3ala l program ta3elak fa eja 2alak badel ma 2a3mel heek ftered ana bade 3adel l l where clause l id ya3ne where l id =10 malsn ya3ne badel ma t2olo "id"+car.getid() m bt3mel heek btsheel l keme le heye car.getid() w bt7ot where "id=?" where id equll 3alemet estefhem w bteje bel where args bteb3tlo l id 3ala shakl array l2no l whereargs heye bte5od array l2no momken ykoun aktar mn shart ya3ne where id=10 and color=red masln fa btrou7 bta3mel array String args[]=new String[]{car.getid+""}; w bta3te l args array la parameter l whereargs fa houn badel ma teb3at l keleme bshakl mobashar 3ashen ma 7ada ya3mel sqlinjection eja alak momken ta3mela teb3ta bshakl met25er ya3ne ana ba3d ma 2a3mel l 3mleye best2bela menak 3ebr array lesh array l2no moken ykoun "id=? AND model=?" fa badel ma teb2at bas l id 3al arags houn bteb3at l id w l model betrteb keef katabtoun bel where clause ya3ne String args []={car.getid+"",car.getmodel()+""}
//hala2 la7ez eno l update btrje3 integer mesh long lesh l2no l update btrj3lk 3adad l row le t2asaro b3mleyt l update  law t3dal 20 row 7a yraj3lk 20 w law wala row t3dal berj3lk 0
//return result!=0; ya3ne law keen l result ma besewe 0 ya3ne sar fe ta3del b 3adad mo3ayan mn rows so 7a yrj3lek true ama iza keen result=0 7a yraj3le false eno wala row sar 3lee ta3del
//2aw fene 2olo         return result>0; ya3ne law result 2akabr mb 0 ya3ne sar fe ta3del 3adad m3yan mn rows reaj3le ture iza ma sar fe wala ta3del bel rows  ya3ne result =0 so raj3le false

//hala2 bade 2a3mel function tjeble 3adad l rows b2alb l table ya3ne kam 3osnour t5azan btrje3lee 3adadoun fa mna3mel function n2ol btrje3 long esma getcarscount:
//2awl she bade jeeb mo2sher 3ala databse 5oda ka3ede aye ta3emoul ma3 databse badak mo2sher 3lee:
//Sqlitedatabse db=getreadable() l2no houn ma3am bektob wala 3am 5azen wala she bas bade 2e2ra 3adad l rows keef bade jeeb l 3adad be2ktar mn tare2a:
//1-mn 5elel l query:Select Count(*) from cars;
//2-2aw fe she tene jehez mnjhzeno b class esmo DatabaseUtils. heda l class fe katr mn sha8le momken testa5dema bas houn bade esta5dem function b2labo esma queryNumEntries() hay l function btejblak 3adad l entries ya3ne 3adad l rows bte5od 2awl she database le heye db le enta jebt mo2sher 3lee,tene parameter esm table le badak tjeeb meno 3adad l row w la7ez ,e5er 2 parameter esmoun selection selectionArg metl l where clause wl whereargs ya3ne momken t7ot eno bel selection t2olo where kaza kaza w l arguments le 3am ta3mel 3lee shart t7oto b array w ta3te la parapeter l esmo selection arguments w iza ma badak feek ma tekteboun w hay l functio btrje3lak long bte5od long w bt3merl return result

//hala2 bade rou7 tabe2 heda le 3mlto b activity esma mainactivity


//hala2 badna na3mel function l delete row heye bteshabh function l update btrej3 boolean esma deletecar bte5od parameter object mn nou3 Car:
//2awl she bade jeeb mo2sher 3ala databse w writble l2no ana 3am e7zof mn databse mesh 3am be2ra l2no 3mlyet l delete heye 3mlyet ketebe keef btseer 3mlyet l delete Dekete From car where id=10 msln feha where shart 3ashn ma te7zef kel data le bel table fa ana bade 2a3mel delete masln bene2an 3ala l id so keef keen 3ana whereargs nafs she houn bel delete ba3mel array args w b7et feha delete ba3den best3mel method bel class l sqlitedatabse esma delete hay l method betrou7 bta3mel delete la row 7asab shart m3yan bte5od 2awal she esm table ba3den l whereclause bt7ot "id=?" w e5er she l whereargumnet bta3te l array le feha id w hay l method betrje3 integer 3adad l row le t2asaro ya3ne l effected rows b 3mleyt l delete iza wala row 3mlet delete so btrje3 zero iza la2 3mlet delete btrje3le 3adad l row le n3mloun delete w 2e5er she mn2olo return result>0 ya3ne iza kenet result akabr mn sefr ya3ne n3mal la 3adad m3yan mn row delete so 7a tkoun true ama iza keen result 0 ya3ne ma n3mela la wala row delete so traje3 false

//hala2 badna na3mel e5er wa7de bel crud operation heye delet l retrive l 2esterje3 l data ya3ne reding data l function le bade 2a3mela wazefeta sha8le wa7de eno tro7 3ala table l cars le mawjoud b databse w te2ra meno kel l sayarat le mawjoude fe kel data ya3ne w traje3le yehoun 3ashen est5demoun hala2 keef bada traje3 l data :
//bada traje3oun 3ala sahkl arraylist lesh 3ala shakl array list l2no mante2yan sayrat heye mesh sayara wa7de heye majmo3a mn sayarat ya3ne majmo3a mn rows fa badoun yerja3o 3ala shakl arraylist fa 2awl she ba3mel function bada traje3 arraylist mno3 car ya3ne nou3 l 2eme le bada terja3lna arraylist ta7tewe 3ala sayrat w bade sameha getallcars:
//w 2awl sha8le bade 2a3mela be function l getallcars 3aref arraylist 3ashen 5azen l cars le bade jeboun mn databse l arraylist le 3arafta hala2 fadye 3ashn ektob code w ejleb data mn databse w 5azenha b arraylist w ba3den 2a3mela return
//tene 5etwe bade 2a3mela bade jeeb mo2sher 3ala databse w 7ot eno readable l2no ana bade 2e2ra data ma bade ektob
//ba3den l 3amleye le bade 2a3mela 3mlyet Select wzefetha ta3mel retrive la data enta btest5dema 7asab e7teyejak mazel matlob mene jeeb kel sayarat ya3ne 3mlyet select le bade 2a3mela ma feha where
//fa hala2 best5dem function b2alb l sqlitedatabse esma rowQuery() function bte5od jemlet sql w shwayet 2e3dadet tenye w btrje3lak object mno3 Cursor l Cursor w she byeshbah l Array hala2 shway w 7a neshra7 l cursor hala2 ba3d ma ektob db.rawQuery() bektob 2awl parameter jemlet l select l qeury le bade yeha select * from cars,tene parameter ba3te null lesh null howe tene parameter esmo selectionarg l selection argument heye nafsa l where argument le bas nesta3mel where clause mnest3mla fa houn 7atyta null l 2no ana ma bade est3mel where ma bade est3mel shart l2no ma 3ande shart bade estrje3 kel l data bel table heye selection argument 3ashen eb3at l 2eyam la jomlet l where fa mazel ma 3nde jomlet where houn fa mn7ota null hala2 hay l db.rawquery() btrj3lk Cursor objetc fa enta bt5zena b Cursor objetc hala2 sho howe l cursor:
//db.rawQuery("SELECT * FROM "+CAR_TAB_NAME,null); l object le byerja3 mn hay sentence mno3 Cursor fa b5zno b met8yer mno3 Cursor sho howe l cursor:

//cursor:class byeshbah kteer l arraylist class l cursor be2oalk eno l data 7a terja3lk bshkl table keef heye mawjouede m5azane b table nafs she bas alak 5od belek l data le 7a terja3lk mesh 3ala shakl object l data bterja3lk 3ala shakl byeshbah l 2d array ya3ne l cursor nafso howe 3ebra 3an majmo3a mn rows kel row b2albo majmo3a mn l columns ya3ne l mafroud hala2 temsek kel row w mn5elelo t2olo bade l column kaza w kaza:
//bye7kelak l cursor 2awl ma yblesh l cursor 2awl she howe 3ebra 3an mo2sher metl l mouese taba3 l laptop  eh l cursor 2awl ma yerj3lak mn l query bekoun 3am y2sher 3ala -1 3atoul l cursor bel 3ade 2awl ma yetm enshe2o bekoun 3am y2sher 3ala abl 2awl 3nousor ya3ne 2awl 3nour howe b row 0 fa howe bekoun 3am y2asher 3ala -1  ya3ne 2awl sha8le badak tefhama eno 2awl ma 7a temsek l cursor la7 ykoun m2sher 3ala -1 fa badak temshe 3ala l 3nsour tene 3ashen tblesh te2ra data howe 2awl ma yebda2 bekoun 7eseb 7sebo eno lisa ma kara2t fa bekoun 3ala l -1:
//enta hala2 3ashen temshe 3ala l row le ba3do badak t2olo moveToFirst 2aw moveToNext:
//moveToFirst:3atoul bt5lek t2asher 3ala 2awl 3nour ya3ne law keen l cursor 3ala l -1 w 2oltelo movetofirst la7 yseer 3al 0 w law keen 3al 4 w 2eltelo movetfirst la7 yeje 3ala l 0 kamen fa 3atoul l movetofirst 7a tjebak 3ala 2awl 3nour 2aw 3end ya3ne 3end 2awl row
//moveToNext:3atoul bte5lek t2asher 3ala 3nsour le ba3do ya3ne law kent 3end l -1 w 2oletelo movetonext 7a twadek 3ala l 0 2awl row ama iza kenet 3end l row 4 w 2oltelo movetonext 7a twadek 3ala l 3onsour l 5ames
//fa hal2 ana 3atol 2awl ma balesh lezm 2olo movetofirst 3ashen ten2lak mn -1 3ala 2awl 3onsour
//hala2 l cursor sar be2sher 3ala 2awl 3nsour 0 row 0 fe 3andak majmo3a mn data b heda row keef badak tosala 2alak l data hay bterja3lak keef ma heye mawjoude 3ala database ya3ne bterja3lak 3ala 7asab l 3amoud le m5azanae  l 3amoud l 2awl tar2emo 0, l 3amoud tene 1 l 3amoud telet 2 l 3amoud rabe3 3 fa ana 3ashen e7kelo bade jeeb l model taba3 l 3osnour l 2awal fa bade e7kelo 5ale l cursor y2asher 3ala l row 0 l 3onsur l 2awl w 3atene l keme l mawjoude bel 3amoud number 1 l2no l3amoud number 0 majoud feha l id mesh l model law bade l l color l mawjoude bel 3onsour 4 fa ba3mel moveto next 5ale l mo2sher y2asher 3ala l 3onour l 4 ya3ne row 3 jeble l keme l mawjoude b column 2 lesh l2no b column 0 l id column 1 l model column 2 feha l color
//3ande method esma moveToLast:bten2el l cursor 3ala 2e5er 3osnour
//3ande method esma movetoPreveious:bten2elne 3al 3nour le 2ablo btrje3ne 5otwee la wara  ya3ne law kenet 3end l 2 w 2olt movetoprevious bte5dne 3ala 3nour ra2m 1
//fa hala2 le 7a 2a3mlo :
//1-2awl 5otwe movetofirst la ente2l 3ala 2awl 3nsour fa 5als enta bas t2olo getcolumn(0) fa 7a yjeblak data le bel id getcolumn(1)7a yjebalk l model getcolumn 2 yjeblak color...etc
//2-berja3 b2olo movetonext() w 3atene l 3amoud l 2awl w tene w telet w rabe3 berja3 b2olo moveto next w 3atene l 3amoud l 2awl w tene w telet w rabe3 heeek la emshe 3ala kel table mn 5elel heed l kalem mnefham bade loop la nafez heed l kalem bedale 2a3ml heek la 2osal la 2e5er 3nous bas yraj3le false befham eno 5alas sar 3end 3osour 7a yrj3le l cursor false 3ashen efham eno wa2ef l loop

// if(cursor.moveToFirst()){
//hala2 bjeeb data:
//2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
//int id=cursor.getInt(0);
//l model  string so getstring() w ba3te l index taba3 l model le howe 1:
//String model=cursor.getString(1);
//l color string so getstring() w ba3te l index taba3 l color le howe 2:
//String color=cursor.getString(2);
//l dpl double so getdouble() w ba3te l index taba3 l dpl le howe 3:
//double dpl=cursor.getDouble(3);
//
//
//        }

//bas hay tare2a bas 7a tjeble l 3osnour wa7ad fa bade 2a3mel loop fa best5dem do while lesh:
//l2no ana 2oltelo rou7 nafez l code int id=cursor.getInt(0);,String model=cursor.getString(1),String color=cursor.getString(2);,double dpl=cursor.getDouble(3);2awl mara l2no 2awl mara ana eyelo if cursor.movefirst() 3meel doo while fa ana houn 2awl mara bel if 7awlto 3ala 2awl 3onsour fa howe telk2eyan we2ef 3end 2awl 3nour law ana mobshratan 2eyelo while l cursor.movetonext() hayde l fucntion bten2elne 3ala l 3osnour tene law ana 3meel if(cursor.moveto first) rje3t joweta 7atet while(cursor.movetonext w joweta 7atet 2e2ra data fa heek la y2afe 2awl 3onsour la7 ye2ra de8re tene 3osnour fa 3ashen edman eno 2e2ra data 2awl 3nosur ba3mel do while b2olo nafzle l code ba3den 3meel cursor.movetonext w tab3an cursor.movetonext btrje3le true iza keen fe 3osnour next fa houn 7a ydalo ya3mel next talama movetonext 3am traje3 true




//hala2 law ana bade zeed column bel dtabse 7a etar bkel jomlet select mest3mela 8ayer tare2em l column lesh ln2ol 7abet deef column ba3d  id esmo speed 7an etar 8ayer kel tar2em l column le houn el model color dpl bel cursor.get(index)
//fe tare2a a7la mn hay eno enta feek tjeb l inddex taba3 l column b 2esm l column ya3ne 3ande function ba3teha esm l column btejble l index ta3elo function mawjoude bel cursor esma cursor.getColumnIndexOrThrow() w bta3teha esm l column been pracket keen fe wa7de abla esma getcolumnindex bas hay momken traje3 -1


//badna na3mel mehod search ma bade method traj3le kel table kel data la2 bade wa7de search bta3mel search 3ala model car m3ayan:
//hay l method le exma searchcar bte5od String model l2no ne7na badna nraje3 data 7asab l model l user talabo ya3ne 3atene kel sayarat l model ta3eloun 2010 fa btrdlak data le btable l  feha l model kola 2010

//hay l method kamen nafs she btrod array w badna nest3mel l currsor
//metl ma3mlna abl shway arraylist ba3den mo2sher 3ala databse readable
//ba3den mn3mel cursor=db.rawQuerye() bas hala2 BNESTA3MEL l parameter le esmo selection argument l2no houn badna nest3mel l where l2no ne7na badna na3mel search 7asab l model ya3ne where model equll kaza w ba3den badna na3mel array 3ashen l argument n7ot fe l model 3ashen ne7na badna where model equll kaza fa mn7ot bel argument clause le fe b2albo l modelSearch w mna3mel select * from cars where model=? w bel argument clause  mn3te array l value ta3el l model le heye l user le 7a ya3tena yeh
//w ba3den be2e l eshay nafs le 3mlne bel method le btjeeb kel l data bel table


//hal2 feek ta3mel mehod nafsa bas ta3mel malsal select * from car where model like? w bel array t7ot %+model+% fa heek iza 7atet gygygyg2015gyuguy bye2ralak yeha
public class Mydatabase extends SQLiteOpenHelper {

    public final static String DB_NAME="cars";
    public final static int DB_VERSION=1;
    public final static String CAR_TAB_NAME="car";
    public final static String CAR_TAB_ID="id";
    public final static String CAR_TAB_MODEL="model";
    public final static String CAR_TAB_COLOR="color";
    public final static String CAR_TAB_DPL="distancePerLetter";


    public Mydatabase(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table w edafto 3ala databse esmo table car create new table:
        db.execSQL("CREATE TABLE "+CAR_TAB_NAME+" ("+CAR_TAB_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+CAR_TAB_MODEL+" TEXT,"+CAR_TAB_COLOR+" TEXT,"+CAR_TAB_DPL+" REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+CAR_TAB_NAME);
            onCreate(db);
    }

    public boolean insertCar(Car car){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(CAR_TAB_MODEL,car.getMode());
        values.put(CAR_TAB_COLOR,car.getColor());
        values.put(CAR_TAB_DPL,car.getDpl());
        long result=db.insert(CAR_TAB_NAME,null,values);
        //OR
        //db.execSQL("INSERT INTO car (model,color,distanceforlitter) VALUES ("+car.getMode()+","+car.getColor()+","+car.getDpl()+")");
        return result!=-1;
    }

    public boolean updateCar(Car car){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(CAR_TAB_MODEL,car.getMode());
        values.put(CAR_TAB_COLOR,car.getColor());
        values.put(CAR_TAB_DPL,car.getDpl());
        String [] args ={String.valueOf(car.getId())};
        //car.getId()+"" or tostring() class l string ya3ne
        int result=db.update(CAR_TAB_NAME,values,"id=?",args);
        //OR
        //ba3mel db.exc(update set....etc)
        return result>0;
    }

    public long getCarsCount(){
        SQLiteDatabase db=getReadableDatabase();
        long result=DatabaseUtils.queryNumEntries(db,CAR_TAB_NAME);
        //law badak testa3mel selection w selection arg:
        //String [] args ={"10"};
        //long result=DatabaseUtils.queryNumEntries(db,CAR_TAB_NAME,"id=?",args);
        //raj3le 3adad l rows le l id ta3eloun equll 10

        //or tare2a tenye:
        //db.execSQL("SELECT COUNT(*) FROM "+CAR_TAB_NAME);
        return result;
    }

    public boolean DeleteCar(Car car){
        SQLiteDatabase db=getWritableDatabase();

        String [] args={String.valueOf(car.getId())};
        int result=db.delete(CAR_TAB_NAME,"id=?",args);

        //feek enta mesh darore teb3at l car ka object yemken teb3at String x w b2alb l array int ars={"%x%"} w ta3bel db.edlete(Car_tab_name,"model LIKE ?" ,args ya3ne 7zefle l row le l model like jomle l user b faweta ya3ne la n2ol l x kenet 2020 fa 3mle delete la row le model ta3ela b2lbo 2020 metl ya3ne iza keen l model dededed2020dfee 3mle delete la heda row

        //w feek ta3mel delete btare2a tenye le heye excute qury ya3ne db.excsql("Delete...etc")
        return result>0;

    }

    public ArrayList<Car> GetAllCars(){
        ArrayList<Car> cars=new ArrayList<>();
        SQLiteDatabase db=getReadableDatabase();
        //know cursor in row -1 w hay jomle kola raj3lek table metl le mawjoud bel database mra2m rom mn 0 w l column 0 w howe bekoun 2awl ma 3mlne 3ala l -1
        Cursor cursor=db.rawQuery("SELECT * FROM "+CAR_TAB_NAME,null);
        // hay fa7stlk eno hal fe keyam bel cursor wala la2 w iza l 3onour l 2awl mawjoud 2aw la2 l2no l cursor lezm 2awl ma yerja3 ykoun fe b2labo kel table ma howe berja3 data metl shakl dataabse table w cursor.move.tofirst btshoflak bten2lak 3ala 2awl 3onour l2no 2awl ma na3ml l cursor bekoun 3al -1 w btrj3lk true iza fe b2alb 2awl row data iza la2 btrje3 false  iza hala2 l cursor 3ned l 3onsour l 2awal l 0 row 0 l move to first btrj3lak boolean ya3ne iza nta2al 3end 2awl 3nousur w fe 3osnour berj3lak treu iza ma fe 3osnour false ya3ne fene 2olo iza l cirsor.movetofirst raja3 true jeble meno data iza false
        if(cursor!=null && cursor.moveToFirst()){
            //hala2 bjeeb data:
            //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
            do{
                //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
                int id=cursor.getInt(cursor.getColumnIndexOrThrow(CAR_TAB_ID));
               //l model  string so getstring() w ba3te l index taba3 l model le howe 1:
               String model=cursor.getString(cursor.getColumnIndexOrThrow(CAR_TAB_MODEL));
               //l color string so getstring() w ba3te l index taba3 l color le howe 2:
               String color=cursor.getString(cursor.getColumnIndexOrThrow(CAR_TAB_COLOR));
               //l dpl double so getdouble() w ba3te l index taba3 l dpl le howe 3:
               double dpl=cursor.getDouble(cursor.getColumnIndexOrThrow(CAR_TAB_DPL));

               //hala2 ana bade raje3 l data ka array list so kel mara bye2rha ba3mel object car w b7eta bel arraylist
                Car car=new Car(id,model,color,dpl);
                cars.add(car);
            }while (cursor.moveToNext());

            //hala2 mafroud ba3d ma t5les kera2a mn cursor tsaker l cursor cursor.close() hala2 howe telk2eyan beskro bas y5les bas l a7san tsakro yadaweyan
            cursor.close();

            //hala2 bel move:
            //3ande movetopostion() bta3te aye postion berou7 3lyha
            //3ande moveto() bta3te kamen postion perou7 3lyha



        }
        return cars;










    }

    public ArrayList<Car> SearchCars(String modelSearch){
        ArrayList<Car> cars=new ArrayList<>();
        SQLiteDatabase db=getReadableDatabase();
        //know cursor in row -1 w hay jomle kola raj3lek table metl le mawjoud bel database mra2m rom mn 0 w l column 0 w howe bekoun 2awl ma 3mlne 3ala l -1
        Cursor cursor=db.rawQuery("SELECT * FROM "+CAR_TAB_NAME+" WHERE "+CAR_TAB_MODEL+"=?",new String[]{modelSearch});
        // hay fa7stlk eno hal fe keyam bel cursor wala la2 w iza l 3onour l 2awl mawjoud 2aw la2 l2no l cursor lezm 2awl ma yerja3 ykoun fe b2labo kel table ma howe berja3 data metl shakl dataabse table w cursor.move.tofirst btshoflak bten2lak 3ala 2awl 3onour l2no 2awl ma na3ml l cursor bekoun 3al -1 w btrj3lk true iza fe b2alb 2awl row data iza la2 btrje3 false  iza hala2 l cursor 3ned l 3onsour l 2awal l 0 row 0 l move to first btrj3lak boolean ya3ne iza nta2al 3end 2awl 3nousur w fe 3osnour berj3lak treu iza ma fe 3osnour false ya3ne fene 2olo iza l cirsor.movetofirst raja3 true jeble meno data iza false
        if(cursor!=null && cursor.moveToFirst()){
            //hala2 bjeeb data:
            //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
            do{
                //2awl she l id l id integer so getint() w ba3te l index taba3 l id le howe 0:
                int id=cursor.getInt(cursor.getColumnIndexOrThrow(CAR_TAB_ID));
                //l model  string so getstring() w ba3te l index taba3 l model le howe 1:
                String model=cursor.getString(cursor.getColumnIndexOrThrow(CAR_TAB_MODEL));
                //l color string so getstring() w ba3te l index taba3 l color le howe 2:
                String color=cursor.getString(cursor.getColumnIndexOrThrow(CAR_TAB_COLOR));
                //l dpl double so getdouble() w ba3te l index taba3 l dpl le howe 3:
                double dpl=cursor.getDouble(cursor.getColumnIndexOrThrow(CAR_TAB_DPL));

                //hala2 ana bade raje3 l data ka array list so kel mara bye2rha ba3mel object car w b7eta bel arraylist
                Car car=new Car(id,model,color,dpl);
                cars.add(car);
            }while (cursor.moveToNext());

            //hala2 mafroud ba3d ma t5les kera2a mn cursor tsaker l cursor cursor.close() hala2 howe telk2eyan beskro bas y5les bas l a7san tsakro yadaweyan
            cursor.close();

            //hala2 bel move:
            //3ande movetopostion() bta3te aye postion berou7 3lyha
            //3ande moveto() bta3te kamen postion perou7 3lyha



        }

        return cars;








    }



}
