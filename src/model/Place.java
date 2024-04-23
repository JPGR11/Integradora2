package model;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Place{
	
	//Atributos Place
	
	private String namePlace;
	
	private NameDepartment nameDepartment;
	
	private double sizeSquareKilometers;

	private TypeArea typeArea;

	private Calendar inagurationDate;
	
	private String placePicture;
	
	private double economicResources;

	private Calendar inaugurationDate;


	private Specie[] specieArray;
	
	
	/**
	*Descripción: Método constructor de la clase Place.
	*@param String name.
	*@param double size.
	*@param String picture.
	*@param double money.
	*/
	
	public Place(String name, NameDepartment nameDepartment, double size, TypeArea typeArea, Calendar inaugurationDate, String picture, double money) {
        namePlace = name;
        this.nameDepartment = nameDepartment;
        this.typeArea = typeArea;
        this.inaugurationDate = inaugurationDate;
        sizeSquareKilometers = size;
        placePicture = picture;
        economicResources = money;
    }

	public String getInaugurationDate() {
        // Formatear la fecha utilizando SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(inaugurationDate.getTime());
    }

	public void setInaugurationDate(Calendar inaugurationDate) {
        this.inaugurationDate = inaugurationDate;
    }

    public Calendar getInaugurationDateCalendar() {
        return inaugurationDate;
    }
	
	public void addSpecie(Specie specie){
		for(int i = 0; i < specieArray.length; i++ ){
			if(specieArray[i] == null){
				specieArray[i] = specie;
				break;
			}
		}
	}
	
	//----------------------------------------------------------------------Setters-----------------------------------------------------------------------------------------------------------------
	
	/**
	* Descripción: Método set de Name.
	*@param String namePlace.
	*/
	
	public void setName(String namePlace){
		this.namePlace = namePlace;
	}
	
	/**
	* Descripción: Método set de área.
	*@param double sizeSquareKilometers.
	*/
	
	public void setArea(double sizeSquareKilometers){
		this.sizeSquareKilometers = sizeSquareKilometers;
	}
	
	/**
	* Descripción: Método set del URL de la imagen.
	*@param String placePicture.
	*/
	
	public void setPicture(String placePicture){
		this.placePicture = placePicture;
	}
	
	/**
	* Descripción: Método set de los recursos economicos que se necesitan.
	*@param double economicResources .
	*/
	
	public void setEconomicResourcesNeeded(double economicResources){
		this.economicResources = economicResources;
	}
	
	//-----------------------------------------------------------------------Getters----------------------------------------------------------------------------------------------------------------
	
	/**
	*Descripción: Permite obtener el nombre del lugar.
	*@return namePlace.
	*/
	
	public String getName(){
		return namePlace;
	}
	
	/**
	*Descripción: Permite obtener el valor de área en kilometros cuadrados.
	*@return sizeSquareKilometers.
	*/
	
	public double getArea(){
		return sizeSquareKilometers;
	}
	
	/**
	*Descripción: Permite obtener el URL de la foto.
	*@return placePicture.
	*/
	
	public String getPicture(){
		return placePicture;
	}
	
	/**
	*Descripción: Permite obtener la cantidad de recursos económicos para su sostenimiento.
	*@return economicResources.
	*/
	
	public double geteconomicResourcesNeeded(){
		return economicResources;
	}
}