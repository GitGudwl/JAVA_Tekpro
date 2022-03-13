public class itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;

    public itachi() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai);
    }
    
    void printDojutsu() {
        System.out.println(super.Dojutsu);
        System.out.println(this.Dojutsu);
    }
    
    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}