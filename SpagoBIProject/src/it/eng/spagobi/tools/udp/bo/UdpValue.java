/**

SpagoBI - The Business Intelligence Free Platform

Copyright (C) 2005-2008 Engineering Ingegneria Informatica S.p.A.

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

**/
package it.eng.spagobi.tools.udp.bo;

import java.io.Serializable;
import java.util.Date;

/**
* @author Antonella Giachino (antonella.giachino@eng.it)
*/

public class UdpValue implements Serializable {
	
    private Integer udpValueId=null;
    private Integer udpId=null;
    private Integer referenceId=null;
    private String label=null;
    private String name=null;
	private String value=null;
	private String family=null;
	private Integer prog=null;
	private Date beginTs=null;
	private Date endTs=null;
	/**
	 * @return the udpValueId
	 */
	public Integer getUdpValueId() {
		return udpValueId;
	}
	/**
	 * @param udpValueId the udpValueId to set
	 */
	public void setUdpValueId(Integer udpValueId) {
		this.udpValueId = udpValueId;
	}
	/**
	 * @return the udpId
	 */
	public Integer getUdpId() {
		return udpId;
	}
	/**
	 * @param udpId the udpId to set
	 */
	public void setUdpId(Integer udpId) {
		this.udpId = udpId;
	}
	/**
	 * @return the referenceId
	 */
	public Integer getReferenceId() {
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the family
	 */
	public String getFamily() {
		return family;
	}
	/**
	 * @param family the family to set
	 */
	public void setFamily(String family) {
		this.family = family;
	}
	/**
	 * @return the prog
	 */
	public Integer getProg() {
		return prog;
	}
	/**
	 * @param prog the prog to set
	 */
	public void setProg(Integer prog) {
		this.prog = prog;
	}
	/**
	 * @return the beginTs
	 */
	public Date getBeginTs() {
		return beginTs;
	}
	/**
	 * @param beginTs the beginTs to set
	 */
	public void setBeginTs(Date beginTs) {
		this.beginTs = beginTs;
	}
	/**
	 * @return the endTs
	 */
	public Date getEndTs() {
		return endTs;
	}
	/**
	 * @param endTs the endTs to set
	 */
	public void setEndTs(Date endTs) {
		this.endTs = endTs;
	}
	
	
}
