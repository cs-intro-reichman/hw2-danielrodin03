public class TimeCalc {
    public static void main(String[] args) {
        String hours = "" + args[0].charAt(0) + args[0].charAt(1);
		String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
        int minutesAdd = Integer.parseInt(args [1]);
        int totalMinutes = (Integer.parseInt(hours) * 60 + Integer.parseInt(minutes) + minutesAdd);
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - totalHours * 60;
        String hh = "" +newHours;
        String mm = "" +newMinutes;
        if (newHours < 10) {
            hh = "0" +newHours;
        }
        if (newMinutes < 10) {
            mm = "0" +newMinutes;
        }  
        System.out.println(hh+ ":" +mm);
    }
}
