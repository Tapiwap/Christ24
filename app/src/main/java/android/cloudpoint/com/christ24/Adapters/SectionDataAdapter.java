package android.cloudpoint.com.christ24.Adapters;

import android.cloudpoint.com.christ24.DetailsActivity;
import android.cloudpoint.com.christ24.R;
import android.cloudpoint.com.christ24.model.Video;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Tsotsoh on 2/15/2018.
 */

public class SectionDataAdapter extends RecyclerView.Adapter<SectionDataAdapter.SingleItemRowHolder> {

    private ArrayList<Video> videoList;
    private Context mContext;

    public SectionDataAdapter(ArrayList<Video> videoList, Context mContext) {
        this.videoList = videoList;
        this.mContext = mContext;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_video_card_schedule, null);
        return new SingleItemRowHolder(view);
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        holder.itemTitle.setText(videoList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return (null != videoList ? videoList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder{

        protected TextView itemTitle;
        protected ImageView itemImage;

        public SingleItemRowHolder(View itemView, TextView itemTitle, ImageView itemImage) {
            super(itemView);
            this.itemTitle = itemTitle;
            this.itemImage = itemImage;
        }

        public SingleItemRowHolder(final View itemView) {
            super(itemView);

            this.itemTitle = (TextView)itemView.findViewById(R.id.itemTitle);
            this.itemImage = (ImageView)itemView.findViewById(R.id.itemImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(mContext, DetailsActivity.class);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
