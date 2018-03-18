package binarygeek.masumpolice;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ProgressDialog pd;
    FloatingActionButton shareButton;
    TextView titleText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //HIDING NOTIFICATION BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_content_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String title = getIntent().getStringExtra("title");
       // getSupportActionBar().setTitle(title);
        titleText=(TextView)toolbar.findViewById(R.id.titleText);
        titleText.setText(title);

        //Share button to share the app
        shareButton = findViewById(R.id.share_content);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);

                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,"আমার ব্লগটি শেয়ার করুন শেয়ার করুন। http://masumpolice.com/"));
            }
        });

        String customHtml = getIntent().getStringExtra("details");
        WebView webView= (WebView) findViewById(R.id.webView);

        pd = new ProgressDialog(this);
        pd.setMessage("ডাটা লোড হচ্ছে দয়া করে অপেক্ষা করুন।");
        pd.show();
        webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl(customHtml);
        webView.getSettings().setBuiltInZoomControls(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);

            if (!pd.isShowing()) {
                pd.show();
            }

            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {

            if (pd.isShowing()) {
                pd.dismiss();
            }

        }
    }

}
