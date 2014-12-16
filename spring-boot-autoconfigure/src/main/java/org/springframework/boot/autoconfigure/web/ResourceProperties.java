/*
 * Copyright 2012-2014 the original author or authors.
 *
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
 */

package org.springframework.boot.autoconfigure.web;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties used to configure resource handling.
 *
 * @author Phillip Webb
 * @since 1.1.0
 */
@ConfigurationProperties(prefix = "spring.resources", ignoreUnknownFields = false)
public class ResourceProperties {

	/**
	 * Cache period for the resources served by the resource handler, in seconds.
	 */
	private Integer cachePeriod;

	/**
	 * Enable default resource handling.
	 */
	private boolean addMappings = true;

	public Integer getCachePeriod() {
		return this.cachePeriod;
	}

	public void setCachePeriod(Integer cachePeriod) {
		this.cachePeriod = cachePeriod;
	}

	public boolean isAddMappings() {
		return this.addMappings;
	}

	public void setAddMappings(boolean addMappings) {
		this.addMappings = addMappings;
	}

}