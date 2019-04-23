package android.cloudpoint.com.christ24.Adapters;

import android.cloudpoint.com.christ24.R;
import android.cloudpoint.com.christ24.model.Video;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tsotsoh on 2/12/2018.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoHolder> {

    //private Context mContext;
    private List<Video> mData;

    public VideoAdapter( List<Video> mData) {
        //this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.programme_card_item, parent, false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoHolder holder, int position) {
        holder.videoName.setText(mData.get(position).getTitle());
        holder.thumbnail.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class VideoHolder extends RecyclerView.ViewHolder{

        TextView videoName;
        ImageView thumbnail;

        public VideoHolder(View itemView) {
            super(itemView);

            videoName = (TextView) itemView.findViewById(R.id.video_name);
            thumbnail = (ImageView) itemView.findViewById(R.id.card_thumbnail);
        }
    }
}
