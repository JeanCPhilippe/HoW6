package com.example.how6.Adapter;

import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.how6.Fragmentos.FragmentoHome;
import com.example.how6.Fragmentos.FragmentoPerfil;
import com.example.how6.Fragmentos.FragmentoPesquisar;

public class PagerAdapter extends FragmentStatePagerAdapter{


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        /** Testa as posições do Tab para apresentar o Fragmento determinado**/
        switch (position)
        {
            case 0:
                return new FragmentoHome();
            case 1:
                return new FragmentoPesquisar();
            case 2:
                return new FragmentoPerfil();
            default:
                return null;
        }

    }

    /** Retorna a quantidade de Tabs (Home,Explorar,Perfil) na TelaPrincipal. **/
    @Override
    public int getCount() {
        return 3;
    }
}
