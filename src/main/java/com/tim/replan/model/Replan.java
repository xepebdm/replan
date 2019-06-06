package com.tim.replan.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity(name = "REPLAN")
public class Replan {

	private Long OC;
	private Date AQUIS_F_REPLAN;
	private Date LICENC_F_REPLAN;
	private Date INFRA_F_REPLAN;
	private Date TX_F_REPLAN;
	private Date ATV_F_REPLAN;
	private boolean FLAG;
	private Status status; // COLUNA -> STATUS_APROVACAO
	
	public Long getOC() {
		return OC;
	}

	public Date getAQUIS_F_REPLAN() {
		return AQUIS_F_REPLAN;
	}

	public Date getLICENC_F_REPLAN() {
		return LICENC_F_REPLAN;
	}

	public Date getINFRA_F_REPLAN() {
		return INFRA_F_REPLAN;
	}

	public Date getTX_F_REPLAN() {
		return TX_F_REPLAN;
	}

	public Date getATV_F_REPLAN() {
		return ATV_F_REPLAN;
	}

	public boolean isFLAG() {
		return FLAG;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
