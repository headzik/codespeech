/* ====================================================================
 * Copyright (c) 2014 Alpha Cephei Inc.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY ALPHA CEPHEI INC. ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL CARNEGIE MELLON UNIVERSITY
 * NOR ITS EMPLOYEES BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * ====================================================================
 */

package at.ooe.fh.mc.codespeech.speechrecognition.cmusphinx;

import static edu.cmu.pocketsphinx.Decoder.defaultConfig;
import static edu.cmu.pocketsphinx.Decoder.fileConfig;

import java.io.File;
import java.io.IOException;

import at.ooe.fh.mc.codespeech.general.exceptions.NotImplementedException;
import at.ooe.fh.mc.codespeech.speechrecognition.SpeechRecognizer.Mode;
import edu.cmu.pocketsphinx.Config;

/**
 * Wrapper for the decoder configuration to implement builder pattern.
 * Configures most important properties of the decoder
 */
public class PocketsphinxSetup {

    static {
        System.loadLibrary("pocketsphinx_jni");
    }

    private final Config config;

    /**
     * Creates new speech recognizer builder with default configuration.
     */
    public static PocketsphinxSetup defaultSetup() {
        return new PocketsphinxSetup(defaultConfig());
    }

    /**
     * Creates new speech recognizer builder from configuration file.
     * Configuration file should consist of lines containing key-value pairs.
     * 
     * @param configFile
     *            configuration file
     */
    public static PocketsphinxSetup setupFromFile(File configFile) {
        return new PocketsphinxSetup(fileConfig(configFile.getPath()));
    }

    private PocketsphinxSetup(Config config) {
        this.config = config;
    }

    public PocketsphinxSpeechRecognizer getRecognizer(Mode mode) throws IOException, NotImplementedException {
        return new PocketsphinxSpeechRecognizer(config, mode);
    }

    public PocketsphinxSetup setAcousticModel(File model) {
        return setString("-hmm", model.getPath());
    }

    public PocketsphinxSetup setDictionary(File dictionary) {
        return setString("-dict", dictionary.getPath());
    }

    public PocketsphinxSetup setSampleRate(int rate) {
        return setFloat("-samprate", rate);
    }

    public PocketsphinxSetup setRawLogDir(File dir) {
        return setString("-rawlogdir", dir.getPath());
    }

    public PocketsphinxSetup setKeywordThreshold(float threshold) {
        return setFloat("-kws_threshold", threshold);
    }

    public PocketsphinxSetup setMLLR(File mllrMatrix) {
        return setString("-mllr", mllrMatrix.getPath());
    }
    
    public PocketsphinxSetup setBoolean(String key, boolean value) {
        config.setBoolean(key, value);
        return this;
    }

    public PocketsphinxSetup setInteger(String key, int value) {
        config.setInt(key, value);
        return this;
    }

    public PocketsphinxSetup setFloat(String key, double value) {
        config.setFloat(key, value);
        return this;
    }

    public PocketsphinxSetup setString(String key, String value) {
        config.setString(key, value);
        return this;
    }
}
