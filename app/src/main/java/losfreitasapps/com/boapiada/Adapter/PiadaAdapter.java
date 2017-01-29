package losfreitasapps.com.boapiada.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import losfreitasapps.com.boapiada.Modelo.Piadas;
import losfreitasapps.com.boapiada.R;

/**
 * Created by Moises on 10/08/16.
 */
public class PiadaAdapter extends BaseAdapter {

    private List<Piadas> piadaList;
    private Context context;
    private LayoutInflater layoutInflater;

    public PiadaAdapter(List<Piadas> piadaList, Context context) {
        this.piadaList = piadaList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return piadaList.size();
    }

    @Override
    public Object getItem(int position) {
        return piadaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return piadaList.get(position).getId();
    }

    @Override
    public View getView(int position, View parent, ViewGroup viewGroup) {
        View item = layoutInflater.inflate(R.layout.item_piada_list, viewGroup, false);

        Piadas piadas = piadaList.get(position);

        TextView titulo = (TextView) item.findViewById(R.id.item_layout_titulo);
        titulo.setText(piadas.getTitulo());

        return item;
    }
}
