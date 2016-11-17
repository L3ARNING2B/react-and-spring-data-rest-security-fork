/*
 * Copyright 2015 the original author or authors.
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
package com.greglturnquist.payroll;

import com.greglturnquist.payroll.Acl.*;
import com.greglturnquist.payroll.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component
public class DatabaseLoader implements CommandLineRunner {

	private final EmployeeRepository employees;
	private final ManagerRepository managers;
	private final CustomerRepository customers;
	private final AclSidRepository aclSids;
    private final AclClassRepository aclClasses;
    private final AclObjectIdentityRepository aclObjectIdentities;

	@Autowired
	public DatabaseLoader(EmployeeRepository employeeRepository,
						  ManagerRepository managerRepository,
						  CustomerRepository customerRepository,
						  AclSidRepository aclSidRepository,
                          AclClassRepository aclClassRepository,
                          AclObjectIdentityRepository aclObjectIdentityRepository) {

		this.employees = employeeRepository;
		this.managers = managerRepository;
		this.customers = customerRepository;
		this.aclSids = aclSidRepository;
        this.aclClasses = aclClassRepository;
        this.aclObjectIdentities = aclObjectIdentityRepository;
	}

	@Override
	public void run(String... strings) throws Exception {

		Manager agd = this.managers.save(new Manager("agd", "enter",
							"ROLE_MANAGER"));
		Manager ajt = this.managers.save(new Manager("ajt", "santa",
							"ROLE_MANAGER"));

		SecurityContextHolder.getContext().setAuthentication(
			new UsernamePasswordAuthenticationToken("agd", "doesn't matter",
				AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

		this.employees.save(new Employee("Frodo", "Baggins", "ring bearer", agd));
		this.employees.save(new Employee("Bilbo", "Baggins", "burglar", agd));
		this.employees.save(new Employee("Gandalf", "the Grey", "wizard", agd));

		SecurityContextHolder.getContext().setAuthentication(
			new UsernamePasswordAuthenticationToken("ajt", "doesn't matter",
				AuthorityUtils.createAuthorityList("ROLE_MANAGER")));

		this.employees.save(new Employee("Samwise", "Gamgee", "gardener", ajt));
		this.employees.save(new Employee("Merry", "Brandybuck", "pony rider", ajt));
		this.employees.save(new Employee("Peregrin", "Took", "pipe smoker", ajt));


		this.customers.save(new Customer("Total", "Company"));
		this.customers.save(new Customer("Nutella", "Company"));
		this.customers.save(new Customer("Esso", "Company"));

		this.aclSids.save(new AclSid(true, "15sdf15fg4s51sdf"));
		this.aclSids.save(new AclSid(true, "v1q54v85w4d515sdv5"));
		this.aclSids.save(new AclSid(false, "15qrv4515vqdv515vq"));
        this.aclSids.save(new AclSid(true, "sgd15b51s15d5sb15"));

        this.aclClasses.save(new AclClass("15sdf15fg4s51sdf"));
        this.aclClasses.save(new AclClass("v1q54v85w4d515sdv5"));
        this.aclClasses.save(new AclClass("v1q54v85w4d515sdv5"));

//        this.aclObjectIdentities.save(new AclObjectIdentity("15sdf", "15sdf", "15sdf", "15sdf", true));


		SecurityContextHolder.clearContext();
	}
}
// end::code[]