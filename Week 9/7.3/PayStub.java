public class PayStub {
    public static void main(String[] args){
        StaffMember [] list = new StaffMember[4];
        list[0] = new Executive("Tom", "123 Plaza", "111-123-1234", "012-45-1111", 5000, 2000);
        list[1] = new Hourly("Jim", "111 Fort Hamilton Parkway", "347-322-8664", "123-12-1223", 50, 40);
        list[2] = new Volunteer("Ezana", "915 E 7th Street", "646-479-7748");
        list[3] = new Volunteer("Merjema", "8801 Shore Road", "347-831-8464");
        for (int i=0; i<=5; i++){
            System.out.println(list[i]);
            System.out.println(list[i].pay());
        }
    }
}
