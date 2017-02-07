/*-
 * ================================================================================
 * eCOMP Portal SDK
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ================================================================================
 */
package org.openecomp.portalsdk.core.onboarding.crossapi;

/**
 * @author Ikram Ikramullah
 */
public class PortalAPIException extends Exception{

	private static final long serialVersionUID = 4854048794984375707L;

	public PortalAPIException() {
		super();
	}

	public PortalAPIException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PortalAPIException(String message, Throwable cause) {
		super(message, cause);
	}

	public PortalAPIException(String message) {
		super(message);
	}

	public PortalAPIException(Throwable cause) {
		super(cause);
	}
	
}