package losfreitasapps.com.boapiada.ShowActivities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import losfreitasapps.com.boapiada.Modelo.Piadas;
import losfreitasapps.com.boapiada.Piadas.Cretinas;
import losfreitasapps.com.boapiada.R;

/**
 * Created by Moises on 20/08/16.
 */
public class ShowCretinasActivity extends AppCompatActivity {

    private Piadas piadas;
    private TextView tvTitulo, tvPiada;
    Integer szList, idList;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_piadas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        toolbar_title.setText("  Cretinas");

        ImageView ic_back = (ImageView) findViewById(R.id.iv_back);
        ic_back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView voltar = (ImageView) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(idList>0) {
                    idList = idList - 1;
                    piadas = Cretinas.getPCretinas().get(idList);
                    tvTitulo.setText(piadas.getTitulo());
                    tvPiada.setText(piadas.getPiada());
                    Toast.makeText(ShowCretinasActivity.this, (idList+1)+" de " + (szList), Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(ShowCretinasActivity.this, 1 +" de " + (szList), Toast.LENGTH_SHORT).show();
                }
            }
        });
        ImageView avancar = (ImageView) findViewById(R.id.avancar);
        avancar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(idList<(szList-1)) {
                    idList = idList + 1;
                    piadas = Cretinas.getPCretinas().get(idList);
                    tvTitulo.setText(piadas.getTitulo());
                    tvPiada.setText(piadas.getPiada());
                    Toast.makeText(ShowCretinasActivity.this, (idList+1) +" de "+(szList), Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(ShowCretinasActivity.this, (szList) +" de " + (szList), Toast.LENGTH_SHORT).show();
                }
            }
        });

        AdView mAdView1 = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mp = MediaPlayer.create(this, R.raw.sorrisobb);
        mAdView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.start();
            }
        });
        if (getIntent().hasExtra("id_list")) {
            idList = getIntent().getIntExtra("id_list", 46666);
            if (idList != 46666) {
                piadas = Cretinas.getPCretinas().get(idList);
            }
        }
        if (getIntent().hasExtra("sz_list")) {
            szList = getIntent().getIntExtra("sz_list", 46666);
        }

        tvTitulo = (TextView) findViewById(R.id.tv_piadasTitulo);
        tvPiada = (TextView) findViewById(R.id.tv_piadasPiada);

        tvTitulo.setText(piadas.getTitulo());
        tvPiada.setText(piadas.getPiada());

        ImageView share = (ImageView) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
                share.putExtra(Intent.EXTRA_TEXT, piadas.getPiada());
                share.setType("text/plain");
                startActivity(share);
            }
        });
    }
}
