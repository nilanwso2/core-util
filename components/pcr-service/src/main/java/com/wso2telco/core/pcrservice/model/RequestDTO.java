/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.core.pcrservice.model;

// TODO: Auto-generated Javadoc
/**
 * The Class RequestDTO.
 */
public class RequestDTO {

	/** The user id. */
	private String userId;
	
	/** The app id. */
	private String appId;
	
	/** The sector id. */
	private String sectorId;
	
	/** The is related. */
	private boolean isRelated;

	/**
	 * Instantiates a new request DTO.
	 *
	 * @param userId the user id
	 * @param appId the app id
	 * @param sectorId the sector id
	 * @param isRelated the is related
	 */
	public RequestDTO(String userId, String appId, String sectorId, boolean isRelated) {
		this.userId = userId;
		this.appId = appId;
		this.sectorId = sectorId;
		this.isRelated = isRelated;
	}
	
	/**
	 * Instantiates a new request DTO.
	 *
	 * @param userId the user id
	 * @param appId the app id
	 * @param sectorId the sector id
	 */
	public RequestDTO(String userId, String appId, String sectorId) {
		this.userId = userId;
		this.appId = appId;
		this.sectorId = sectorId;
		this.isRelated=true;
	}
	
		
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public String getUserId() {
		return userId;
	}
		
	/**
	 * Gets the app id.
	 *
	 * @return the app id
	 */
	public String getAppId() {
		return appId;
	}	
	
	/**
	 * Gets the sector id.
	 *
	 * @return the sector id
	 */
	public String getSectorId() {
		return sectorId;
	}	
	
	/**
	 * Checks if is related.
	 *
	 * @return true, if is related
	 */
	public boolean isRelated() {
		return isRelated;
	}	
}