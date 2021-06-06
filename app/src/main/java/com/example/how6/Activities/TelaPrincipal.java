package com.example.how6.Activities;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.how6.Adapter.PagerAdapter;
import com.example.how6.R;

public class TelaPrincipal extends AppCompatActivity {

    /**
     *  Cria as variáveis que serão utilizadas no processo, para apresentar os Fragmentos
     *  do aplicativo de acordo com as Tabs
    **/
    private TabLayout Options;
    private ViewPager ViewPagerTabs;

    private int[] tabIcons = {
            R.drawable.ic_homeapp,
            R.drawable.ic_explorer,
            R.drawable.ic_perfil
    };
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        /**
         * As variáveis Options e ViewPagerTabs recebem, respectivamente
         * os valores de ID's da Tablayout mostrada
         * e do ViewPager presente no Layout/app.
        **/
        Options = (TabLayout) findViewById(R.id.Tabs);
        ViewPagerTabs = (ViewPager) findViewById(R.id.viewpager);

        /**
         * Faz com que Options e ViewPagerTabs trabalhem juntos para gerarem os fragmentos junto
         * com as Tabs
        **/
        ViewPagerTabs.setAdapter(new PagerAdapter(getSupportFragmentManager()));
        Options.setupWithViewPager(ViewPagerTabs);


        setupTabIcons();

    }
    /**
     * Utilizado para adicionar os ícones nas Tabs
    **/
    private void setupTabIcons() {
       Options.getTabAt(0).setIcon(tabIcons[0]);
       Options.getTabAt(1).setIcon(tabIcons[1]);
       Options.getTabAt(2).setIcon(tabIcons[2]);
    }

    }

