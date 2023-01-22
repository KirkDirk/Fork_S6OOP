public class ReportManager {
    Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void report(User user){
        reportable.report(user);
    }
}
