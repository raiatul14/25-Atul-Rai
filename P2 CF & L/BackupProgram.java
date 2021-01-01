import java.io.*;

public class BackupProgram{
    public void backupProgramDB(String path){
        String executeCmd = "mysqldump -u root -proot -B test_db -r " + path;
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
                System.out.println("Backup Created Successfully !");
            }
            else{
                System.out.println("Couldn't Create the backup!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        new BackupProgram().backupProgramDB("C:\\Users\\AJACKU~1\\Documents\\cyber_forensics_pracs\\backup.sql");
    }
}