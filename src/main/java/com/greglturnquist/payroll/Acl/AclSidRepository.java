package com.greglturnquist.payroll.Acl;

import com.greglturnquist.payroll.Acl.AclSid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created by agd on 11/16/16.
 */
// tag::code[]
@PreAuthorize("hasRole('ROLE_MANAGER')")
public interface AclSidRepository extends CrudRepository<AclSid, Long> {

    AclSid save(AclSid aclSid);

}
// end::code[]