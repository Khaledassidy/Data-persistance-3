package com.example.datapersistance3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/*
DATABASE: heye tare2a mn toro2 l data presistance le ta5zen l data 3ala l jehez

abl ma nfout bel database w na3ref keef nesta3mela lezm na3ref sho l fekra mn este5dema w sho l fekra mn enshe2a:
ne7na la7ed hala2 keen 3ana 3 toro2 la ta5zen data ken 3ana shared preferance,internal stroage,external storage sho le 5alehoun yelja2o la fekret database?

eza badna netzakar aymta kona nesta5dem:
shared preferances:kona nesta3mela 3ashen n5azen data z8ere ya3ne law 3ana data kbere ma btenfa3 shared preferances
internal storage,external storage:enta ma bte2dar ta3mel file w t5azen data 3lee bas badna nes2l so2al ne7na 3ana table hala2 mratab bshakl kel jehez electrone sho naw3o iza mobile,laotop w sho se3ro w aymta 3mloo hay l data law 2olnelak sho tare2a l momken 5azena 7a t2ole file 3ade 3ade brou7 ba3mel file 3al internal storage 2aw external storage w ba3mel printwriter w bektob 3a heda l file kel hawde l ma3lomet bas fee ba3d l mashekl momken tetla3 law enta sta3mlt l file ma bten7al hay l mashekl ela be2st3meel database sho heye hay l mashekl:
l 7ajm:law enta 3andak table fe b2albo 100000 montaj electrone w l 1000000 montaj badak tet3mela ma3a 3ala l file ya3ne badak t5azena 3ala malaf w te2raha mn l malaf hal betwejed so3obe wala bte2raha b sohle akeed 7a twejeh so3obe enta 3andak ma3lomet la 100000 montaj 2awl 7aje 7a twejeh feha so3obe bel ta5zen ,bel ker2a 7a t2ole ba3mel loop w be2rha b sohole 2oltelak meshe reje3 2oltelak 7aznle heda satr b line 100 bel file 7a tetta3 trou7 tefta7 l malaf te2ra 2awl 99 satr terja3 ten2oloun 3ala file jdeed terj3 t5anzen l satr l 100 terja3 ten2ol be2e l line ya3ne 2osaa tawele 3areda fa 2awl she  so3obe lama tet3ml ma3 file l 7ajm law l data 7ajma kbeer la7 twejeh so3obe fe ta5zen data
l de2a:sho de2a alak law badak t5azen data b de2a m3ayane sho ya3ne ana masln ana bade ef7as heda ra2m 2awl ma yda5lo  bade shof hal heda le da5lo ra2m wala mesh ra2m tare5 masln yemken ykoun bade tare5 2am yda5le mesh tare5 yemken bade tare5 2elo namt mo3ayan bade bas yda5el l data ykoun 2elo sal7eye mo3yane yemken ana bade nou3 m3yane mamno3 yda5lo ela iza keen mawjoud b maken tene fa de2a l 5asa bel data enta feek ta3mela bel file bas betkoun b tare2a as3ab ma iza kenet mest5dem database
l security:w heye ahm sha8le enta lama t5zen data 3ala file sawe2 keen bel internal 2aw external ma bte2dar temna3 l user eno yosal la hay l data ya3ne enta law 7afzt data bel extrnal stroage bye2dar aye 7ada yshof l file heda w ye2ra kel data 7a t2ole momken ana 5azno bel internal storage ma enta law 5aznto bel internal storage l code le bye2ra l ma3lomet mn l file yemken ye2ra kel l data ta3et l 100000 3onsour  a7yenan ana be7je 2e2ra malsn khaled ye2ra 2awl 1000 3onour mhmad ye2ra tene 1000 3nsour fa houn bteje ma bda2 security bade sha5s ma ye2dar yosal la data  m3ayne sha5s tene ye2dar yosal la data m3ayane  fa iza bade 7ola fene 7ola bel file bas kteeer sa3be fa ama bel database sahle
l tekrar:enta bel file iza deft ma3lomet montaj mo3yan w jeet ba3d shway deft nafs l ma3lomet fa  ma fe she yemna3ak enak deef nafs l a3lomet yemken l ma3lomet tetkarar keef badak t7ola bel file la7 tet7tej code kteer sa3b la t7la ama bel database betr7k btest5dem kelme wa7de primary key bt7olelak yeha
l 2ahmeye:yemken data le 3andak tkoun moheme jedan w badak ta3mel sal7eyet eno nees m3yne tosala w nes tenye mamno3 tosala tab3an ma feek ta3mela b sohole bel file ama bel databse hayne
l estebdel override:ya3ne enta fee ma3lomet m3yane badak testbdela badak t3adel 3lyha bel file 3mlyet l ta3del bshakl 3am bel file sa3beeeee kteeer kteer ama bel databse bsatr wa7d be7ola

haw 6 mashekl le 7kena 3anon bel file mesh eno ma byen7alo bel file laken sa3b kteer teje t7eloun bl code bel file m3ana tenye enta la7 tetar tektob code kteeeer la t7ol heek mashekl bel file fa 3ahen y7lolak yeha fa ejo 2alo badna nray7k badna na3mel sha8le esma database databse bt7olelak l mashekl 6 le 7kena 3anon


databse:3ebara 3an system besta3mlo la ta5zen data ela haykaleye m3ayane hay data btet5zan b maken m3yan demn kawa3ed mo3yane be7deda sa7eb l data wa2t kona 3am ne7ke 3an l montajet l electroneye hay data kenet ela namt m3yan keef ya3ne heye 3ebra 3ala shakl table kel montaj elo esm ra2m nou3 se3r tare5 ma fe wala montaj ma elo heek data 2aw elo aktr mn 8ayro fa 2alak ana momken et3mal ma3a bshkal afdal b l file 2aw external storage 2aw internal stroage keef beste5dem databse fekreta eno bt5zen data 3ala sahkl tables w databse tab3an bekoun ela esm bekoun 3anda majmo3a mn tables kol table elo esm m3yan w kel table ela coloum m3yane w kel coloum elo esm m3yan yemken ykoun kel 3amoud 3ando 5asa2es m3yane ahm she ykoun l data la test5dme l databse tkoun data ela hayklye m3yane ykoun namat wa7ad ya3ne 3nour elo ra2m w nou3 w 3onsour tene ma 2elo esm w nou3 elo bas se3r w tare5 eja 2alak ana bedmlak law sta3mlk l database 6 mahekl hayde bten7al btare2a ashl b kteeer mn enak t7ela bel files internal external storage bas 5od belak ana 2oltelk mesh ya3ne eno l mashekl le mawjoude bel file ma bten7al la2 momken ten7al bas te7tej code kteer kbeeer ama b 2ste3ml database bten7al btare2a kteer sahle abst mesel law 2eltelak 3adele satr 100 5ale badel ahmad esm khaled la7 tseer code kteer kbeer yemken ma 2a3ref 7ola la7 tet3a2ad


ERD digram:tab3an databse ela shakl masln rasme m3yane betbyen keef data mertebta ba3da esma erd entity relation digram tab3an betbyemalk keef data mertebta ba3da b relation w relation 3ala anwa3 metl one to one ,one to many many to many many to one erd btfarjek ween primary key foren key w keef mertebten...etc

note:databse le enta btet3mal ma3 hayde heye bel 2e5er 3ebra 3an file ya3ne heye bterja3 3a mabda2 l internal storage heye 3ebra 3an file btem ta5zeno bel internal storage bas le btefre2 houn fe manager fe wa7ad mas2ol 2e3ed be7tlak kawe3ed be2olak badak t5zen data lezm ykoun ma3ak 1,2,3 badak te2ra data lezm ta3mel 1,2,3 fa fena ne7ke nezam motakemel b deer 3mlyet ta5zen zmane lama kont t5zen b file bel internal storage 2aw external storage ma keen 7ada byo7kmak b 3mlyet ta5zen data kont enta tefta7 l file w t5azen mobeshratan w te2ra data ama bel databse 3andak kawa3ed bt7kmak iza alak l programer masln heda l colmn ma byod5oul fe ma3lomet fer8a fa enta mamno3 da5el fe ma3lomet fer8a iza l programeer 7adad eno heda l column primary key so mamno3 tkarer w ykoun null fere8  2emto iza 7adad eno unique mamno3 yetkrar fe kawa3ed bte7koum b 3amlyet ta5zen bel database


keeef bade ana et3emal ma3 database enta 3am t2ole eno hay tare2a heye nafsa bas t5zen data 3ala files ana bel files kont 2a3m create la file write in file,read in file bel databse bta3mel nafs she bas mn 5elel waset ya3ne mesh enta directly btektob 2aw bte2ra  3ala l file la2 enta btest5dem waset 3ashen yet3emal ma3 l databse asln heye file databse  bel 2e5er bas mn 5elel waset enta btet3emal ma3a l waset heda bery7ek mn kel she8l le keen yta3bak bel files hala2 sho hene l operations le 3amlyet le momken tet3mal ma3a bel data base alak 4 3amlyet:

l 4 3amlyet besmouhoun  CRUD operations:
C Create:enta badak ta3mel table fa heda l mostala7 esmo create aye 3amleyet edafe 3ala databse mnsameha create
R Retrieve:ana bade read la data mn databse w bade 2o3rouda lal user fa hay l 3amlye m sameha retrive esterje3
U Update:ta3del law enta badak t3adel data m3ayene bel databse badak t3adel 3amoud m3yan esmo update law keen mnsat3eml alter table 2aw she bas kolo byeshmel update operation
D Delete:iza enta badak ta3mel delete la data m3yane badak ta3mel delete la table m3ayan 2aw la 3amoud m3ayan kola hay delete operation



hala2 enta bel android sho database le badak testa5dema?
SQLite Databse

SQLite Databse: heye Relation database 2awl she lezm na3rfo 3an l sqlite eno heye file bel neheye ya3ne  file  byet5azan  bel internal storage bel application ta3elak l file heda ma bye7tej server 3ashen ysha8lo fe ba3d databse metl l mysql w sql server,oracle hawde databse byelzama server 3ashen teshte8l ya3ne lezm ykoun fe bornemej l bornemej heda mn 5elelo enta btet3emal ma3 databse sawe2 create,retrive...l crud operation kol l 2omour hayde lezm tem mn 5elel waset howe server laken 3ana bel android mesh lezm ykoun fe bornemej waset l2no l operating system 2aw l classes 2aw l api l mawjoude bel android nafso heye le btetwala hay l 3amlyet fa l android asesan mosamam  5esesan yet3emal ma3 databse hay ya3ne hayde ma bte7tej bernemj waset  lesh bas nasel my sql mne7tej bernemej waset l2no le samam l window ma samam eno yet3emal ma3 database sql fa menazel bernemj waset laken le samamo nezam l android 7ato be beloun eno databse le badak testa5dema sqlite fa samamo bernemej de5el nezam nafso 2aw clases 2aw api waseta de5el nezam nafso bhes eno tetwala 3amal ta3amoul ma3 l file heda so l sqlite ma byelzama bernemj enta mobashratan enta btet3emal ma3ha mn l android tab3an fe 5asa2es kteer lal sqlite btetmayaz eno 7ajma z8eer fe ela limitation 7odoud mo3yane eno 3adad l jadewel feha la7ed 3adad m3yan 3ada l 2a3mede bkel jadwal la7ed 3adad m3yan kamen l data la7ed m3yan tab3an l 7ad heda 7ad kteer kbeer bel nesbe 2elak la wa7ad bado ya3mel application bekfek w bzeed bas houne bshakl 3am 3emlen statistics 3ala databse hayde limitation ta3ela mawjoude kola 3ala l website ta3loun
bas ana me3ne hala2 be limitation wa7de heye datatype:
tab3an database ela anwa3 baynet metl programmming language ela anwe3 data anwe3 l data hayde bet3aber 3an l data le m5zane bede5elha fa ana bas 2ol bade 5azen:
Integer:3adad sa7e7 example:1,2,3 fa b3ref nou3 ka Integer bel sqlite
Null:2eme fer8a
Real:3adad 3ashre mesh float wala double bas fe tare2a bel sqlite bt5lek tektob float,double w kel hawde
Text:2eme naseye text 3ade aye nous
BLOB:Object le howe Binary Large Object 3ashen n5azen object kemel law fe 3ande soura  law 3ande file kbeer bade 5azno bade shafro besta5dem BLOB Bianry large object

bel sqlite 3ande naw3en mesh mawjouden:
Boolean:l heye true,false
DataTime:3ashen 5azen tare5 w wa2t

bas moken beste5dem hawde:Integer,Real,Text,BLOB,Null ne2dar nest5dem l boolean ,DataTime keef ya3ne

Boolean:eja 2alak l Integer be3aber 3an 3adad sa7e7 mazbout heda she fa law 5aznt 0,1 momken te3tebz 0 false w l 1 true fa ana bas bade et3mal ma3 boolean be7t nou3 integer w b5azen ya 0 ya 1 wa7de bet3ber 3an flase wa7de bet3ber 3an true bas howe mesh la7do byefham enta ka programmer btseeer bet2ol law kenet l 2eme 0 rou7 3meel kaza kaza ka2nak 3arefa false law kenet l 2eme 1 3meel kaza kaza ka2na 3erefa true w heek...
DateTime:fe 3ande 3 toro2 et3emal ma3a be2ste5dem l anwa3 hayde Integer,Real,Text,BLOB,Null :
1-tet3mal ma3 ka text ka string ya3ne bed5lo ka text
2-2aw momken t5azno ka 3adad 3ashre Real btesta3mel ela tare2a takwem
3-2aw tare2a 3 tsta5dem l integer


ba3d l mostala7t lezm na3refa 3an l column momken n3ref l column heek
Priamry key:howe enta bte7t la heda l column eno primary key ya3ne mamno3 7ada ykoun metlo Uniqe w mamno3 bnafs l wa2t ykoun null
Unique:bas eno mamno3 7ada ykoun metlo
Foregn key:howe bekoun primary key bas b table tene ya3ne table x 3ando column esmo id_car ok howe Foregn key momken ykoun bheda table metkarer 2aw null fa btable y howe bekoun primary key mamno3 ykoun b table y metkarer 2aw null
AUTOINCREMENT:kel mara bzeed 1 ya3ne 2awl mara da5lt data keen 1 ba3den tene mara bseer 2..etc w feek t7aded adesh ynot yemken badak yeh y2fouz tnen tnen w feek kamen t7aded eno ma yblesh mn 1 yblesh masln mn 50 ba3den yseer 51..etc
NOT NULL:mamno3 heda l column ykoun null
check:to ensure that values in column satisfy a specific condition
Default:iza heda ma t3ama 7ot ra2m kaza by deffult masln 5 iza ma 7atynee
%:ma3neta aye she mawjoud exmple %khaled ya3ne aye kalem mawjoud sho kaen ad ma keen 7ajmo ba3den esm k
____K:ma3neta kelme met2lfe mn 5 a7rouf w e5er 7arf lezm ykoun 5
*:ALL




operation on database CRUD operation by programming using Query :

-Create TABLE:
iza bade enshe2 table bel database:

-CREATE TABLE car (id INTEGER PRIMARY KEY AUTOINCREMENT,model TEXT UNIQUE,color TEXT NOT NULL,distanceForLitter REAL);

sho ma3neta:houn ya3ne enshe2 table esmo car w ba3den fta7 2 braket la 2olak sho fe column b2alb l heda table b3ref l column been braket balesh l 3amoud l 2awal esmo id naw3o integer ba3d l esm b7ot datatype ba3den primary key ya3ne heda l 3amoud unique and not null ba3den autoincreament ya3ne zeyede telka2eyan ya3ne ma bade 2a3te 2eme 5ale yblesh b 1 w kel mara zawed 3lee 1 ya3ne enta 2awl ma da5el 2awl sayara la7lo 7ay3tek l id 1 tene sayra la7lo bya3tek 2 false 3ashen ben column w column false tene column esmo model howe naw3o text ya3ne string howe unique mamno3 yetkarar ya3ne law deft syara mn nou3 2019 mano3 deef mara tenye sayra mno3 2019 false telete column esmo color nou3 data type text w not null ya3ne mamno3 tetrko fade lezm t3be fasle 4 column distanceforlitter nou3 datatype real 3adad 3ashre 5ast bsaker l braket w simicolumn


-Delete Table:
iza bade 2a3mel delete la table m3yane:

-DROP TABLE IF EXIST car

sho ma3neta:eno 3meel delete la table iza keen mawjoude esmo car ba3den simicolumn


Alter TABLE:
iza bade 3adel 3ala table m3yan zeed column el8e column:

-ALTER TABLE car ADD manufactureDate Text;
-ALTER TABLE car DROP COLUMN manufactureDate Text ;

sho ma3neta:ya3ne 3adel 3ala table le esmo car w zedle column esmo manufactureDate w now3o la heda l column text w ba3den simicolumn



INSERT INTO:
iza bade zeed data 3ala table ya3ne bade zeed row 3al table 2aw besmoha bade zeed entry m3yan:

-INSERT INTO car (model,color,distanceforlitter) VALUES (10,'2019','RED',11.8);


sho ma3neta:ya3ne zeed 3ala l table l esmo car w befta7 w braket lesh 3ashn l column le bade zeed 3lyhoun data l2no momken enta ma badak tzeed 3ala kel l 2a3meda badak tzeed bas 3ala 3amoud wa7ad iza l condition byesma7lk ba3den b7ot values l 2eyam befta7 2 bracket w bdeef b2alboun b7ot data be tarteb ya3ne 2awl she l model ba3den l color ba3den l distanceforlitter w bsaker l bracket w simicolumn



UPDATE:
iza bade 3adel data b row m3yan:

-UPDATE car SET model='2020',color='Blue',distanceforlitter='15' WHERE ID=10;


sho ma3neta:ya3ne rou7 3adel b table le esmo car l model 5ale 2020 w l color 5ale blue w distnce 15 3adel kel haw b row l id ta3elo = 10 iza ma7tet where kel l row le btable 7a ysero 3ando l model 2020 w l color blue w diatnce 15


DELETE:
iza bade 2a3mel delete la row m3yan be table m3yan:

-DELETE FROM car WHERE id=10;

sho ma3neta:ya3ne 3mle delete mn table le esmo car row le b2labo l id = 10 iza ma 7atet where 7a ya3mel delete la kel l rows bel car bas ma ya3mel drop bas byem7e kel data le b2lab l table le esmo car





RETRIVE:
iza bade 2o3oud data 3al user fa bade 2a3ml query w bade esta3ml kelmet SELECT:

*:MEAN ALL KEL L 2A3MEDE

-SELECT * FROM CAR;
ma3neta:eno jeble kel l column mn table l esmo car ya3ne 7a yjeblak kel table le esmo car

-SELECT * FROM car WHERE model='2015';
ma3neta:eno jeble kel l column le btable le esmo car le 3andoun model =2015 le row ta3eloun l model equll 2015

-SELECT * FROM car WHERE MODEL LIKE '%2015%';
ma3neta:eno jeble kel l column le btable le esmo car le 3andoun l model like ma3neta metl le 3andoun le model metl hyde l keme ya3ne iza l model byetshebh ma3 hay l keme %2015% raje3le yeh %2015% ma3neta l % ma3neta aye she maktob houn text number w ad ma keen 7ajmoo ba3den bado ykoun ba3da 2015 ba3den aye kalem byeje ba3d l 2025 metl heek masln khaled2015maya hyde ma2bole masln 2aw decewcewwrvrwvrw2015fjrfjbfbrcn kamen hay sa7 l % btesta3ml 3atoul ma3 like like ma3neta eno ye7tewe 3ala 2015 mesh yeswe 2015 ya3ne yebda b 2aye she w yentehe b2aye bas l mohem bel nous fe 2015

-SELECT * FROM car WHERE MODEL LIKE '2015%';
ma3neta:eno yblesh b 2015 w yenthe b aye she

-SELECT * FROM car WHERE MODEL LIKE '%2015';
ma3neta:eno yebda2 b aye she bas l mohem yentehe b 2015

-SELECT (id,model) FROM car WHERE model LIKE '%2015%';
ma3neta:raj3le l column ta3el l id w l column le esmo model bas mn table le esmo car le 3andoun l model byebda2 w byentehe b aye she l mohem bel nous fe 2015






la nrou7 la matra7 l implimntation ta3amoul ma3 database bseer mn 5elel tare2ten:

Native:SQLiteOpenHelper or API:RoomDatabase

Native:eno toktob l sql mobasharatan eno toktob jomal l sql bshakl yadawe bel bernemej w ta3mel kel sha8le b2edak tare2a 5am metl ma be2olouha be2ste3mel class esmo Sqliteopenhelper w hay tare2a le na7 nesta3mela
API:howe she jehez mn google esmo roomdatabase demn she esmo architure commponent l roomdatabse bte3temd bshakl asese 3ala l object orianted



















 */










public class INTRO_DATABASE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}