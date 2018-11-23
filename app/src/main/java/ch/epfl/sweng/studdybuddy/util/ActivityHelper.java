package ch.epfl.sweng.studdybuddy.util;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import ch.epfl.sweng.studdybuddy.core.Group;

public class ActivityHelper {
    public static View.OnClickListener showDropdown(AutoCompleteTextView tv) {
        return new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                tv.showDropDown();
            }
        };
    }
    /*public static Consumer<List<Meeting>> meetingConsumer(TextView title, Button time, Button date, Button plus) {
        return new Consumer<List<Meeting>>() {
            @Override
            public void accept(List<Meeting> meetings) {
                if(meetings.size() == 0) {
                    title.setVisibility(View.GONE);
                    time.setVisibility(View.GONE);
                    date.setVisibility(View.GONE);
                }
                else {
                    date.setText(meetings.get(0).date());
                    time.setText(meetings.get(meetings.size()-1).time());
                    title.setVisibility(View.VISIBLE);
                    time.setVisibility(View.VISIBLE);
                    date.setVisibility(View.VISIBLE);
                    plus.setVisibility(View.GONE);
                }
            }
        };
    }

    public static Consumer<List<Meeting>> singleMeeting(Meeting dest) {
        return new Consumer<List<Meeting>>() {
            @Override
            public void accept(List<Meeting> meetings) {
                if(!meetings.isEmpty()) dest.copy(meetings.get(0));
            }
        };
    }
    public static android.app.DatePickerDialog.OnDateSetListener listenDate(Meeting mee, Group group, MetaMeeting mm, AdapterAdapter adapter) {
        return new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                mee.getDeadline().setYear(year - 3800);
                mee.getDeadline().setMonth(monthOfYear -1);
                mee.getDeadline().setDay(dayOfMonth);
                mm.pushMeeting(mee, group); // new Serial Date
                adapter.update();
            }
        };
    }
    public static TimePickerDialog.OnTimeSetListener listenTime(Meeting mee, Group g, MetaMeeting mm, AdapterAdapter adapter) {
        return new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                mee.getDeadline().setMinutes(minute);
                mee.getDeadline().setHour(hourOfDay);
                mm.pushMeeting(mee, g);
                adapter.update();
            }
        };
    }

*/

    public static void adminMeeting(Button add, Group group, String userID) {
        Boolean admin = group.getAdminID().equals(userID);
        add.setVisibility(admin ? View.VISIBLE : View.GONE);
    }
}
