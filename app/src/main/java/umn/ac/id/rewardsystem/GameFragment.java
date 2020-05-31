package umn.ac.id.rewardsystem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class GameFragment extends Fragment {
    View root;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        root = inflater.inflate(R.layout.fragment_game, container, false);


        CardView emojicare = root.findViewById(R.id.emojicare);
        emojicare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = "https://play.google.com/store/apps/details?id=com.GameLevelOne.EmojiCare";
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });

        CardView pemburuhantu = root.findViewById(R.id.pemburuhantu);
        pemburuhantu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = "https://play.google.com/store/apps/details?id=com.gl1.pemburu_hantu";
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });


        CardView macetkebioskop = root.findViewById(R.id.macetkebioskop);
        macetkebioskop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = "https://play.google.com/store/apps/details?id=com.filmnas.macetkebioskop";
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });

        CardView fingerdash = root.findViewById(R.id.fingerdash);
        fingerdash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = "https://play.google.com/store/apps/details?id=com.GemuGemu.FingerDash";
                Intent browseIntent = new Intent(Intent.ACTION_VIEW);
                browseIntent.setData(Uri.parse(urlText));
                if(browseIntent.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(browseIntent);
                }
            }
        });
        return root;
    }


}
