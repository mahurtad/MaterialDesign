package androidhive.info.materialdesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidhive.info.materialdesign.R;


public class AboutFragment extends android.support.v4.app.Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    public void facebookApp(View view) {
        String ruta ="https://www.facebook.com/Pokemon";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ruta));
        startActivity(i);
    }

    public void gplusApp(View view) {
        String ruta ="https://plus.google.com/+Pokemonpets/videos";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ruta));
        startActivity(i);
    }

    public void twitterApp(View view) {
        String ruta ="https://twitter.com/pokemon";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ruta));
        startActivity(i);
    }

    public void youtubeApp(View view) {
        String ruta ="https://www.youtube.com/user/pokemon";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(ruta));
        startActivity(i);
    }
}