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
@Table(name = "acl_sid")
public class AclSid {

    private @Id @GeneratedValue Long id;

    private Boolean principal;
    private String sid;

    protected AclSid() {}
    public AclSid(Boolean principal, String sid) {
        this.principal = principal;
        this.sid = sid;
    }
}
//
//public class AclClass {
//
//    private @Id @GeneratedValue Long id;
//
//    private String class;
//
//    private @Version @JsonIgnore Long version;
//
//    private @ManyToOne Acl_class acl_class;
//
//    protected Acl_class() {}
//
//    public Acl_class(String class) {
//        this.class = class;
//    }
//}
//
//public class ObjectIdentity {
//
//    private @Id @GeneratedValue Long id;
//
//    private long object_id_class;
//    private long object_id_identity;
//    private long parent_object;
//    private long owner_sid;
//    private boolean entries_inheriting;
//
//    private @Version @JsonIgnore Long version;
//
//    private @ManyToOne Object_identity object_identity;
//
//    protected Object_identity() {}
//
//    public Object_identity(long object_id_class, long object_id_identity, long parent_object, long owner_sid, boolean entries_inheriting) {
//        this.long = long;
//        this.long = long;
//        this.long = long;
//        this.long = long;
//        this.long = boolean;
//    }
//}
//
//public class AclEntry {
//
//    private @Id @GeneratedValue Long id;
//
//    private long acl_object_identity;
//    private int ace_order;
//    private long sid;
//    private int mask;
//    private boolean granting;
//    private boolean audit_success;
//    private boolean audit_faillure;
//
//    private @Version @JsonIgnore Long version;
//
//    private @ManyToOne Acl_entry acl_entry;
//
//    protected Acl_entry() {}
//
//    public Acl_entry(long acl_object_identity, int ace_order, long sid, int mask, boolean granting, boolean audit_success, boolean audit_faillure) {
//        this.long = long;
//        this.int = int;
//        this.long = long;
//        this.int = int;
//        this.boolean = boolean;
//        this.boolean = boolean;
//        this.boolean = boolean;
//    }
//}
// end::code[]