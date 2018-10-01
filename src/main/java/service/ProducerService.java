package service;

import com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken;
import model.Producer;

import java.util.Set;

public interface ProducerService {
    void create(XmlToken Name, Long addressId);
    Set<Producer> findAll();

}
