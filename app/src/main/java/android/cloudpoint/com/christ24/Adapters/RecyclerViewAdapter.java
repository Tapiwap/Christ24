package android.cloudpoint.com.christ24.Adapters;

import android.cloudpoint.com.christ24.R;
import android.cloudpoint.com.christ24.model.SectionDataModel;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Tsotsoh on 2/15/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ItemHolder> {

    private ArrayList<SectionDataModel> dataList;
    private Context mContext;
    private RecyclerView.RecycledViewPool recycledViewPool;

    public RecyclerViewAdapter(ArrayList<SectionDataModel> dataList, Context mContext) {
        this.dataList = dataList;
        this.mContext = mContext;
        recycledViewPool = new RecyclerView.RecycledViewPool();
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_horizontal_card, null);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        ArrayList singleSectionItems = dataList.get(position).getVideoList();
        holder.sectionTitle.setText(dataList.get(position).getSectionTitle());
        SectionDataAdapter adapter = new SectionDataAdapter(singleSectionItems, mContext);
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter);
        holder.recyclerView.setRecycledViewPool(recycledViewPool);
        holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Button More Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class ItemHolder extends RecyclerView.ViewHolder{

        protected TextView sectionTitle;
        protected RecyclerView recyclerView;
        protected Button btnMore;

        public ItemHolder(View itemView) {
            super(itemView);
            this.sectionTitle = (TextView)itemView.findViewById(R.id.sectionTitle);
            this.recyclerView = (RecyclerView)itemView.findViewById(R.id.recycler_view_list);
            this.btnMore = (Button) itemView.findViewById(R.id.btnMore);
        }
    }
}
