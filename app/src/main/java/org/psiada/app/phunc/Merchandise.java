package org.psiada.app.phunc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Merchandise.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Merchandise#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Merchandise extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Merchandise() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Merchandise.
     */
    // TODO: Rename and change types and number of parameters
    public static Merchandise newInstance(String param1, String param2) {
        Merchandise fragment = new Merchandise();
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
        View rootView = inflater.inflate(R.layout.fragment_merchandise, container, false);

        ImageView merch1 = (ImageView)rootView.findViewById(R.id.merch1);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/shot-glass.png").diskCacheStrategy(DiskCacheStrategy.ALL).override(200, 150).into(merch1);

        ImageView merch2 = (ImageView)rootView.findViewById(R.id.merch2);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/phone-wallet.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).override(200, 150).into(merch2);

        ImageView merch3 = (ImageView)rootView.findViewById(R.id.merch3);
        Glide.with(getContext()).load("http://punc.psiada.org/wp-content/uploads/2018/03/bottle-opener.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).override(200, 150).into(merch3);


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
