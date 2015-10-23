package com.nektarlabs.stormy.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nektarlabs.stormy.R;
import com.nektarlabs.stormy.weather.Hour;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by viktordenic on 10/23/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    @Bind(R.id.timeLabel) TextView mTimeLabel;
    @Bind(R.id.summaryLabel) TextView mSummaryLabel;
    @Bind(R.id.temperatureLabel) TextView mTemperatureLabel;
    @Bind(R.id.iconImageView) ImageView mIconImageView;

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder {

        public HourViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }

    public void BindHour(Hour hour) {
        mTimeLabel.setText(hour.getHourOfDay());
        mSummaryLabel.setText(hour.getSummary());
        mTemperatureLabel.setText(hour.getTemperature() + "");
        mIconImageView.setImageResource(hour.getIconId());
    }
}
