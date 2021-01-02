package br.com.milton.calendarview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //private CalendarView calendarView;
    private MaterialCalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);

        // seta data maxima e minima para navegação
        /*calendarView.state().edit()
                .setMinimumDate(CalendarDay.from(2019,0,1))
                .setMaximumDate(CalendarDay.from(2021,11,31))
                .commit();
        */

        /*
        // seta os titulos dos meses em portugues, nesse caso a biblioteca já vem em portugues
        CharSequence meses[]   = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        calendarView.setTitleMonths( meses );
        // seta os titulos das semanas em portugues, nesse caso a biblioteca já vem em portugues
        CharSequence semanas[] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        calendarView.setWeekDayLabels( semanas );
         */

        calendarView.setOnMonthChangedListener((widget, date) -> {
            Log.i("Data", "Valor: " + (date.getMonth() + 1) + "/" + date.getYear());
        });

        /*
        calendarView.setOnDateChangedListener((widget, date, selected) -> {
            Log.i("Data", "Valor" + date);
        });
        */

        /*
        calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            Log.i("Data", "Valor" + dayOfMonth + "/" + month + "/" + year);
        });
        */
    }
}