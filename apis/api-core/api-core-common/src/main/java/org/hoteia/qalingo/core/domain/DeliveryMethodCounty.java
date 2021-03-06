/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hoteia.qalingo.core.domain.impl.DomainEntity;

@Entity
@Table(name="TECO_DELIVERY_METHOD_COUNTY")
public class DeliveryMethodCounty extends AbstractEntity<DeliveryMethodCounty> implements DomainEntity {

	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = 4578114712421583690L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID", nullable=false)
	private Long id;
	
	@Column(name="CODE_COUNTY")
	private String codeCounty;
	
	public DeliveryMethodCounty() {
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodeCounty() {
		return codeCounty;
	}
	
	public void setCodeCounty(String codeCounty) {
		this.codeCounty = codeCounty;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeCounty == null) ? 0 : codeCounty.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object sourceObj) {
        Object obj = deproxy(sourceObj);
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DeliveryMethodCounty other = (DeliveryMethodCounty) obj;
        if (codeCounty == null) {
            if (other.codeCounty != null)
                return false;
        } else if (!codeCounty.equals(other.codeCounty))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DeliveryMethodCounty [id=" + id + ", codeCounty=" + codeCounty + "]";
    }
	
}