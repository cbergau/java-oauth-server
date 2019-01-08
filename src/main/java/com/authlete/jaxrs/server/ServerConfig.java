/*
 * Copyright (C) 2019 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package com.authlete.jaxrs.server;


import com.authlete.jaxrs.server.util.ServerProperties;


/**
 * A class for configuration of this server.
 *
 * @author Hideki Ikeda
 */
public class ServerConfig
{
    /**
     * Properties.
     */
    private static final ServerProperties sProperties = new ServerProperties();


    /**
     * Property keys.
     */
    private static final String AD_BASE_URL_KEY                     = "ad.base_url";
    private static final String AD_WORKSPACE_KEY                    = "ad.workspace";
    private static final String AD_SYNC_AUTHENTICATION_TIMEOUT_KEY  = "ad.sync.authentication_timeout";
    private static final String AD_SYNC_CONNECT_TIMEOUT_KEY         = "ad.sync.connect_timeout";
    private static final String AD_SYNC_READ_TIMEOUT_KEY            = "ad.sync.read_timeout";
    private static final String AD_ASYNC_AUTHENTICATION_TIMEOUT_KEY = "ad.async.authentication_timeout";
    private static final String AD_ASYNC_CONNECT_TIMEOUT_KEY        = "ad.async.connect_timeout";
    private static final String AD_ASYNC_READ_TIMEOUT_KEY           = "ad.async.read_timeout";
    private static final String AD_POLL_AUTHENTICATION_TIMEOUT_KEY  = "ad.poll.authentication.timeout";
    private static final String AD_POLL_CONNECT_TIMEOUT_KEY         = "ad.poll.connect_timeout";
    private static final String AD_POLL_READ_TIMEOUT_KEY            = "ad.poll.read_timeout";


    /**
     * Default configuration values.
     */
    private static final String DEFAULT_BASE_URL                  = "https://cibasim.authlete.com";
    private static final int DEFAULT_SYNC_AUTHENTICATION_TIMEOUT  = 10;    // 10 seconds.
    private static final int DEFAULT_SYNC_CONNECT_TIMEOUT         = 10000; // 10000 milliseconds.
    private static final int DEFAULT_SYNC_READ_TIMEOUT            = 60000; // 60000 milliseconds.
    private static final int DEFAULT_ASYNC_AUTHENTICATION_TIMEOUT = 10;    // 10 seconds.
    private static final int DEFAULT_ASYNC_CONNECT_TIMEOUT        = 10000; // 10000 milliseconds.
    private static final int DEFAULT_ASYNC_READ_TIMEOUT           = 10000; // 10000 milliseconds.
    private static final int DEFAULT_POLL_AUTHENTICATION_TIMEOUT  = 10;    // 10 seconds.
    private static final int DEFAULT_POLL_CONNECT_TIMEOUT         = 10000; // 10000 milliseconds.
    private static final int DEFAULT_POLL_READ_TIMEOUT            = 10000; // 10000 milliseconds.


    /**
     * Determined configuration values.
     */
    private static final String AD_BASE_URL                  = sProperties.getString(AD_BASE_URL_KEY, DEFAULT_BASE_URL);
    private static final String AD_WORKSPACE                 = sProperties.getString(AD_WORKSPACE_KEY);
    private static final int AD_SYNC_AUTHENTICATION_TIMEOUT  = sProperties.getInt(AD_SYNC_AUTHENTICATION_TIMEOUT_KEY, DEFAULT_SYNC_AUTHENTICATION_TIMEOUT);
    private static final int AD_SYNC_CONNECT_TIMEOUT         = sProperties.getInt(AD_SYNC_CONNECT_TIMEOUT_KEY, DEFAULT_SYNC_CONNECT_TIMEOUT);
    private static final int AD_SYNC_READ_TIMEOUT            = sProperties.getInt(AD_SYNC_READ_TIMEOUT_KEY, DEFAULT_SYNC_READ_TIMEOUT);
    private static final int AD_ASYNC_AUTHENTICATION_TIMEOUT = sProperties.getInt(AD_ASYNC_AUTHENTICATION_TIMEOUT_KEY, DEFAULT_ASYNC_AUTHENTICATION_TIMEOUT);
    private static final int AD_ASYNC_CONNECT_TIMEOUT        = sProperties.getInt(AD_ASYNC_CONNECT_TIMEOUT_KEY, DEFAULT_ASYNC_CONNECT_TIMEOUT);
    private static final int AD_ASYNC_READ_TIMEOUT           = sProperties.getInt(AD_ASYNC_READ_TIMEOUT_KEY, DEFAULT_ASYNC_READ_TIMEOUT);
    private static final int AD_POLL_AUTHENTICATION_TIMEOUT  = sProperties.getInt(AD_POLL_AUTHENTICATION_TIMEOUT_KEY, DEFAULT_POLL_AUTHENTICATION_TIMEOUT);
    private static final int AD_POLL_CONNECT_TIMEOUT         = sProperties.getInt(AD_POLL_CONNECT_TIMEOUT_KEY, DEFAULT_POLL_CONNECT_TIMEOUT);
    private static final int AD_POLL_READ_TIMEOUT            = sProperties.getInt(AD_POLL_READ_TIMEOUT_KEY, DEFAULT_POLL_READ_TIMEOUT);


