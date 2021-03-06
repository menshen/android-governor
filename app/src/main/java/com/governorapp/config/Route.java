package com.governorapp.config;

import android.content.Context;

import fi.iki.elonen.NanoHTTPD;

/**
 * Route interface.
 */
public interface Route {
    /**
     * Generate a response to a request.
     *
     * @param session The HTTP session containing the request.
     * @return The HTTP response object.
     */
    public NanoHTTPD.Response getResponse(Context appContext, Configuration config, NanoHTTPD.IHTTPSession session);
}
