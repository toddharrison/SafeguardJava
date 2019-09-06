package com.oneidentity.safeguard.safeguardjava.authentication;

import com.oneidentity.safeguard.safeguardjava.exceptions.ObjectDisposedException;
import com.oneidentity.safeguard.safeguardjava.exceptions.SafeguardForJavaException;


public interface IAuthenticationMechanism
{
    String getNetworkAddress();
    int getApiVersion();
    boolean isIgnoreSsl();
    boolean hasAccessToken();
    void clearAccessToken();
    char[] getAccessToken() throws ObjectDisposedException;
    int getAccessTokenLifetimeRemaining() throws ObjectDisposedException, SafeguardForJavaException;
    void refreshAccessToken() throws ObjectDisposedException, SafeguardForJavaException;
    Object cloneObject() throws SafeguardForJavaException;
    void dispose();
}
