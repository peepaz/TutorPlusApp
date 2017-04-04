package com.tutorplus.controllers;


import com.tutorplus.application_core.TutorPlusApplicationIntf;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TutorialClient {
    
    private TutorPlusApplicationIntf tutorplusIntf;
    private final String tutorialyServerURL= "rmi://" + "localhost" + "/TutorPlusApplicaions";;

    public TutorialClient() throws RemoteException {
        try {
            this.tutorplusIntf = (TutorPlusApplicationIntf)Naming.lookup(this.tutorialyServerURL);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(TutorialClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public TutorPlusApplicationIntf gettutorplusIntf(){
    return this.tutorplusIntf;
    }
         
}
