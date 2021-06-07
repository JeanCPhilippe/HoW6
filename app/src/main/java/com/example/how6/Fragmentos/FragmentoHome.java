package com.example.how6.Fragmentos;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.how6.Adapter.PontosAdapter;
import com.example.how6.Pontos;
import com.example.how6.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoHome extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentoHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentoHome.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoHome newInstance(String param1, String param2) {
        FragmentoHome fragment = new FragmentoHome();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }



    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_fragmento_home, container, false);

    }
    /**
     * Aqui serão adicionados Pontos Turisticos apenas para visualização.
     **/
    ArrayList<Pontos> adicionarPontos()
    {
        ArrayList<Pontos> pontos = new ArrayList<Pontos>();
        Pontos p = new Pontos("Cristo Redentor",R.drawable.cristoredentor,
                "Parque Nacional da Tijuca - Alto da Boa Vista, Rio de Janeiro - RJ",
                "Cristo Redentor é uma estátua art déco que retrata Jesus Cristo");

        p = new Pontos("Parque do Ibirapuera",R.drawable.parque,
                "Av. Pedro Álvares Cabral - Vila Mariana, São Paulo - SP, 04094-050",
                "O mais importante parque urbano de São Paulo, o Ibirapuera " +
                        "é ponto de encontro de amigos e famílias. ");

        return pontos;
    }
}