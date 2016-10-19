package lab.coursera.modernartui2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.graphics.Color;

public class MainActivityFragment extends Fragment implements SeekBar.OnSeekBarChangeListener{
    private View view0, view1, view2,view4;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflaterView = inflater.inflate(R.layout.fragment_main, container, false);
        SeekBar mSeekBar = (SeekBar) inflaterView.findViewById(R.id.seek_bar);
        view0 = inflaterView.findViewById(R.id.view0);
        view1 = inflaterView.findViewById(R.id.view1);
        view2 = inflaterView.findViewById(R.id.view2);
        View view3 = inflaterView.findViewById(R.id.view3);
        view4 = inflaterView.findViewById(R.id.view4);
        mSeekBar.setOnSeekBarChangeListener(this);
        setColors(view0, view1, view2, view3, view4);
        return inflaterView;
    }

    private void setColors(View view0, View view1, View view2, View view3, View view4){
        view0.setBackgroundColor(Color.GREEN);
        view0.setTag(Color.GREEN);
        view1.setBackgroundColor(Color.YELLOW);
        view1.setTag(Color.YELLOW);
        view2.setBackgroundColor(Color.RED);
        view2.setTag(Color.RED);
        view3.setBackgroundColor(Color.LTGRAY);
        view3.setTag(Color.LTGRAY);
        view4.setBackgroundColor(Color.BLACK);
        view4.setTag(Color.BLACK);
    }

    private void changeColor(View view, int additionalValue) {
        int color = (Integer) view.getTag();
        color += additionalValue;
        view.setBackgroundColor(color);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        changeColor(view0, progress);
        changeColor(view1, progress);
        changeColor(view2, progress);
        changeColor(view4, progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
