package org.psiada.app.phunc;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Resources.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Resources#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Resources extends Fragment implements View.OnClickListener, Resources_mun101.OnFragmentInteractionListener,
                                                    Resources_crisis101.OnFragmentInteractionListener,
                                                    Resouces_directive101.OnFragmentInteractionListener,
                                                    Resources_parli_pro.OnFragmentInteractionListener,
                                                    Resources_parli_pro_detailed.OnFragmentInteractionListener,
                                                    Resources_Scheme.OnFragmentInteractionListener,
                                                    Resources_passing_defeating.OnFragmentInteractionListener {
    // TODO: Rename parameter arguments, choose names that match
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
            // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Resources() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Resources.
     */
    // TODO: Rename and change types and number of parameters
    public static Resources newInstance(String param1, String param2) {
        Resources fragment = new Resources();
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

        View rootView =  inflater.inflate(R.layout.fragment_resources, container, false);

        TextView mun_101 = (TextView) rootView.findViewById(R.id.mun_101);
        mun_101.setOnClickListener(this);

        TextView crisis_101 = (TextView) rootView.findViewById(R.id.crisis_101);
        crisis_101.setOnClickListener(this);

        TextView directive_101 = (TextView) rootView.findViewById(R.id.directive_101);
        directive_101.setOnClickListener(this);

        TextView parli_pro = (TextView) rootView.findViewById(R.id.parli_pro);
        parli_pro.setOnClickListener(this);

        TextView parli_pro_in_depth = (TextView) rootView.findViewById(R.id.parli_pro_in_depth);
        parli_pro_in_depth.setOnClickListener(this);

        TextView event_scheme = (TextView) rootView.findViewById(R.id.event_scheme);
        event_scheme.setOnClickListener(this);

        TextView passing_defeating = (TextView) rootView.findViewById(R.id.passing_defeating);
        passing_defeating.setOnClickListener(this);



        return rootView;
    }





    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    /*
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
    */

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {

        Fragment fragment = null;
        Class fragmentClass = null;

        switch (view.getId()){


            case R.id.mun_101:
                fragmentClass = Resources_mun101.class;
                break;

            case R.id.crisis_101:
                fragmentClass = Resources_crisis101.class;
                break;

            case R.id.directive_101:
                fragmentClass = Resouces_directive101.class;
                break;

            case R.id.parli_pro:
                fragmentClass = Resources_parli_pro.class;
                break;

            case R.id.parli_pro_in_depth:
                fragmentClass = Resources_parli_pro_detailed.class;
                break;

            case R.id.event_scheme:
                fragmentClass = Resources_Scheme.class;
                break;

            case R.id.passing_defeating:
                fragmentClass = Resources_passing_defeating.class;
                break;

        }

        try{
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }



        android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).addToBackStack("").commit();


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
