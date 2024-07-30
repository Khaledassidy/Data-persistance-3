package com.example.datapersistance3.NativeDatabseImpliment_External_Databse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

import com.example.datapersistance3.NativeDatabaseImpliment_internal_Database.Car;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

/*
ma3lomet le 2a5denha 3an databse 2abl kenet kola ta7t etar internal databse internal database ma3neta databse de5le 2aw ma3neta databse btem enshe2a mn l code
External Databse:ma3neta databse 5arejeye ya3ne btem enshe2a bshakl 5ereje w tasderha w esteradha nesta5demha ka block jehez bel code

l fekra mn extrnal databse mn 5elel example:
t5yal eno t3mel application fe b2albo majmo3a mn l 2osas w tnazlo 3ala l play strore l application heda bado ykoun fe 500 2osa l 500 2osa le 3andak mn l mante2 badak t5zenoun bel databse la neftered badak t5zenoun b databse local ya3ne ma badak server fa tare2a l wa7ede le mna3refa eno tenshe2 databse 3ala l application nafso bel 2eleye le t3almta le heye l NativeDatabseImmplment_internal_databse w ta3mel bel oncreate create databse w bel onupgrade ta3mel delete w heek w ta3mel method ta3del w heek fa tare2a l wa7ede le mna3refa 7aleyan eno ta3mel databse de5leye w mn 5elel l code w t5zen haw l 500 osa bshakl ya3ne yadawe ya3ne
3ashen ta3mel insert l 500 osa metar bel mainactivity ta3mel 500 jomlet insert w ta3mel 500 jomlet car car=new car() fa eja 2alak hay tare2a tekledeye w fe tare2a tenye 2alak esma External databse:
External Databse:bkel basata 2alak lesh ma enta tebne databse bara l application 3ala jehez 3al laptop w t3abe feha l data le badak yeha w testawredha esterad 3ala l application
fekretha eno enta tebne databse 5erej l application 3ala laptop btnzel program m3ayan metl l mysql,oracale w 8ayro btbne mn 5elelo l databse bt3be fe data le badak yeh ba3d heek bt3mel tasder mn l program heda heda l program betl3k file mo3ayan bte5od heda l file btdefo 3al application 3ndak w btest5dem code mo3ayan 3ashen yet3araf 3al file heda w bseer application ta3elak bye2ra mn l file le enta defto 3ala l mashro3 badna na3mel hala2 heda le 7kene immpliment:

3ashen tet3meal ma3 external database lezm ykoun 3andak program waset 3ashen mn 5elelo tebne databse ta3elak w ta3mel l 2awemer bde5ela w kel she joweta l program heda esmo sqlite browser mnazlo
bta3mel create databse w btektob code le badak yeh hala2 momken ykoun databse 3andak kbeer fa l file le 7a t7oto 3ala l application kbeer 3ashen ma yseer heek feek ta3melo lal file commpresed

hala2 bas bade ykoun fe image column bel batabase iza bade soura mn l internet ya3ne bade sayev link sobekoun l column esmo image dara type text 2aw iza soura mawjoude bel laptop kamen text 2 mesh integer 2ama iza soura mn drawble so mn7ota integer datatype

hala2 ba3d ma 3mlna l databse tele3le file b 2esm databse ta3ele car 3ala desktop

2awl 5otwe bade 2a3mela 3ashen l application ta3ele yet3araf 3ala databse le bade et3emal ma3a

2awl 5otwe bade eje 2a3mel file new folder assets folder ma ba3mel past 3ala assetfolder de8re ba3mel file esmo databses b2albo file ta3ele cars.db:
assets:ma3neta l 2osoul ma3neta she sebet bel application
howe 3ebra 3an folder mn l haykaleye l 3ame l 5asa bel application l folder heda aye data bade 5azena bel application ta3ele b5azena bel folder heda ya3ne iza 3ande malefet vedios bade yeha tkoun mawjoude bel application 2awl ma yenzel b5zena bheda l folder law 3ande databases  bade yeha tkoun teb3a lal applicatio fa b5zena bel folder heda l2no ne7na 7kena aye she jowet l java code aye she jowet l resources xml l assets heda 3ebra howe w raw 3ebra 3an folder b5zen fe l data w l files le bade esta5dema bl application ta3ele law 3ande databse 3ande files vedios ,mp3 ela tare2a tenye bel raw law 3ande files kbere  b2alba text bade 5azena fa b5zena bel assets folder fa l assets heye 3ebra 3an ta5zen files b2lba le momkn este5dema bl application ta3ele tab3an heda l file lezm ykoun mawjoud bshakl 3am mesh demn l resources ya3ne l android operating system byet3emal eno heda l file l assets folder  mawjoud mn demn l haykalye l 5asa fe l android elo code m3yan 3asehn ye2dar yosal la heda l folder
fa hala2 file databse ta3ele bade defo jowa file l assets hala2 3ande aktar mn tare2a 3ashen et3emal ma3 l external databse:
1-momken test5dem l sqliteopenhelper le ana sta3mlto bel internal databse l internal databse senario keen telk2eyan yenshe2 databse bel zekra l da5leye bas la tet3emal ma3 l external database sho bado yseer l mafroud ana 3ande hala2 file 3ala desktop b2albo databse ta3ele esmo car fa hala2 bade 2a3mlo cop past 3ala l assets folder l assets folder mafroud file mawjoud bde5el l application ta3elak bel internal storage masmo7 lal kera2a meno  fakat ya3ne mamno3 tektob 3lyha tyeb ma ana marat bade 2a3mel inset keef heek ma fene oktob 3lyha 7kelak senario bseer heek 2awal ma yenzal l application 3al mobile ta3elak 7a ykoun fe code mo3ayan heda l code 7a yfout 3ala folder l assets 7a yensa5 file databse ta3elak l2no masmo7 bel kera2a w l nas5 kera2a w 7a yreou7 y5azno bel external storage l 5asa bel application 2aw fe aye maken badak yeh fa bas yseer m5azan bel zekra l 5arejeye 7a yseer masmo7 lal kera2a w l ketebe fa bseer masmo7 ta3mel insert w update w kel she lesh 3ala external storage l 5asa 3ashn bas 2a3l unstall lal application yen3mlo unistall kamen fa note eno 2awl ma yenzal l application l sql le bade ektbo 7a yet3emal ma3 l external stroage l2no mamno3 houn yet3meal ela bel kera2a bas she l2nolne eno bade ensa5o 3al exetrnal storage erja3 2e2ra w ektob meno lafe tawele fa bada code kbeer fa houne ray7ok 2alolak fe library btetwala hay l 3amlyet nas5 l file l assets folder 3ala zekra l 5arejeye l 5asa  esma readystatesoftware 3ebara 3an library feha sqlite assstes hay library 5asa b class l sqliteassets w hay library btesm7le 7ot eno ween bade 5azen bel zekra l 5arejeye b2aye ma7al b zekra l 5arejeye hala2 3mleno immplemntation lal library bel gradle


hala2 ne7na class l mydatasbe keen 3emeel extend mn Sqliteopenhelper fa hala2 2awl 7arake bade 2a3mela badel ma ya3mel mn sqliteopenhelper bado ya3mel extend mn calss esmo SQLiteAssetHelper hala2 tal3lak error kbeer bel oncreate 7akelak enta badak testa3mel Sqliteassethelper  wl Sqliteassethelper mosamam eno enta tet3emal ma3 databse external databse fa 3mlyet create le maktobe 3mlyet create 5arejeye ya3ne houne 3mlo create la databse bara b2este5dem l program ta3eloun l sqlite browser w nasa5o la heda l databse 3ala l application fa method l oncreate batal ela lozom l onupgrade mesh meshkle heye w l ondowngreade 3ashen tet3emal ma3 databse bas ana ma bd2yan 7a 2a3mela comment 3ashn rakez 3a be2e l eshya
lesh ma ba3mel past 3ala assetfolder de8re ba3mel file esmo databses b2albo file ta3ele cars.db: l2no l library le ana 3mltela implemntation 3ala l gradle mosameme eno tet3emal eno heye la7ala bta3ref eno meen ween bada tensa5 l malaf mn l assets mn folder esmo databses

hala2 bade 2a3mel 2awl she esm databse ykoun nafso zeto le maktob bel file mamno3 aye esm tektobo mn 3andak 3afkra l sqliteasset howe 3ebra 3an sqliteopen helper ma3molo extend w mendaf 3lee eshya ya3ne menzed code 3ala l sqliteopenhelper fa lesh mana3 men este5dem l oncreate 3ando l2no howe mest5dem b2alb l class l oncreate 3ando w byenshe2 file jdeed w byenshe2 databse w byensa5 l databse mn file l asset  le ta7t 3enwen databases 3ala heda l file l jdded fa hay wazefet l assethelper kol heda fa l moftarad 3ashn yensa5 database ye5od esm databse sho esmo cars.db nafs esm l file le 3ande w asme2 l column bado ykoun b nafs asme2 l column le fe

7a t2ole l sqliteassethelper keef bado ya3ref eno msama nafs she l esm table w databse w l columns 7a 2olak bel constuctor 7a testad3e super bas ted3e l constuctor 7a ye5od l esm databse le m3rfo w l version w 7a yeje yensa5 l file databse 3ala folder external storage 5asa hala2 bel constuctor super fe parameter esmo storagedirectory byeje ba3d esm database feek t7aded esm l directory le mawjoud bel external storage yensa5 file datbase 3lee fa feek t2olo houn enviroments.getexternal......etc ma badak treko la7alo howe b5zen l file bel zekra l 5arejeye l 5asa bel application


3ashen tareteb l code:
yofadal eno code l etesal ma3 database kel code ta3oul l l databse ykoun 3ala janab w code este5dem databse 3ala janb ya3ne 3mlyet l create databse 3amlyet l alter,onupgrade, 3mlyet ta3del 3mlyet l 2o5ra mafroud tkoun b class law7da w l moftarad 3mlyet l insert w l update tkoun mnsameha 3mlyet l wosoul la databse tkoun b class tenen:
ya3ne mafroud l functions le 3ozta la 7ata tebne l databse le enta 7tejta la tebne databse tkoun b class law7do
w l mafroud l function le 7a y3ouza sha5s tene bado yest5dem databse b class la7al
hala2 la neftered khaled bado yeshte8l sho8l databse w ali bado yeshte8l she8l l addapter fa hala2 ali bado l code le katabo khaled la ykamel sho8lo fa houn moftarad khaled yefsel l code l 5as bebene2 ka3edet l bayanet 3an l code le lezm yest5dmo ali bm3na tene l onreate w l unpgrade hal lezm yest5dema ali la ya3mel l adapter 2aw ya3mel insert la2 fa bade 2a3meloun b class la7loun






 */
public class Mydatabase extends SQLiteAssetHelper {

    public final static String DB_NAME = "cars.db";
    public final static int DB_VERSION = 1;
    public final static String CAR_TAB_NAME = "car";
    public final static String CAR_TAB_ID = "id";
    public final static String CAR_TAB_MODEL = "model";
    public final static String CAR_TAB_COLOR = "color";
    public final static String CAR_TAB_description = "description";
    public final static String CAR_TAB_image = "images";
    public final static String CAR_TAB_DPL = "distancePerLetter";


    public Mydatabase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }






}














