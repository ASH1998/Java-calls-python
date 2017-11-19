/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_calls_python;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASHU
 */
public class Java_calls_python {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
 public static void main(String[] args) throws IOException {
// set up the command and parameter
String pythonScriptPath = "D:\\Python Coding\\NLTK\\tokenizing_p1.py";
String[] cmd = new String[2];
cmd[0] = "python"; // check version of installed python: python -V
cmd[1] = pythonScriptPath;
 
// create runtime to execute external command
Runtime rt = Runtime.getRuntime();
Process pr = rt.exec(cmd);
 
// retrieve output from python script
BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
String line = "";
while((line = bfr.readLine()) != null) {
// display each output line form python script
System.out.println(line);
}
}
    
}
