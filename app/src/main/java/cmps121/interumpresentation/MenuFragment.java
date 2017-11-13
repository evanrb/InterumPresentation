package cmps121.interumpresentation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Evan Blank on 11/11/2017.
 */

public class MenuFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle saveInstanceState){
        return inflator.inflate(R.layout.menu_fragment_layout, container, false);
    }
}
