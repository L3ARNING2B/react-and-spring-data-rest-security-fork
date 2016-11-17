package com.greglturnquist.payroll.business;

import com.greglturnquist.payroll.Acl.AclObjectIdentity;
import com.greglturnquist.payroll.Acl.AclSid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by agd on 11/16/16.
 */
// tag::code[]
@PreAuthorize("hasRole('ROLE_MANAGER')")
public interface AclObjectIdentityRepository extends CrudRepository<AclObjectIdentity, Long> {
        AclObjectIdentity save(AclObjectIdentity aclObjectIdentity);
}
// end::code[]