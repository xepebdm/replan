package com.tim.replan.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity(name = "VW_PORTAL_REPLAN")
public class PortalReplan {

	private Long ID_ORDEM_COMPLEXA;
	private String ELEMENTO_ID;
	private String FREQUENCIA;
	private String PROJETO;
	private String REGIONAL;
	private String CLASSIFICACAO_CASA;
	private String CODIGO_ORCAMENTARIO;
	private String VENDOR;
	private Date AQUISICAO_BASELINE;
	private Date AQUISICAO_REPLAN;
	private Date AQUISICAO_REAL;
	private Date LICENCIAMENTO_BASELINE;
	private Date LICENCIAMENTO_REPLAN;
	private Date LICENCIAMENTO_REAL;
	private Date RFI_BASELINE;
	private Date RFI_REPLAN;
	private Date RFI_REAL;
	private Date TX_E2E_BASELINE;
	private Date TX_E2E_REPLAN;
	private Date TX_E2E_REAL;
	private Date ATIVACAO_BASELINE;
	private Date ATIVACAO_REPLAN;
	private Date ATIVACAO_REAL_REAL_NI;

	public Long getID_ORDEM_COMPLEXA() {
		return ID_ORDEM_COMPLEXA;
	}

	public String getELEMENTO_ID() {
		return ELEMENTO_ID;
	}

	public String getFREQUENCIA() {
		return FREQUENCIA;
	}

	public String getPROJETO() {
		return PROJETO;
	}

	public String getREGIONAL() {
		return REGIONAL;
	}

	public String getCLASSIFICACAO_CASA() {
		return CLASSIFICACAO_CASA;
	}

	public String getCODIGO_ORCAMENTARIO() {
		return CODIGO_ORCAMENTARIO;
	}

	public String getVENDOR() {
		return VENDOR;
	}

	public Date getAQUISICAO_BASELINE() {
		return AQUISICAO_BASELINE;
	}

	public Date getAQUISICAO_REPLAN() {
		return AQUISICAO_REPLAN;
	}

	public Date getAQUISICAO_REAL() {
		return AQUISICAO_REAL;
	}

	public Date getLICENCIAMENTO_BASELINE() {
		return LICENCIAMENTO_BASELINE;
	}

	public Date getLICENCIAMENTO_REPLAN() {
		return LICENCIAMENTO_REPLAN;
	}

	public Date getLICENCIAMENTO_REAL() {
		return LICENCIAMENTO_REAL;
	}

	public Date getRFI_BASELINE() {
		return RFI_BASELINE;
	}

	public Date getRFI_REPLAN() {
		return RFI_REPLAN;
	}

	public Date getRFI_REAL() {
		return RFI_REAL;
	}

	public Date getTX_E2E_BASELINE() {
		return TX_E2E_BASELINE;
	}

	public Date getTX_E2E_REPLAN() {
		return TX_E2E_REPLAN;
	}

	public Date getTX_E2E_REAL() {
		return TX_E2E_REAL;
	}

	public Date getATIVACAO_BASELINE() {
		return ATIVACAO_BASELINE;
	}

	public Date getATIVACAO_REPLAN() {
		return ATIVACAO_REPLAN;
	}

	public Date getATIVACAO_REAL_REAL_NI() {
		return ATIVACAO_REAL_REAL_NI;
	}

}
