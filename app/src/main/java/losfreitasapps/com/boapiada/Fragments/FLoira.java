package losfreitasapps.com.boapiada.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import losfreitasapps.com.boapiada.Adapter.PiadaAdapter;
import losfreitasapps.com.boapiada.Piadas.Loira;
import losfreitasapps.com.boapiada.R;
import losfreitasapps.com.boapiada.ShowActivities.ShowLoiraActivity;

/**
 * Created by Moises on 20/08/16.
 */
public class FLoira extends Fragment {
    ListView piadasListview;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main,container,false);

//        AdView mAdView1 = (AdView) view.findViewById(R.id.adView1);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView1.loadAd(adRequest);

        piadasListview = (ListView) view.findViewById(R.id.mainActivity_piadasList);

        PiadaAdapter adapter = new PiadaAdapter(Loira.getPLoira(), getActivity());

        piadasListview.setAdapter(adapter);

        piadasListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int size = piadasListview.getCount();
                Intent intent = new Intent(getActivity(), ShowLoiraActivity.class);
                intent.putExtra("id_list", position);
                intent.putExtra("sz_list", size);
                startActivity(intent);
            }
        });
        return view;
    }
}
