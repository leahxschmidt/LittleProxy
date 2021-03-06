package org.littleshoot.proxy;

import java.io.IOException;
import java.io.InputStream;

import javax.net.ssl.TrustManager;

public interface KeyStoreManager {

    void addBase64Cert(String alias, String base64Cert) throws IOException;
    
    InputStream keyStoreAsInputStream();
    
    char[] getCertificatePassword();
    
    char[] getKeyStorePassword();

    TrustManager[] getTrustManagers();

    InputStream trustStoreAsInputStream();
    
    String getBase64Cert(String id);

}
