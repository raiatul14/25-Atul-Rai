import java.io.*;

public class RestoreDBProgram{
    public void restoreProgramDB(String path){
        String executeCmd = "mysql -u root -proot -B test_db < " + path;
        System.out.println(executeCmd);
        Process runtimeProcess;
        try{
            runtimeProcess = Runtime.getRuntime().exec(new String[]{
                "cmd.exe", "/c", executeCmd
            });
            // BufferedReader stdInput = new BufferedReader(new 
            //         InputStreamReader(runtimeProcess.getInputStream()));
            // System.out.println("Here is the standard output of the command:\n");
            // BufferedReader stdError = new BufferedReader(new 
            //         InputStreamReader(runtimeProcess.getErrorStream()));

            // String s = null;
            // while ((s = stdInput.readLine()) != null) {
            //     System.out.println(s);
            // }

            
            int processComplete = runtimeProcess.waitFor();
            System.out.println(processComplete);
            if(processComplete==0){
                System.out.println("Restored Successfully !");
            }
            else{
                System.out.println("Couldn't restore the backup!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new RestoreDBProgram().restoreProgramDB("C:\\Users\\AJACKU~1\\Documents\\cyber_forensics_pracs\\backup.sql");
    }
}