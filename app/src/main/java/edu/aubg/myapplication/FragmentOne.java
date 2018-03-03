package edu.aubg.myapplication;

/**
 * Created by bilguun on 3/3/2018.
 */

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        View rootView = inflater.inflate(
                R.layout.fragment_one, container, false);
        MediaController mc= new MediaController(getActivity());

        VideoView view = rootView.findViewById(R.id.videoView1);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video1;
        view.setVideoURI(Uri.parse(path));
        view.setMediaController(mc);
        view.start();
        return rootView;
    }
}
