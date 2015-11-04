package shamimvai.arifhasnat.practice.android.com.shamimvai;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Arif on 04/11/2015.
 */
public class ProfileActivity extends  MainActivity{

    Button linkedin,facebook,sms,email,call,web;
    ImageButton imgReviews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        imgReviews= (ImageButton) findViewById(R.id.imgReviews);

        linkedin= (Button) findViewById(R.id.linkedin);
        facebook= (Button) findViewById(R.id.facebook);
        sms= (Button) findViewById(R.id.sms);
        email= (Button) findViewById(R.id.email);
        call= (Button) findViewById(R.id.callto);
        web= (Button) findViewById(R.id.web);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://bd.linkedin.com/pub/mahfuzul-islam-shamim/70/302/51";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://mishamim.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/myshamim2006?ref=ts&fref=ts";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "01713261730"));
                startActivity(intent);
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:" + "01713261730");

                Intent smsIntent = new Intent(Intent.ACTION_SENDTO, uri);

                smsIntent.putExtra("sms_body", " ");

                startActivity(smsIntent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] TO = {"your mail address"};
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Shamim.lict@gmail.com");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    finish();

                }
                catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(), "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        imgReviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentt =new Intent(getApplicationContext(),exMain.class);
                startActivity(intentt);

            }
        });






    }
}
