/*
 * Copyright 2013 Carnegie Mellon University.
 * Portions Copyright 2004 Sun Microsystems, Inc.
 * Portions Copyright 2004 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 */

package at.ooe.fh.mc.codespeech.speechrecognition;


/**
 * Simple class that provides correctly set up Microphone object 
 * 
 * @author Lukasz Strzelecki
 *
 */
public class SpeechSourceProvider {

    /**
     * Creates and returns new Microphone object with correct setup
     * 
     * @return new Microphone with correct setup
     */
    public Microphone getMicrophone() {
        return new Microphone(16000, 16, true, false);
    }
}