    /**
     * Get the base URL of <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim">
     * Authlete CIBA authentication device simulator API</a>.
     *
     * @return
     *         The base URL of <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim">
     *         Authlete CIBA authentication device simulator API</a>.
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim">Authlete CIBA authentication device simulator API</a>
     */
    public static String getAdBaseUrl()
    {
        return AD_BASE_URL;
    }


    /**
     * Get the workspace for which end-user authentication and authorization is
     * performed on {@link <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The workspace for which end-user authentication and authorization is
     *         performed on {@link <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim">Authlete CIBA authentication device simulator API</a>
     */
    public static String getAdWorkspace()
    {
        return AD_WORKSPACE;
    }


    /**
     * Get the authentication/authorization timeout value (in seconds) used when
     * the authorization server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     * /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * <p>
     * The authentication device simulator waits for this timeout value to get
     * authorization decision from an end-user.
     * </p>
     *
     * @return
     *         The authentication/authorization timeout value (in seconds) used
     *         when the authorization server makes a request to {@link
     *         <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     *         /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">/api/authenticate/sync API</a>
     */
    public static int getAdSyncAuthenticationTimeout()
    {
        return AD_SYNC_AUTHENTICATION_TIMEOUT;
    }


    /**
     * Get the connect timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     * /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The connect timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     *         /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">/api/authenticate/sync API</a>
     */
    public static int getAdSyncConnectTimeout()
    {
        return AD_SYNC_CONNECT_TIMEOUT;
    }


    /**
     * Get the read timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     * /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The read timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">
     *         /api/authenticate/sync API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_sync">/api/authenticate/sync API</a>
     */
    public static int getAdSyncReadTimeout()
    {
        return AD_SYNC_READ_TIMEOUT;
    }


    /**
     * Get the authentication/authorization timeout value (in seconds) used when
     * the authorization server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     * /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * <p>
     * The authentication device simulator waits for this timeout value to get
     * authorization decision from an end-user.
     * </p>
     *
     * @return
     *         The authentication/authorization timeout value (in seconds) used
     *         when the authorization server makes a request to {@link
     *         <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     *         /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">/api/authenticate/async API</a>
     */
    public static int getAdAsyncAuthenticationTimeout()
    {
        return AD_ASYNC_AUTHENTICATION_TIMEOUT;
    }


    /**
     * Get the connect timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     * /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The connect timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     *         /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">/api/authenticate/async API</a>
     */
    public static int getAdAsyncConnectTimeout()
    {
        return AD_ASYNC_CONNECT_TIMEOUT;
    }


    /**
     * Get the read timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     * /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The read timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">
     *         /api/authenticate/async API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_async">/api/authenticate/async API</a>
     */
    public static int getAdAsyncReadTimeout()
    {
        return AD_ASYNC_READ_TIMEOUT;
    }


    /**
     * Get the authentication/authorization timeout value (in seconds) used when
     * the authorization server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     * /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * <p>
     * The authentication device simulator waits for this timeout value to get
     * authorization decision from an end-user.
     * </p>
     *
     * @return
     *         The authentication/authorization timeout value (in seconds) used
     *         when the authorization server makes a request to {@link
     *         <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     *         /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">/api/authenticate/poll API</a>
     */
    public static int getAdPollAuthenticationTimeout()
    {
        return AD_POLL_AUTHENTICATION_TIMEOUT;
    }


    /**
     * Get the connect timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     * /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The connect timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     *         /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">/api/authenticate/poll API</a>
     */
    public static int getAdPollConnectTimeout()
    {
        return AD_POLL_CONNECT_TIMEOUT;
    }


    /**
     * Get the read timeout value (in milliseconds) used when the authorization
     * server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     * /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     * Authlete CIBA authentication device simulator</a>}.
     *
     * @return
     *         The read timeout value (in milliseconds) used when the authorization
     *         server makes a request to {@link <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">
     *         /api/authenticate/poll API</a>} of {@link <a href="https://cibasim.authlete.com">
     *         Authlete CIBA authentication device simulator</a>}.
     *
     * @see <a href="https://cibasim.authlete.com">Authlete CIBA authentication device simulator</a>
     *
     * @see <a href="https://app.swaggerhub.com/apis-docs/Authlete/cibasim/1.0.0#/default/post_api_authenticate_poll">/api/authenticate/poll API</a>
     */
    public static int getAdPollReadTimeout()
    {
        return AD_POLL_READ_TIMEOUT;
    }
}
