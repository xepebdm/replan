package com.tim.replan.model;

import java.util.Date;

public class Site {

	// VARIAVES PADRAO DO OBJETO SITE
	private Long OC; // COLUNA -> ID_ORDEM_COMPLEXA
	private String SITE_ID; //COLUNA -> ELEMENTO_ID
	private String FREQUÊNCIA;
	private String PROJETO;
	private String REGIONAL;
	private String CLASSIFICACAO_CASA;
	private String CODIGO_ORCAMENTARIO;
	private String VENDOR;
	private String CLASSE;
	private String MUNICÍPIO;
	private String UF;
	
	// VARIAVES OPCIONAIS QUE MUDAM DEPENDENDO DO PROCESSO SELECIONADO
	private Date AQUISICAO; //COLUNA -> AQUISICAO_BASELINE/ AQUISICAO_REPLAN/ AQUISICAO_REAL
	private Date LICENCIAMENTO;	//COLUNA -> LICENCIAMENTO_BASELINE/ LICENCIAMENTO_REPLAN/ LICENCIAMENTO_REAL
	private Date RFI; //COLUNA -> RFI_BASELINE/RFI_REPLAN/ RFI_REAL
	private Date ATIVACAO; //COLUNA -> ATIVACAO_BASELINE/ ATIVACAO_REPLAN/ ATIVACAO_NI_REAL / ATIVACAO_REAL
	private Date PO;	 // COLUNA -> TODAS_POS_EMITIDAS_BASELINE/ TODAS_POS_EMITIDAS_REPLAN/ TODAS_POS_EMITIDAS_REAL
	private Date MOS; //COLUNA -> MOS_BASELINE/ MOS_REPLAN/	MOS_REAL
	private Date REPLAN_AQUISIÇÃO; // COLUNA -> AQUIS_F_REPLAN/ AQUISICAO_REAL
	private Date REPLAN_LICENCIAMENTO; //COLUNA -> LICENC_F_REPLAN/ LICENCIAMENTO_REAL
	private Date REPLAN_PO;	//COLUNA -> PO_F_REPLAN/ TODAS_POS_EMITIDAS_REAL
	private Date REPLAN_TX; // COLUNA -> TX_E2E_BASELINE/TX_E2E_REPLAN/ TX_E2E_REAL
	private Date REPLAN_RFI; //COLUNA -> INFRA_F_REPLAN/ RFI_REAL
	private Date REPLAN_MOS;//COLUNA -> MOS_F_REPLAN/MOS_REAL


	private Date Replan;


	public Long getOC() {
		return OC;
	}

	public String getSITE_ID() {
		return SITE_ID;
	}

	public String getFREQUÊNCIA() {
		return FREQUÊNCIA;
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

	public String getCLASSE() {
		return CLASSE;
	}

	public String getMUNICÍPIO() {
		return MUNICÍPIO;
	}

	public String getUF() {
		return UF;
	}

}
