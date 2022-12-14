package uz.alikhanov.darslar.ui.Husaynxon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.alikhanov.darslar.R;


public class HusaynxonFragment extends Fragment {


    public HusaynxonFragment() {
        // Required empty public constructor
    }


    public static HusaynxonFragment newInstance(String param1, String param2) {
        HusaynxonFragment fragment = new HusaynxonFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_husaynxon, container, false);
    }
}