package org.psiada.app.punc;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.PlaceDetectionClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static android.content.Context.LOCATION_SERVICE;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Transportation.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Transportation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Transportation extends Fragment implements OnMapReadyCallback, GoogleMap.OnMyLocationButtonClickListener, GoogleMap.OnMyLocationClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private MapView mapView;
    private GoogleMap googleMap;

    private boolean mLocationPermissionGranted = false;


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

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_transportation, container, false);

        mapView = rootView.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        mapView.getMapAsync(this);

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

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        getLocationPermission();
        googleMap.setOnMyLocationButtonClickListener(this);
        googleMap.setOnMyLocationClickListener(this);

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

        LocationManager locationManager = (LocationManager) this.getContext().getSystemService(LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String provider = locationManager.getBestProvider(criteria, true);

        if (ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.


            return;
        }
        Location location = locationManager.getLastKnownLocation(provider);

        if (location != null){
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            LatLng myLocation = new LatLng(latitude, longitude);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 13));
        } else {
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(allenSt, 13));

        }
    }

    public void updateLocation(){
        LocationManager locationManager = (LocationManager) this.getContext().getSystemService(LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String provider = locationManager.getBestProvider(criteria, true);

        if (ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            ActivityCompat.requestPermissions(this.getActivity(),
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
            return;
        }
        Location location = locationManager.getLastKnownLocation(provider);

        if (location != null){
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            LatLng myLocation = new LatLng(latitude, longitude);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myLocation, 13));
        } else {

            LatLng allenSt = new LatLng(40.794324, -77.861592);
            googleMap.addMarker(new MarkerOptions().position(allenSt)
                    .title("Allen St. Grill"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(allenSt, 13));

        }
    }

    @Override
    public boolean onMyLocationButtonClick() {
//        Toast.makeText(getActivity(), "MyLocation button clicked", Toast.LENGTH_SHORT).show();
        // Return false so that we don't consume the event and the default behavior still occurs
        // (the camera animates to the user's current position).
        return false;
    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(getActivity(), "Current location:\n" + location, Toast.LENGTH_LONG).show();
    }

    private void getLocationPermission() {
        /*
         * Request location permission, so that we can get the location of the
         * device. The result of the permission request is handled by a callback,
         * onRequestPermissionsResult.
         */
        if (ContextCompat.checkSelfPermission(this.getActivity(),
                android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true;
            googleMap.setMyLocationEnabled(true);

        } else {
            ActivityCompat.requestPermissions(this.getActivity(),
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();

        }


        updateLocation();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String permissions[],
                                           @NonNull int[] grantResults) {
        mLocationPermissionGranted = false;
        switch (requestCode) {
            case PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    mLocationPermissionGranted = true;
                }
            }
        }
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
