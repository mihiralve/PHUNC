package org.psiada.app.phunc;

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
 * {@link Coffee.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Coffee#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Coffee extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Coffee() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Coffee.
     */
    // TODO: Rename and change types and number of parameters
    public static Coffee newInstance(String param1, String param2) {
        Coffee fragment = new Coffee();
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
        final View rootView = inflater.inflate(R.layout.fragment_coffee, container, false);

        TextView cafe1 = (TextView)rootView.findViewById(R.id.cafe1);
        cafe1.setClickable(true);
        cafe1.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage1 = (ImageView)rootView.findViewById(R.id.cafeImage1);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/abba-java.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage1);

        TextView cafe2a = (TextView)rootView.findViewById(R.id.cafe2a);
        cafe2a.setClickable(true);
        cafe2a.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cafe2b = (TextView)rootView.findViewById(R.id.cafe2b);
        cafe2b.setClickable(true);
        cafe2b.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage2 = (ImageView)rootView.findViewById(R.id.cafeImage2);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/Au-Bon-Pain-Coffee.png").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage2);

        TextView cafe3 = (TextView)rootView.findViewById(R.id.cafe3);
        cafe3.setClickable(true);
        cafe3.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage3 = (ImageView)rootView.findViewById(R.id.cafeImage3);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/CheeseShoppe.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage3);

        TextView cafe4 = (TextView)rootView.findViewById(R.id.cafe4);
        cafe4.setClickable(true);
        cafe4.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage4 = (ImageView)rootView.findViewById(R.id.cafeImage4);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/Dukin-donuts-donut.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage4);

        TextView cafe5 = (TextView)rootView.findViewById(R.id.cafe5);
        cafe5.setClickable(true);
        cafe5.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage5 = (ImageView)rootView.findViewById(R.id.cafeImage5);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/irvings_bagels.jpeg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage5);

        TextView cafe6 = (TextView)rootView.findViewById(R.id.cafe6);
        cafe6.setClickable(true);
        cafe6.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage6 = (ImageView)rootView.findViewById(R.id.cafeImage6);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/panera-bread.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage6);

        TextView cafe7 = (TextView)rootView.findViewById(R.id.cafe7);
        cafe7.setClickable(true);
        cafe7.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage7 = (ImageView)rootView.findViewById(R.id.cafeImage7);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/penn-state-creamery.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage7);

        TextView cafe8 = (TextView)rootView.findViewById(R.id.cafe8);
        cafe8.setClickable(true);
        cafe8.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage8 = (ImageView)rootView.findViewById(R.id.cafeImage8);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/saints-cafe.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage8);

        TextView cafe9 = (TextView)rootView.findViewById(R.id.cafe9);
        cafe9.setClickable(true);
        cafe9.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage9 = (ImageView)rootView.findViewById(R.id.cafeImage9);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/sowers-harvest-cafe.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage9);

        TextView cafe10a = (TextView)rootView.findViewById(R.id.cafe10a);
        cafe10a.setClickable(true);
        cafe10a.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cafe10b = (TextView)rootView.findViewById(R.id.cafe10b);
        cafe10b.setClickable(true);
        cafe10b.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage10 = (ImageView)rootView.findViewById(R.id.cafeImage10);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/starbucks.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage10);

        TextView cafe11 = (TextView)rootView.findViewById(R.id.cafe11);
        cafe11.setClickable(true);
        cafe11.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage11 = (ImageView)rootView.findViewById(R.id.cafeImage11);
        Glide.with(getContext()).load("http://phunc.psiada.org/wp-content/uploads/2018/03/websters.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage11);

        TextView cafe12 = (TextView)rootView.findViewById(R.id.cafe12);
        cafe12.setClickable(true);
        cafe12.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView cafeImage12 = (ImageView)rootView.findViewById(R.id.cafeImage12);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2018/10/duckdonutsFB.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(cafeImage12);


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
