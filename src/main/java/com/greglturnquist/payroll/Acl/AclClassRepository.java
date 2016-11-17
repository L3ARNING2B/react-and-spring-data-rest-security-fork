package com.greglturnquist.payroll.Acl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by agd on 11/16/16.
 */

// tag::code[]
@PreAuthorize("hasRole('ROLE_MANAGER')")
public interface AclClassRepository extends CrudRepository<AclClass, Long> {
}
