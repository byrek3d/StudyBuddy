package ch.epfl.sweng.studdybuddy;

import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.epfl.sweng.studdybuddy.activities.MapsActivity;

@RunWith(AndroidJUnit4.class)
public class MapsActivityTest {

    @Rule
    public ActivityTestRule<MapsActivity> mIntentsTestRule = new ActivityTestRule<>(MapsActivity.class, true, false);

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Before
    public void setup() {
    }

    @Test
    public void checkConfirmDoesntExistForNonAdmin() {

      /* Intent intent = new Intent();
        try {
            Thread.sleep(2000);
            onView(withId(R.id.confirmLocation)).check(matches(not(ViewMatchers.isDisplayed())));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

//        try {
//            Thread.sleep(2000);
//            onView(withId(R.id.confirmLocation)).check(matches(not(ViewMatchers.isDisplayed())));
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }


  /*  @Test
    public void mapListenerTest(){
        Marker marker = mock(Marker.class);
        PlaceAutocompleteFragment fragment = new PlaceAutocompleteFragment();
        MeetingLocation rolex = MapsHelper.ROLEX_LOCATION;
        MeetingLocation pos = MapsHelper.mapListener(rolex.getLatLng(), marker, fragment, mIntentsTestRule.getActivity());
        assertTrue(pos.equals(new MeetingLocation(rolex.getTitle(), rolex.getAddress(), rolex.getLatLng())));
    }
}*/
}
