package umn.ac.id.rewardsystem;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class HomeFragment extends Fragment {
    Button btnOne;
    boolean currentDay;
    String today;
    SharedPreferences preferences;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        btnOne = root.findViewById(R.id.btnOne);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        today = year + "" + month + "" + day;
        preferences = getActivity().getSharedPreferences("pref",0);
        currentDay = preferences.getBoolean(today, false);

        if(currentDay){
            btnOne.setEnabled(false);
        }

        btnOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(!currentDay){
                    Toast.makeText(getActivity(), "Get Daily Reward", Toast.LENGTH_SHORT).show();
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean(today, true);
                    editor.apply();
                    btnOne.setEnabled(false);
                }else{
                    Toast.makeText(getActivity(), "Already Got the Reward",Toast.LENGTH_SHORT).show();
                }

            }
        });


        return root;
    }



}
