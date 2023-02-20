package residency_project_files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeFormates {
    public static void main(String[] args) {
        SimpleDateFormat sday = new SimpleDateFormat("E");
        SimpleDateFormat day = new SimpleDateFormat("dd");
        SimpleDateFormat smonth = new SimpleDateFormat("MMM");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat fdate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hour = new SimpleDateFormat("HH");
        SimpleDateFormat minite = new SimpleDateFormat("mm");
        SimpleDateFormat second = new SimpleDateFormat("ss");
        SimpleDateFormat ampm = new SimpleDateFormat("aa");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat full = new SimpleDateFormat("E MMM dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("sday : " +sday.format(date));
        System.out.println("day : " +day.format(date));
        System.out.println("smonth : "+smonth.format(date));
        System.out.println("month : "+month.format(date));
        System.out.println("year : "+year.format(date));
        System.out.println("fdate : "+fdate.format(date));
        System.out.println("hour : "+hour.format(date));
        System.out.println("minite : "+minite.format(date));
        System.out.println("second : "+second.format(date));
        System.out.println("ampm : "+ampm.format(date));
        System.out.println("time : "+time.format(date));
        System.out.println("full : "+full.format(date));
    }
}














// System.out.println("residency tower");
// char[] ch = {'*','#','$','%', '&', '@', '^', '~', '£', '¥', 'Ö' , 'Ü', 'ß' , 'ö'};
// for (char i : ch) {
//     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
//     System.out.printf("%c%c%c%c%c   %c%c%c%c%c%c  %c%c%c%c%c%c  %c%c  %c%c%c%c%c    %c%c%c%c%c%c  %c       %c   %c%c%c%c%c  %c       %c        %c%c%c%c%c%c%c       %c%c       %c           %c  %c%c%c%c%c%c  %c%c%c%c%c \n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c    %c  %c       %c           %c    %c   %c       %c %c     %c  %c        %c     %c            %c       %c      %c    %c     %c     %c  %c       %c    %c\n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c    %c  %c       %c       %c%c  %c     %c  %c       %c  %c    %c  %c         %c   %c             %c      %c        %c   %c    %c %c    %c  %c       %c    %c\n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c%c%c%c%c   %c%c%c%c%c%c  %c%c%c%c%c%c  %c%c  %c     %c  %c%c%c%c%c%c  %c   %c   %c  %c          %c %c              %c     %c          %c  %c   %c   %c   %c  %c%c%c%c%c%c  %c%c%c%c%c \n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c  %c    %c            %c  %c%c  %c     %c  %c       %c    %c  %c  %c           %c               %c      %c        %c   %c  %c     %c  %c  %c       %c  %c  \n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c   %c   %c            %c  %c%c  %c    %c   %c       %c     %c %c  %c          %c                %c       %c      %c    %c %c       %c %c  %c       %c   %c \n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);
//     System.out.printf("%c    %c  %c%c%c%c%c%c  %c%c%c%c%c%c  %c%c  %c%c%c%c%c    %c%c%c%c%c%c  %c       %c   %c%c%c%c%c    %c                 %c          %c%c       %c           %c  %c%c%c%c%c%c  %c    %c\n",i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i);

// }