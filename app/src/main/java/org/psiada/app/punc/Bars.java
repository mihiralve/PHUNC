package org.psiada.app.punc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Bars.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Bars#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Bars extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Bars() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Bars.
     */
    // TODO: Rename and change types and number of parameters
    public static Bars newInstance(String param1, String param2) {
        Bars fragment = new Bars();
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
        final View rootView = inflater.inflate(R.layout.fragment_bars, container, false);

        TextView bar1 = (TextView)rootView.findViewById(R.id.bar1);
        bar1.setClickable(true);
        bar1.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage1 = (ImageView)rootView.findViewById(R.id.barImage1);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/zenos.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage1);

        TextView bar2 = (TextView)rootView.findViewById(R.id.bar2);
        bar2.setClickable(true);
        bar2.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage2 = (ImageView)rootView.findViewById(R.id.barImage2);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/gaff.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage2);

        TextView bar3 = (TextView)rootView.findViewById(R.id.bar3);
        bar3.setClickable(true);
        bar3.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage3 = (ImageView)rootView.findViewById(R.id.barImage3);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/phyrst.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage3);

        TextView bar4 = (TextView)rootView.findViewById(R.id.bar4);
        bar4.setClickable(true);
        bar4.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage4 = (ImageView)rootView.findViewById(R.id.barImage4);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/champs.png").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage4);

        TextView bar5 = (TextView)rootView.findViewById(R.id.bar5);
        bar5.setClickable(true);
        bar5.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage5 = (ImageView)rootView.findViewById(R.id.barImage5);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/cafe.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage5);

        TextView bar6 = (TextView)rootView.findViewById(R.id.bar6);
        bar6.setClickable(true);
        bar6.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage6 = (ImageView)rootView.findViewById(R.id.barImage6);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/liberty.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage6);

        TextView bar7 = (TextView)rootView.findViewById(R.id.bar7);
        bar7.setClickable(true);
        bar7.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage7 = (ImageView)rootView.findViewById(R.id.barImage7);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/saloon.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage7);

        TextView bar8 = (TextView)rootView.findViewById(R.id.bar8);
        bar8.setClickable(true);
        bar8.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage8 = (ImageView)rootView.findViewById(R.id.barImage8);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/madmex.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage8);

        TextView bar9 = (TextView)rootView.findViewById(R.id.bar9);
        bar9.setClickable(true);
        bar9.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage9 = (ImageView)rootView.findViewById(R.id.barImage9);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/localwhiskey.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage9);

        TextView bar10 = (TextView)rootView.findViewById(R.id.bar10);
        bar10.setClickable(true);
        bar10.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage10 = (ImageView)rootView.findViewById(R.id.barImage10);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/indigo.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage10);

        TextView bar11 = (TextView)rootView.findViewById(R.id.bar11);
        bar11.setClickable(true);
        bar11.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView barImage11 = (ImageView)rootView.findViewById(R.id.barImage11);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/inferno.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(barImage11);





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
