package losfreitasapps.com.boapiada.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

import losfreitasapps.com.boapiada.Modelo.Piadas;
import losfreitasapps.com.boapiada.Piadas.Animais;
import losfreitasapps.com.boapiada.Piadas.Bebados;
import losfreitasapps.com.boapiada.Piadas.Bichas;
import losfreitasapps.com.boapiada.Piadas.Caipiras;
import losfreitasapps.com.boapiada.Piadas.Carnaval;
import losfreitasapps.com.boapiada.Piadas.Carreira;
import losfreitasapps.com.boapiada.Piadas.Casais;
import losfreitasapps.com.boapiada.Piadas.Corno;
import losfreitasapps.com.boapiada.Piadas.Cretinas;
import losfreitasapps.com.boapiada.Piadas.Cumulo;
import losfreitasapps.com.boapiada.Piadas.Curtas;
import losfreitasapps.com.boapiada.Piadas.Estagiario;
import losfreitasapps.com.boapiada.Piadas.Futebol;
import losfreitasapps.com.boapiada.Piadas.Garcom;
import losfreitasapps.com.boapiada.Piadas.Gospel;
import losfreitasapps.com.boapiada.Piadas.Informatica;
import losfreitasapps.com.boapiada.Piadas.Joaozinho;
import losfreitasapps.com.boapiada.Piadas.Loira;
import losfreitasapps.com.boapiada.Piadas.Loucos;
import losfreitasapps.com.boapiada.Piadas.Politicos;
import losfreitasapps.com.boapiada.Piadas.Portugues;
import losfreitasapps.com.boapiada.R;

/**
 * Created by Moises on 20/08/16.
 */
public class FSorteio extends Fragment {

    private Piadas piadas;
    private TextView tvTitulo, tvPiada;
    int ncategorias, ncat;
    Integer idList;
    MediaPlayer mp;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.piada_sorteio,container,false);

        tvTitulo = (TextView) view.findViewById(R.id.tv_piadasTitulo);
        tvPiada = (TextView) view.findViewById(R.id.tv_piadasPiada);

        ncategorias = 20;
        Random random  = new Random();
        ncat = random.nextInt(ncategorias);

        if(ncat==0){
            idList = random.nextInt(21);
            piadas = Animais.getPAnimais().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        } else if(ncat==1){
            idList = random.nextInt(35);
            piadas = Bebados.getPBebados().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==2){
            idList = random.nextInt(21);
            piadas = Bichas.getPBichas().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==3){
            idList = random.nextInt(30);
            piadas = Caipiras.getPCaipiras().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==4){
            idList = random.nextInt(10);
            piadas = Carnaval.getPCarnaval().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==5){
            idList = random.nextInt(20);
            piadas = Carreira.getPCarreira().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==6){
            idList = random.nextInt(54);
            piadas = Casais.getPCasais().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==7){
            idList = random.nextInt(19);
            piadas = Corno.getPCorno().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==8){
            idList = random.nextInt(24);
            piadas = Cretinas.getPCretinas().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==9){
            idList = random.nextInt(54);
            piadas = Cumulo.getPCumulo().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==10){
            idList = random.nextInt(21);
            piadas = Curtas.getPCurtas().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==11){
            idList = random.nextInt(3);
            piadas = Estagiario.getPEstagiario().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==12){
            idList = random.nextInt(10);
            piadas = Futebol.getPFutebo().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==13){
            idList = random.nextInt(8);
            piadas = Garcom.getPGarcom().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==14){
            idList = random.nextInt(19);
            piadas = Gospel.getPGospel().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==15){
            idList = random.nextInt(20);
            piadas = Informatica.getPInformatica().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==16){
            idList = random.nextInt(40);
            piadas = Joaozinho.getPJoaozin().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==17){
            idList = random.nextInt(32);
            piadas = Loira.getPLoira().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==18){
            idList = random.nextInt(9);
            piadas = Loucos.getPLouco().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==19){
            idList = random.nextInt(6);
            piadas = Politicos.getPPoliticos().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }else if(ncat==20){
            idList = random.nextInt(14);
            piadas = Portugues.getPPortugues().get(idList+1);
            tvTitulo.setText(piadas.getTitulo());
            tvPiada.setText(piadas.getPiada());
        }

        AdView mAdView1 = (AdView) view.findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);
        mp = MediaPlayer.create(getActivity(), R.raw.sorrisobb);
        mAdView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.start();
            }
        });
        ImageView share = (ImageView) view.findViewById(R.id.share);
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

        return view;
    }
}