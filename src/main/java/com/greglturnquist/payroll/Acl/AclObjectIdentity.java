package com.greglturnquist.payroll.Acl;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by agd on 11/16/16.
 */
// tag::code[]
@Data
@Entity
@Table(name = "object_identity")
public class AclObjectIdentity {
    private @Id @GeneratedValue Long id;

    private Long objectIdClass;
    private Long objectIdIdentity;
    private Long parentObject;
    private Long ownerSid;
    private Boolean entriesInheriting;

    protected AclObjectIdentity() {}

    public AclObjectIdentity(Long objectIdClass, Long objectIdIdentity, Long parentObject, Long ownerSid, Boolean entriesInheriting) {
        this.objectIdClass = objectIdClass;
        this.objectIdIdentity = objectIdIdentity;
        this.parentObject = parentObject;
        this.ownerSid = ownerSid;
        this.entriesInheriting = entriesInheriting;
    }
}
