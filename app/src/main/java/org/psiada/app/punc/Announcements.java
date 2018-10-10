package org.psiada.app.punc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Announcements.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Announcements#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Announcements extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ViewPager viewPager;
    ViewPagerAdapter adapter;
    private Handler handler;
    private Runnable update;

    private String[] images = {

            "http://punc.psiada.org/wp-content/uploads/2018/01/pla_logo-1f1uy08.png",
            "http://punc.psiada.org/wp-content/uploads/2018/03/23600769_1758399207567367_1383342331_o-1024x1024-2-copy.png",
            "http://punc.psiada.org/wp-content/uploads/2017/11/24259325_1779457425461545_825887776_o.jpg",
            "http://punc.psiada.org/wp-content/uploads/2018/01/SIA-logo.png",
            "http://punc.psiada.org/wp-content/uploads/2018/01/Schreyer-Logo.png"
    };


    public Announcements() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Announcements.
     */
    // TODO: Rename and change types and number of parameters
    public static Announcements newInstance(String param1, String param2) {
        Announcements fragment = new Announcements();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_announcements, container, false);

        WebView announcements = (WebView) rootView.findViewById(R.id.web_announcements);
        announcements.setWebViewClient(new WebViewClient(){

            public void onPageFinished(WebView view, String url){
                rootView.findViewById(R.id.announcements_loading).setVisibility(View.GONE);
                rootView.findViewById(R.id.web_announcements).setVisibility(View.VISIBLE);

            }
        });

        announcements.loadUrl("http://punc.psiada.org/app-updates/");
        ImageView conferenceLogo = (ImageView)rootView.findViewById(R.id.conf_logo);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2018/03/final-logo-.png").diskCacheStrategy(DiskCacheStrategy.ALL).into(conferenceLogo);

//        ImageView sponsorRight = (ImageView)rootView.findViewById(R.id.sponsorRight);
//        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2017/12/Liberal-Arts.png").diskCacheStrategy(DiskCacheStrategy.ALL).into(sponsorRight);
//
//        ImageView sponsorLeft = (ImageView)rootView.findViewById(R.id.sponsorLeft);
//        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2017/12/CGS-logo.png").diskCacheStrategy(DiskCacheStrategy.ALL).into(sponsorLeft);

        viewPager = (ViewPager)rootView.findViewById(R.id.sponsors);
        adapter = new ViewPagerAdapter(getActivity(), images);
        viewPager.setAdapter(adapter);

        handler = new Handler();


        update = new Runnable() {
            int currentPage = 0;
            int NUM_PAGES = 5;

            public void run() {
                if (currentPage == NUM_PAGES - 1) {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };


        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                handler.post(update);
            }
        }, 400, 2000);

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
