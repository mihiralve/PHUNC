package org.psiada.app.punc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Transportation.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Transportation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Transportation extends Fragment implements OnMapReadyCallback {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private MapView mapView;
    private GoogleMap googleMap;

    public Transportation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Transportation.
     */
    // TODO: Rename and change types and number of parameters
    public static Transportation newInstance(String param1, String param2) {
        Transportation fragment = new Transportation();
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

//        mapView = (MapView) findViewById(R.id.map);
//        mapView.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_transportation, container, false);

        mapView = rootView.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        mapView.getMapAsync(this);

//        TouchImageView campusMap = (TouchImageView) rootView.findViewById(R.id.campusMap);
//        final ProgressBar progressBar = new ProgressBar(getContext());
//        Glide.with(getContext()).load("https://phunc.psiada.org/wp-content/uploads/2018/10/campus-map.jpg").listener(new RequestListener<String, GlideDrawable>() {
//            @Override
//            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
//                progressBar.setVisibility(View.GONE);
//                return false;
//            }
//
//            @Override
//            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
//                progressBar.setVisibility(View.GONE);
//                return false;
//            }
//        }).diskCacheStrategy(DiskCacheStrategy.ALL).into(campusMap);
//
//        TextView willard = (TextView)rootView.findViewById(R.id.willard);
//        willard.setClickable(true);
//        willard.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView atherton = (TextView)rootView.findViewById(R.id.atherton);
//        atherton.setClickable(true);
//        atherton.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView sparks = (TextView)rootView.findViewById(R.id.sparks);
//        sparks.setClickable(true);
//        sparks.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView bbh = (TextView)rootView.findViewById(R.id.bbh);
//        bbh.setClickable(true);
//        bbh.setMovementMethod(LinkMovementMethod.getInstance());





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

//    @Override
//    public void onStart() {
//
//        super.onStart();
//        mapView.onStart();
//    }
//
//    @Override
//    public void onResume() {
//
//        super.onResume();
//        mapView.onResume();
//    }
//
//    @Override
//    public void onPause() {
//
//        super.onPause();
//        mapView.onPause();
//    }
//
//    @Override
//    public void onStop() {
//
//        super.onStop();
//        mapView.onStop();
//    }
//
//    @Override
//    public void onDestroy() {
//
//        super.onDestroy();
//        mapView.onDestroy();
//    }
//
//    @Override
//    public void onSaveInstanceState (Bundle outState){
//        mapView.onSaveInstanceState(outState);
//    }
//
//    @Override
//    public void onLowMemory() {
//
//        super.onLowMemory();
//        mapView.onLowMemory();
//    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;
        LatLng businessBuilding = new LatLng(40.803895, -77.865213);
        googleMap.addMarker(new MarkerOptions().position(businessBuilding)
                .title("Business Building"));

        LatLng envy = new LatLng(40.798221, -77.856230);
        googleMap.addMarker(new MarkerOptions().position(envy)
                .title("Envy"));

        LatLng allenSt = new LatLng(40.794324, -77.861592);
        googleMap.addMarker(new MarkerOptions().position(allenSt)
                .title("Allen St. Grill"));

        LatLng radisson = new LatLng(40.810985, -77.832877);
        googleMap.addMarker(new MarkerOptions().position(radisson)
                .title("Radisson"));

        LatLng super8 = new LatLng(40.786302, -77.834840);
        googleMap.addMarker(new MarkerOptions().position(super8)
                .title("Super 8"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(envy, 13));
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
