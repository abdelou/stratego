package projet_stratego;

public class Pions {
	public String nom;
	public int force ;
	public int x;
	public int y ;
	public boolean etat;
	public Pions(String x_nom,int x_force,int x_x,int x_y,boolean x_etat)
	{
		this.nom=x_nom;
		this.force=x_force;
		this.x=x_x;
		this.y=x_y;
		this.etat=x_etat;
	}
	public Pions()
	{
		
	}
	public void setNom(String nom)
	{
		this.nom=nom;
	}
	public void setForce(int force)
	{
		this.force=force;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public void setEtat(boolean etat)
	{
		this.etat=etat;
	}
	public String getNom()
	{
		return nom;
	}
	public int getForce()
	{
		return force;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public boolean getEtat()
	{
		return etat;
	}
	public void deplacer(int x , int y)
	{
	x=x+1;
	y=y+1;
	}
	
}