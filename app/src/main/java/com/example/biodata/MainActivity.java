package com.example.biodata;
import androidx.appcompat.app.AppCompatActivity; import android.content.Intent;
import android.net.Uri;
import android.os.Bundle; import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    }

    public void cellphone(View view) {
        Uri uri = Uri.parse("tel:087724417210");
        Intent it = new Intent (Intent.ACTION_VIEW, uri); startActivity(it);
    }
    public void showMap(View view) {
        Uri uri = Uri.parse("https://www.google.com/search?q=TIRTOYOSO+1+NO+33&oq=TIRTOYOSO+1+NO+33&aqs=chrome..69i57j33i160l3.4750j0j15&sourceid=chrome&ie=UTF-8"); Intent it = new Intent (Intent.ACTION_VIEW, uri); startActivity(it);

    }
    public void email (View view) {
        Intent intent = new Intent (Intent.ACTION_SEND); intent.putExtra(Intent.EXTRA_EMAIL, new String[]
                {"yosephineelisa11@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi");

        try {
            startActivity(Intent.createChooser(intent,"Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}
