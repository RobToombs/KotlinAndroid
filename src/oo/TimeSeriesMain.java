package oo;

import java.util.Arrays;
import java.util.Collection;

public class TimeSeriesMain {
    public static void main(String[] args) {
        JavaTimeSeries<Person> peopleData = new JavaTimeSeries<>();
        peopleData.add(new Person());
        peopleData.add(new Student());

        Collection<Student> students = Arrays.asList(new Student(), new Student());
       // peopleData.addAll(students); // n ocovariances (when used from Java!)
        peopleData.addAllCovariant(students); // covariance via <? extends E>

        TimeSeries<Person> peopleDataKt = new TimeSeries<>();
        peopleDataKt.add(new Person());
        peopleDataKt.add(new Student());
        peopleDataKt.addAll(students);
    }
}
