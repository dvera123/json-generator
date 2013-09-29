package com.projectx.json.generator.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
/**
*
* @author Vera
*/
@Entity
@Table(name = "game")
@XmlRootElement
@NamedQueries({
   @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g"),
   @NamedQuery(name = "Game.findById", query = "SELECT g FROM Game g WHERE g.id = :id"),
   @NamedQuery(name = "Game.findByName", query = "SELECT g FROM Game g WHERE g.name = :name")})
public class Game implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = true)
    @Column(name = "name")
    private String name;
    @Basic(optional = true)
    @Column(name = "developers")
    private String developers;
    @Basic(optional = true)
    @Column(name = "first_release")
    private String firstRelease;
    @Basic(optional = true)
    @Column(name = "japan")
    private String japan;
    @Basic(optional = true)
    @Column(name = "europe")
    private String europe;
    @Basic(optional = true)
    @Column(name = "north_america")
    private String northAmerica;
    @Basic(optional = true)
    @Column(name = "exclusive")
    private String exclsive;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevelopers() {
		return developers;
	}
	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	public String getFirstRelease() {
		return firstRelease;
	}
	public void setFirstRelease(String firstRelease) {
		this.firstRelease = firstRelease;
	}
	public String getJapan() {
		return japan;
	}
	public void setJapan(String japan) {
		this.japan = japan;
	}
	public String getEurope() {
		return europe;
	}
	public void setEurope(String europe) {
		this.europe = europe;
	}
	public String getNorthAmerica() {
		return northAmerica;
	}
	public void setNorthAmerica(String northAmerica) {
		this.northAmerica = northAmerica;
	}
	public String getExclsive() {
		return exclsive;
	}
	public void setExclsive(String exclsive) {
		this.exclsive = exclsive;
	}
    

}
