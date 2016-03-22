package com.sf.kyc.vas.audit.listeners;

import com.sf.kyc.vas.envars.audit.entity.AuditEntity;
import nw.commons.NeemClazz;
import org.hibernate.envers.RevisionListener;

/**
 * Used by envers for audit purposes
 *
 * @author nuke
 *
 */
public class AuditListener extends NeemClazz implements RevisionListener {

    @Override
    public void newRevision(Object entity) {

        AuditEntity ae = (AuditEntity) entity;
        try {
            ae.setOrbitaId(0L);
            ae.setEmailAddress("tech@kycvas.com");
            ae.setRemoteAddress("127.0.0.1");
            ae.setRemoteHost("127.0.0.1");
            ae.setUserAgent("Middle(webservice)");
            ae.setCurrentURL("localhost");

        } catch (Exception e) {
            logger.error("Exception ", e);
        }
    }

}
