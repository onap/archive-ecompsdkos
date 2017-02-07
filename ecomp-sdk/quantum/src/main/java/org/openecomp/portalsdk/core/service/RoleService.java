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
package org.openecomp.portalsdk.core.service;

import java.util.List;

import org.openecomp.portalsdk.core.domain.Role;
import org.openecomp.portalsdk.core.domain.RoleFunction;


public interface RoleService {
	List<RoleFunction> getRoleFunctions();
	
	List<Role> getAvailableChildRoles(Long roleId);
	
	Role getRole(Long id);
	
	void saveRole(Role domainRole);
	
	void deleteRole(Role domainRole);
	
	List<Role> getAvailableRoles();
	
	List<Role> getActiveRoles();

	RoleFunction getRoleFunction(String code);
	
	void saveRoleFunction(RoleFunction domainRoleFunction);
	
	void deleteRoleFunction(RoleFunction domainRoleFunction);
	
	void deleteDependcyRoleRecord(Long id);
}
