package losfreitasapps.com.boapiada.Activities;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import losfreitasapps.com.boapiada.Fragments.FAnimais;
import losfreitasapps.com.boapiada.Fragments.FBebados;
import losfreitasapps.com.boapiada.Fragments.FBichas;
import losfreitasapps.com.boapiada.Fragments.FCaipiras;
import losfreitasapps.com.boapiada.Fragments.FCarnaval;
import losfreitasapps.com.boapiada.Fragments.FCarreira;
import losfreitasapps.com.boapiada.Fragments.FCasais;
import losfreitasapps.com.boapiada.Fragments.FCorno;
import losfreitasapps.com.boapiada.Fragments.FCretinas;
import losfreitasapps.com.boapiada.Fragments.FCumulo;
import losfreitasapps.com.boapiada.Fragments.FCurtas;
import losfreitasapps.com.boapiada.Fragments.FEstagiario;
import losfreitasapps.com.boapiada.Fragments.FFutebol;
import losfreitasapps.com.boapiada.Fragments.FGarcom;
import losfreitasapps.com.boapiada.Fragments.FGospel;
import losfreitasapps.com.boapiada.Fragments.FInformatica;
import losfreitasapps.com.boapiada.Fragments.FJoaozinho;
import losfreitasapps.com.boapiada.Fragments.FLoira;
import losfreitasapps.com.boapiada.Fragments.FLouco;
import losfreitasapps.com.boapiada.Fragments.FPoliticos;
import losfreitasapps.com.boapiada.Fragments.FPortugues;
import losfreitasapps.com.boapiada.Fragments.FSorteio;
import losfreitasapps.com.boapiada.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager FM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FM = getFragmentManager();
        FM.beginTransaction().replace(R.id.content_principal, new FSorteio()).commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_animais) {
            FM.beginTransaction().replace(R.id.content_principal, new FAnimais()).commit();
        } else if (id == R.id.nav_bebados) {
            FM.beginTransaction().replace(R.id.content_principal, new FBebados()).commit();
        } else if (id == R.id.nav_bichas) {
            FM.beginTransaction().replace(R.id.content_principal, new FBichas()).commit();
        } else if (id == R.id.nav_caipiras) {
            FM.beginTransaction().replace(R.id.content_principal, new FCaipiras()).commit();
        }  else if (id == R.id.nav_carnaval) {
            FM.beginTransaction().replace(R.id.content_principal, new FCarnaval()).commit();
        } else if (id == R.id.nav_casais) {
            FM.beginTransaction().replace(R.id.content_principal, new FCasais()).commit();
        } else if (id == R.id.nav_corno) {
            FM.beginTransaction().replace(R.id.content_principal, new FCorno()).commit();
        } else if (id == R.id.nav_cretinas) {
            FM.beginTransaction().replace(R.id.content_principal, new FCretinas()).commit();
        } else if (id == R.id.nav_cumulo) {
            FM.beginTransaction().replace(R.id.content_principal, new FCumulo()).commit();
        } else if (id == R.id.nav_curtas) {
            FM.beginTransaction().replace(R.id.content_principal, new FCurtas()).commit();
        } else if (id == R.id.nav_estagiario) {
            FM.beginTransaction().replace(R.id.content_principal, new FEstagiario()).commit();
        } else if (id == R.id.nav_futebol) {
            FM.beginTransaction().replace(R.id.content_principal, new FFutebol()).commit();
        } else if (id == R.id.nav_garcom) {
            FM.beginTransaction().replace(R.id.content_principal, new FGarcom()).commit();
        } else if (id == R.id.nav_gospel) {
            FM.beginTransaction().replace(R.id.content_principal, new FGospel()).commit();
        } else if (id == R.id.nav_informatica) {
            FM.beginTransaction().replace(R.id.content_principal, new FInformatica()).commit();
        } else if (id == R.id.nav_joaozin) {
            FM.beginTransaction().replace(R.id.content_principal, new FJoaozinho()).commit();
        } else if (id == R.id.nav_loira) {
            FM.beginTransaction().replace(R.id.content_principal, new FLoira()).commit();
        } else if (id == R.id.nav_louco) {
            FM.beginTransaction().replace(R.id.content_principal, new FLouco()).commit();
        } else if (id == R.id.nav_politicos) {
            FM.beginTransaction().replace(R.id.content_principal, new FPoliticos()).commit();
        } else if (id == R.id.nav_portugues) {
            FM.beginTransaction().replace(R.id.content_principal, new FPortugues()).commit();
        } else if (id == R.id.nav_carreira) {
            FM.beginTransaction().replace(R.id.content_principal, new FCarreira()).commit();
        } else if (id == R.id.nav_sorteada) {
            FM.beginTransaction().replace(R.id.content_principal, new FSorteio()).commit();
        } else if (id == R.id.nav_share) {
            Intent share = new Intent();
            share.setAction(Intent.ACTION_SEND);
            share.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
            share.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=losfreitasapps.com.boapiada");
            share.setType("text/plain");
            startActivity(share);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
