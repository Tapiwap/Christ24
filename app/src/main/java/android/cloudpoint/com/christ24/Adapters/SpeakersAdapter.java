package android.cloudpoint.com.christ24.Adapters;

import android.cloudpoint.com.christ24.R;
import android.cloudpoint.com.christ24.model.Speaker;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tsotsoh on 2/26/2018.
 */

public class SpeakersAdapter extends RecyclerView.Adapter<SpeakersAdapter.ViewHolder> {

    private ArrayList<Speaker> speakers;
    private Context context;

    public SpeakersAdapter(ArrayList<Speaker> speakers, Context context) {
        this.speakers = speakers;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.single_pastor_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.fullName.setText(speakers.get(position).getFullName());
        holder.time.setText(speakers.get(position).getTime());
        holder.image.setImageResource(speakers.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return speakers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        protected TextView fullName, time;
        protected ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);

            fullName = (TextView) itemView.findViewById(R.id.full_name);
            time = (TextView) itemView.findViewById(R.id.time);
            image = (ImageView) itemView.findViewById(R.id.pastor_image);
        }
    }
}
