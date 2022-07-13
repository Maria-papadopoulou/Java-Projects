package com.mycompany.movies;

/**
 *
 * @author Μαρία
 */
public class MovieDetails
{
   
   private String id;
   private String title;
   private String year;
   private String duration;
   private String director;
    private  String rating;
   private String country;
  private String mainCharacter;
   
   private String category;
   
   public MovieDetails()
   {
   }
   
   public MovieDetails(String id, String title, String year, String duration, String director, String rating, String country, String mainCharacter,String category)
   {
       this.id=id;
       this.title=title;
       this.year=year;
       this.duration=duration;
       this.director=director;
       this.rating=rating;
       this.country=country;
       this.mainCharacter=mainCharacter;
       this.category=category;
   }
   
   public String getId()
   {
       return id;
   }
   
   public String getTitle()
   {
       return title;
   }
   
    public void setTitle(String title)
   {
       this.title=title;
   }
   
    public String getYear()
   {
       return year;
   }
    
    public void setYear(String year)
    {
        this.year=year;
    }
    
    public String getDuretion()
    {
        return duration;
    }
    
    public void setDuration(String duration)
    {
        this.duration=duration;
    }
       public String getRating()
    {
        return rating;
    }
    
    public void setRating(String rating)
    {
         this.rating=rating;
    }
   
        public String getCountry()
    {
        return country;
    }
    
    public void setCountry(String country)
    {
        this.country=country;
    }
   
        public String getMainCharacter()
    {
        return mainCharacter;
    }
    
    public void setMainCharacter(String mainCharacter)
    {
        this.duration=duration;
    }
   
    public String getDirector()
    {
        return director;
    }
    public void setDirector(String director)
    {
        this.director=director;
    }
        @Override
    public String toString()
    {
       return id + "\t " + title + " \t " + year + " \t " + duration + " \t " + director + "\t" + rating  + "/10" +"\t" +  country + "\t" + mainCharacter + " \t " + category;
}
}