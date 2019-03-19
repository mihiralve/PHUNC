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
 * {@link Restaurants.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Restaurants#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Restaurants extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Restaurants() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Restaurants.
     */
    // TODO: Rename and change types and number of parameters
    public static Restaurants newInstance(String param1, String param2) {
        Restaurants fragment = new Restaurants();
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
        final View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        TextView menu1 = (TextView)rootView.findViewById(R.id.menu1);
        menu1.setClickable(true);
        menu1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu1 = (TextView)rootView.findViewById(R.id.ActualMenu1);
        ActualMenu1.setClickable(true);
        ActualMenu1.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage1 = (ImageView)rootView.findViewById(R.id.menuImage1);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/india_pavillion.jpeg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage1);


        TextView menu2 = (TextView)rootView.findViewById(R.id.menu2);
        menu2.setClickable(true);
        menu2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu2 = (TextView)rootView.findViewById(R.id.ActualMenu2);
        ActualMenu2.setClickable(true);
        ActualMenu2.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage2 = (ImageView)rootView.findViewById(R.id.menuImage2);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/pita_cabana.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage2);


        TextView menu3 = (TextView)rootView.findViewById(R.id.menu3);
        menu3.setClickable(true);
        menu3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu3 = (TextView)rootView.findViewById(R.id.ActualMenu3);
        ActualMenu3.setClickable(true);
        ActualMenu3.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage3 = (ImageView)rootView.findViewById(R.id.menuImage3);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/yallah.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage3);


        TextView menu4 = (TextView)rootView.findViewById(R.id.menu4);
        menu4.setClickable(true);
        menu4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu4 = (TextView)rootView.findViewById(R.id.ActualMenu4);
        ActualMenu4.setClickable(true);
        ActualMenu4.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage4 = (ImageView)rootView.findViewById(R.id.menuImage4);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/cozy_thai.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage4);

        TextView menu20 = (TextView)rootView.findViewById(R.id.menu20);
        menu20.setClickable(true);
        menu20.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu20 = (TextView)rootView.findViewById(R.id.ActualMenu20);
        ActualMenu20.setClickable(true);
        ActualMenu20.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage20 = (ImageView)rootView.findViewById(R.id.menuImage20);
        Glide.with(getContext()).load("httpss://phunc.psiada.org/wp-content/uploads/2018/10/snap.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage20);

        TextView menu5 = (TextView)rootView.findViewById(R.id.menu5);
        menu5.setClickable(true);
        menu5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu5 = (TextView)rootView.findViewById(R.id.ActualMenu5);
        ActualMenu5.setClickable(true);
        ActualMenu5.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage5 = (ImageView)rootView.findViewById(R.id.menuImage5);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/irvings.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage5);


        TextView menu6 = (TextView)rootView.findViewById(R.id.menu6);
        menu6.setClickable(true);
        menu6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu6 = (TextView)rootView.findViewById(R.id.ActualMenu6);
        ActualMenu6.setClickable(true);
        ActualMenu6.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage6 = (ImageView)rootView.findViewById(R.id.menuImage6);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/fiddlehead.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage6);


        TextView menu7 = (TextView)rootView.findViewById(R.id.menu7);
        menu7.setClickable(true);
        menu7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu7 = (TextView)rootView.findViewById(R.id.ActualMenu7);
        ActualMenu7.setClickable(true);
        ActualMenu7.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage7 = (ImageView)rootView.findViewById(R.id.menuImage7);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/bagel_crust.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage7);


        TextView menu8 = (TextView)rootView.findViewById(R.id.menu8);
        menu8.setClickable(true);
        menu8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu8 = (TextView)rootView.findViewById(R.id.ActualMenu8);
        ActualMenu8.setClickable(true);
        ActualMenu8.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage8 = (ImageView)rootView.findViewById(R.id.menuImage8);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/little_szechuan.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage8);


        TextView menu9 = (TextView)rootView.findViewById(R.id.menu9);
        menu9.setClickable(true);
        menu9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu9 = (TextView)rootView.findViewById(R.id.ActualMenu9);
        ActualMenu9.setClickable(true);
        ActualMenu9.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage9 = (ImageView)rootView.findViewById(R.id.menuImage9);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/corner_room.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage9);


        TextView menu10 = (TextView)rootView.findViewById(R.id.menu10);
        menu10.setClickable(true);
        menu10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu10 = (TextView)rootView.findViewById(R.id.ActualMenu10);
        ActualMenu10.setClickable(true);
        ActualMenu10.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage10 = (ImageView)rootView.findViewById(R.id.menuImage10);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/chipotle.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage10);


        TextView menu11 = (TextView)rootView.findViewById(R.id.menu11);
        menu11.setClickable(true);
        menu11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu11 = (TextView)rootView.findViewById(R.id.ActualMenu11);
        ActualMenu11.setClickable(true);
        ActualMenu11.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage11 = (ImageView)rootView.findViewById(R.id.menuImage11);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/pho11.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage11);



        TextView menu12 = (TextView)rootView.findViewById(R.id.menu12);
        menu12.setClickable(true);
        menu12.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu12 = (TextView)rootView.findViewById(R.id.ActualMenu12);
        ActualMenu12.setClickable(true);
        ActualMenu12.setMovementMethod(LinkMovementMethod.getInstance());


        ImageView menuImage12 = (ImageView)rootView.findViewById(R.id.menuImage12);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/deli.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage12);



        TextView menu13 = (TextView)rootView.findViewById(R.id.menu13);
        menu13.setClickable(true);
        menu13.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu13 = (TextView)rootView.findViewById(R.id.ActualMenu13);
        ActualMenu13.setClickable(true);
        ActualMenu13.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage13 = (ImageView)rootView.findViewById(R.id.menuImage13);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/big_bowl.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage13);



        TextView menu14 = (TextView)rootView.findViewById(R.id.menu14);
        menu14.setClickable(true);
        menu14.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu14 = (TextView)rootView.findViewById(R.id.ActualMenu14);
        ActualMenu14.setClickable(true);
        ActualMenu14.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage14 = (ImageView)rootView.findViewById(R.id.menuImage14);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/babys.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage14);




        TextView menu15 = (TextView)rootView.findViewById(R.id.menu15);
        menu15.setClickable(true);
        menu15.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu15 = (TextView)rootView.findViewById(R.id.ActualMenu15);
        ActualMenu15.setClickable(true);
        ActualMenu15.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage15 = (ImageView)rootView.findViewById(R.id.menuImage15);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/green_bowl.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage15);




        TextView menu16 = (TextView)rootView.findViewById(R.id.menu16);
        menu16.setClickable(true);
        menu16.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu16 = (TextView)rootView.findViewById(R.id.ActualMenu16);
        ActualMenu16.setClickable(true);
        ActualMenu16.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage16 = (ImageView)rootView.findViewById(R.id.menuImage16);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/underground.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage16);




        TextView menu17 = (TextView)rootView.findViewById(R.id.menu17);
        menu17.setClickable(true);
        menu17.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu17 = (TextView)rootView.findViewById(R.id.ActualMenu17);
        ActualMenu17.setClickable(true);
        ActualMenu17.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage17 = (ImageView)rootView.findViewById(R.id.menuImage17);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/galanga.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage17);




        TextView menu18 = (TextView)rootView.findViewById(R.id.menu18);
        menu18.setClickable(true);
        menu18.setMovementMethod(LinkMovementMethod.getInstance());

        TextView ActualMenu18 = (TextView)rootView.findViewById(R.id.ActualMenu18);
        ActualMenu18.setClickable(true);
        ActualMenu18.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView menuImage18 = (ImageView)rootView.findViewById(R.id.menuImage18);
        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2017/11/tavern.jpg").diskCacheStrategy(DiskCacheStrategy.ALL).into(menuImage18);






        // Inflate the layout for this fragment
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
