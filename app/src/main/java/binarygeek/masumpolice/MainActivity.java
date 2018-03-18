package binarygeek.masumpolice;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private AlphaAnimation alphaAnimation;
    private LinearLayout topView,ButtomView;
    public Button PlusButton,minusButton;
    public Activity activity;


    String part_1="file:///android_asset/0.html";
    String part_2="file:///android_asset/1.html";
    String part_3="file:///android_asset/2.html";
    String part_4="file:///android_asset/3.html";
    String part_5="file:///android_asset/4.html";
    String part_6="file:///android_asset/5.html";
    String part_7="file:///android_asset/6.html";
    String part_8="file:///android_asset/7.html";
    String part_9="file:///android_asset/8.html";
    String part_10="file:///android_asset/9.html";
    String part_11="file:///android_asset/10.html";
    String part_12="file:///android_asset/11.html";
    String part_13="file:///android_asset/12.html";
    String part_14="file:///android_asset/13.html";
    String part_15="file:///android_asset/14.html";
    String part_16="file:///android_asset/15.html";
    String part_17="file:///android_asset/16.html";

    String firstbutton="ভূমিকা";
    String secondbutton="হযরত আদম (আঃ)";
    String thirddbutton="হযরত নূহ (আঃ)";
    String fourbutton="হযরত ইদরীস (আঃ)";
    String fivebutton="হযরত হূদ (আঃ)";
    String sixbutton="হযরত ছালেহ (আঃ";
    String sevenbutton="হযরত ইবরাহীম (আঃ)";
    String eight="হযরত লূত (আঃ)";
    String nine="হযরত ইসমাঈল (আঃ)";
    String ten="হযরত ইসহাক্ব (আঃ)";
    String eleven="হযরত ইয়াকূব (আঃ)";
    String  twelve="হযরত ইউসুফ (আঃ)";
    String thirteen="হযরত আইয়ূব (আঃ)";
    String fourteen="হযরত শো‘আয়েব (আঃ)";
    String fifteen="হযরত মূসা ও হারূণ (আঃ)";
    String sixteen="হযরত ইউনুস (আঃ)";
    String seventeen="হযরত দাঊদ (আঃ)";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO: এখানে এনিমেনশন অবজেক্ট তৈরি হইছে যার কাজই হল এনিমেনশনটা তৈরি করা। আস্তে করে যে জিনিসটা শো হয় এইটা এই কাজ করে। alphaAnimation.setDuration(1000); মানে হল ১০০০ মিলি সেকেন্ড ধরে এই এনিমেনশনটা চলবে আর AlphaAnimation(0.0f, 1.0f); মানে হল 0.f থেকে 1.0f পর্যন্ত ডিপ হবে ।
        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000);

                //HIDING NOTIFICATION BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TaskForDrawer(toolbar);

        topView=findViewById(R.id.TopView);
        ButtomView=findViewById(R.id.ButtomView);

        activity=this;

        PlusButton=findViewById(R.id.plus_button);
        minusButton=findViewById(R.id.minus_button);

        //TODO: এইখানে আসলে প্লাস বাটন ক্লিক করলে যে উপরের অংশটা বন্ধ হয়ে নিচেরটা ওপেন হয় এইটা করা হয়েছে।
        PlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                topView.setVisibility(View.GONE);
                ButtomView.setVisibility(View.VISIBLE);
                PlusButton.setVisibility(View.GONE);
                minusButton.setVisibility(View.VISIBLE);
                ButtomView.startAnimation(alphaAnimation);// TODO :এনিমেশন শুরু

            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ButtomView.setVisibility(View.GONE);
                topView.setVisibility(View.VISIBLE);
                PlusButton.setVisibility(View.VISIBLE);
                minusButton.setVisibility(View.GONE);
                topView.startAnimation(alphaAnimation);// TODO :এনিমেশন শুরু

            }
        });


    }

    public void buttonClickEvent(View view){

        if(view.getId()==R.id.btn_dialog_1){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",firstbutton );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog_2){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",secondbutton );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog_3){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",thirddbutton );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog_4){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",fourbutton );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog_5){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",fivebutton );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog7){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",sevenbutton );
            startActivity(part);

        }
        else if (view.getId()==R.id.btn_dialog8){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",eight );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog9){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",nine );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog10){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",ten );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog11){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",eleven );
            startActivity(part);
        }
        else if (view.getId()==R.id.btn_dialog_12){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",twelve );
            startActivity(part);
        } else if (view.getId()==R.id.btn_dialog_13){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",thirddbutton );
            startActivity(part);
        } else if (view.getId()==R.id.btn_dialog_14){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",fourteen );
            startActivity(part);
        } else if (view.getId()==R.id.btn_dialog_15){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",fifteen );
            startActivity(part);
        } else if (view.getId()==R.id.btn_dialog_16){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",sixteen );
            startActivity(part);
        } else if (view.getId()==R.id.btn_dialog_17){
            Intent part = new Intent(getApplication(), DetailsActivity.class);
            part.putExtra("details", part_1);
            part.putExtra("title",seventeen );
            startActivity(part);
        }



    }

    @Override
    public void onBackPressed() {

        //TODO : এইখানে বেক বাটন ক্লিক করলে ড্র্যার বন্ধ হবে এই কাজ করে।
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
            //alertDialog.setIconAttribute(R.mipmap.police_logo);
            alertDialog.setIcon(R.mipmap.police_logo);
            alertDialog.setTitle("আপনি কি এপটি থেকে বের হয়ে আসতে চান?");
           // alertDialog.setMessage("Alert message to be shown");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "জ্বী",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            activity.finish();
                            dialog.dismiss();
                        }
                    });
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "না",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_blog) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://masumpolice.com/"));
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_contact) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://masumpolice.com/category/%e0%a6%af%e0%a7%8b%e0%a6%97%e0%a6%be%e0%a6%af%e0%a7%8b%e0%a6%97-%e0%a6%aa%e0%a6%b0%e0%a6%be%e0%a6%ae%e0%a6%b0%e0%a7%8d%e0%a6%b6/"));
            startActivity(intent);

        } else if (id == R.id.nav_previous_question) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://masumpolice.com/category/%e0%a6%ac%e0%a6%bf%e0%a6%97%e0%a6%a4-%e0%a6%b8%e0%a6%be%e0%a6%b2%e0%a7%87%e0%a6%b0-%e0%a6%aa%e0%a7%8d%e0%a6%b0%e0%a6%b6%e0%a7%8d%e0%a6%a8-%e0%a6%89%e0%a6%a4%e0%a7%8d%e0%a6%a4%e0%a6%b0/"));
            startActivity(intent);
        } else if (id == R.id.nav_question) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("http://masumpolice.com/category/%e0%a6%86%e0%a6%87%e0%a6%a8%e0%a7%87%e0%a6%b0-%e0%a6%aa%e0%a7%8d%e0%a6%b0%e0%a6%b6%e0%a7%8d%e0%a6%a8%e0%a6%b8%e0%a6%ae%e0%a7%82%e0%a6%b9/"));
            startActivity(intent);
        } else if (id == R.id.nav_share) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);

            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent,"আমার ব্লগটি শেয়ার করুন শেয়ার করুন। http://masumpolice.com/"));


//            Intent intent = new Intent();
//            intent.setAction(Intent.ACTION_VIEW);
//            intent.addCategory(Intent.CATEGORY_BROWSABLE);
//            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=binarygeek.masumpolice"));
//            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //TODO : এই ফাংশনটা মুলত ড্রয়ারের কাজটা করে।
    void TaskForDrawer(Toolbar toolbar ){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
}
