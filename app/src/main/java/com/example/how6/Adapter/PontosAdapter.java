package com.example.how6.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.how6.Fragmentos.FragmentoHome;
import com.example.how6.Pontos;
import com.example.how6.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PontosAdapter extends ArrayAdapter<Pontos>
{
    private final Context context;
    private final ArrayList<Pontos> PontosT;


    public PontosAdapter(Context context, ArrayList<Pontos> PontosT)
    {
      super(context, R.layout.listview,PontosT);
      this.context = context;
      this.PontosT = PontosT;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        /**
         * Utilizado para chamar a ListView customizada.
        **/
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listview,parent,false);

        /**
         * Associa os ids de Nome,Endereco e Foto com os atributos nomePontoT, End e ImagemPontoT
        **/
        TextView nomePontoT = (TextView) rowView.findViewById(R.id.Nome);
        TextView End = (TextView) rowView.findViewById(R.id.Endereco);
        ImageView ImagemPontoT = (ImageView) rowView.findViewById(R.id.Foto);
        TextView Desc = (TextView) rowView.findViewById(R.id.Desc);
        /**
         *  Aqui os elementos ou atributos recebem o set para determinar quais serão seus valores.
        **/
        nomePontoT.setText(PontosT.get(position).getNome());
        End.setText(PontosT.get(position).getEndereço());
        ImagemPontoT.setImageResource(PontosT.get(position).getImagem());
        Desc.setText(PontosT.get(position).getDesc());
        return rowView;
    }
}
