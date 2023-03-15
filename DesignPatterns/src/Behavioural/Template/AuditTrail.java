package Behavioural.Template;

public class AuditTrail {
    public void record(){
        System.out.println("Audit");
    }
}

//Essentially if we want functionality to ALWAYS happen when carrying out a task, we request call it in the abstract, then continue the rest of the functionality
//This way we do not need to repeat the same functionality multiple times and no longer need to repeat ourselves