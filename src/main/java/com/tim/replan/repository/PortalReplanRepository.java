package com.tim.replan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tim.replan.model.PortalReplan;

@Repository
public interface PortalReplanRepository extends JpaRepository<PortalReplan, Long> {

	public List<PortalReplan> findAllByRegional(String regional);
	
	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_REAL is not null")
	public List<PortalReplan> findAllByRegionalAndAquisicao(@Param("regional")String regional);
	
	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndLicenciamento(@Param("regional")String regional);
	
	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndPOS(@Param("regional")String regional);
	
	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndRFI(@Param("regional")String regional);
	
	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndMOS(@Param("regional")String regional);

	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndAtivacao(@Param("regional")String regional);

	@Query("select pr from VW_PORTAL_REPLAN pr where pr.REGIONAL = :regional and pr.AQUISICAO_BASELINE is not null")
	public List<PortalReplan> findAllByRegionalAndRevisao(@Param("regional")String regional);
}
