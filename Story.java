import org.code.theater.*;
import org.code.media.*;

public class Story extends Scene {

    /* 
    Instantiating arrays for equipment, strategem categories, 
    strategem details, and gear with associated images or text.
    */
private String[] equipment;
private ImageFilter[] equipmentIcons;

 private String[] StrategemCategories;
  private ImageFilter[] categoryIcons;
  
  private String[][] Strategems;
  private ImageFilter[][] stratIcons;
  private String[][] gear;
private ImageFilter[][] gearPho;
  
  //Constructor
  public Story(String[] equipment, ImageFilter[] equipmentIcons, String[] StrategemCategories, ImageFilter[] categoryIcons, String[][] gear, ImageFilter[][] gearPho, String[][] Strategems, ImageFilter[][] stratIcons){
     this.equipment = equipment;
     this.equipmentIcons = equipmentIcons;
     
     this.StrategemCategories = StrategemCategories;
this.categoryIcons = categoryIcons;
     this.gear = gear;
     this.gearPho = gearPho;
     this.Strategems = Strategems;
     this.stratIcons = stratIcons;
   }


 /*
   drawScene() Method calls all the individual methods to render 
    the different sections of the scene, displaying different 
    the info from the arrays
    */
  public void drawScene(){
   drawIntro();
    drawEquipmentIntroScene();
    drawPrimary();
   drawSecondary();
      drawGrenades();
  drawArmor();
   strategemIntro();
   drawCategoryScene();
 drawSupport();
    drawOrbital();
   drawEagle();
   drawSentry();
  fiveHunderedkgBomb();
  }

   /*
    drawIntro() is the introduction and displays the title,
    displays the Helldivers photo
     and starts the background music
    */
public void drawIntro(){
  clear("white");
  drawText("How to play HELLDIVERS 2", 80, 80);
  pause(.5);
  drawImage("helldivers2-1684972836077.jpg", 100, 184, 200);
  // https://www.dropbox.com/scl/fi/h3a2w05pq5bsagf0lz2nu/Helldivers-2-8bit-of-Liber-Tea.mp3?rlkey=wfi5zn8ouqpkg0bqsvtzgill2&e=1&st=4xo36ll2&dl=0 MUSIC CREDIT
  playSound("Helldivers-2---8bit-of-Liber-Tea-(2)-(1).wav");
  pause(1.5);
}


  /*
    This method handles displaying the equipment intro section,
    showing the equipment categories that Hell Divers use 
    and displays images of the categories
    */
public void drawEquipmentIntroScene(){
  clear("white");
  setTextHeight(30);
drawText("HELLDIVER Equipment", 50,40);
  pause(1);
  setTextHeight(20);
  drawText(equipment[0], 40, 75); 
  drawImage(equipmentIcons[0], 40, 100, 150);
  pause(0.5);
  drawText(equipment[1], 40, 260);
  drawImage(equipmentIcons[1], 40, 270, 150 );
  pause(0.5);
   drawText(equipment[2], 260, 75);
  drawImage(equipmentIcons[2], 250, 100, 110 );
pause(0.5);
   drawText(equipment[3], 240, 260);
  drawImage(equipmentIcons[3], 250, 270, 110 );
  pause(1.5);
}
 /*
    drawPrimary() Method shows the primary weapons in the game, (traversing the first row of the gear and gearPho 2d arrays)
    displaying each weapon and its image, applying filters based on the name of the weapon
    */
public void drawPrimary(){
    clear("white");
  setTextHeight(30);
drawText("HELLDIVER PRIMARIES", 50,40);
  pause(1);
  setTextHeight(20);

   // Nested For Loop to display each weapon and Agolrithm to define its corresponding image and location
int x = 0; 
  int y = 0;
    int o = 0; 
  int xx = 0;
  int yy = 0;
  for (int i = 0; i < 1; i++){
    for (int j = 0; j < 4; j++){
     if (o == 0) {
            x = 10;
            y = 75;
       xx = 40;
         yy = 100;
          } else if (o == 1 ){
            x = 40;
            y = 260;
       xx =  40;
           yy= 270;
          } else if (o == 2){
            x = 205;
            y = 200;
       xx = 250;
           yy= 100;
        } 
    else if (o == 3){
      x = 105;
      y = 390;
          xx = 250;
          yy= 270;
    }
        
      drawText(gear[i][j], x, y); 
    drawImage(gearPho[i][j], xx, yy, 150);
      pause(0.5);
      o++;


      
    } 
  }
 /*
 Nested for loop and algorithm to apply contrast and saturate filters
Uses if else Statements to define the location for new filtered images and uses
indexOf method to look for a S in the name of the gear
If -1 is returned it will contrast the image and if not
it will saturate the image
   */
  int p = 0;
 
  for (int i = 0; i < 1; i++){
    for (int j = 0; j < 4; j++){
      String pri = gear[i][j];
    ImageFilter saturate = gearPho[i][j];
      ImageFilter contrast = gearPho[i][j];
  if (p == 0) {
       xx = 40;
         yy = 100;
          } else if (p == 1 ){
       xx =  40;
           yy= 270;
          } else if (p == 2){   
       xx = 250;
           yy= 100;
        } 
    else if (p == 3){
          xx = 250;
          yy= 270;
    }
      if (pri.indexOf("S") == -1 ){
     contrast = gearPho[i][j];
       contrast.adjustContrast(5);
        drawImage(contrast, xx, yy, 150);
  }
      else{
       
        saturate = gearPho[i][j];
    saturate.saturate(5);
    drawImage(saturate, xx, yy, 150);
      }
      p++;
  pause(0.3);

}
  }
  pause(1.5);
}

  /* 
  drawSecondary() Method shows the secondary weapons in the game, (traversing the second row of the gear and gearPho 2d arrays) 
  displaying each weapon and its image, applying filters based on the name of the weapon
  */
  public void drawSecondary(){
    clear("white");
  setTextHeight(30);
drawText("HELLDIVER SECONDARIES", 20,40);
  pause(1);
  setTextHeight(20);
    int x = 0; 
  int y = 0;
    int o = 0; 
  int xx = 0;
  int yy = 0;
  for (int i = 1; i < 2; i++){
    for (int j = 0; j < 4; j++){
     if (o == 0) {
            x = 10;
            y = 75;
       xx = 40;
         yy = 100;
          } else if (o == 1 ){
            x = 40;
            y = 260;
       xx =  40;
           yy= 270;
          } else if (o == 2){
            x = 160;
            y = 200;
       xx = 250;
           yy= 100;
        } 
    else if (o == 3){
      x = 190;
      y = 390;
          xx = 250;
          yy= 270;
    }
        
      drawText(gear[i][j], x, y); 
    
    drawImage(gearPho[i][j], xx, yy, 140);
      pause(0.5);
      o++;
    } 
  }

     /*
 Nested for loop and algorithm to apply mirror and saturate filters
Uses of if else Statements to define the location for new filtered images and uses
indexOf method to look for a S in the name of the gear
If -1 is returned it will saturate the image and if it not
it will mirror the image Vertically
   */
    int p = 0;
 
  for (int i = 1; i < 2; i++){
    for (int j = 0; j < 4; j++){
      String pri = gear[i][j];
    ImageFilter saturate = gearPho[i][j];
      ImageFilter mirror = gearPho[i][j];
  if (p == 0) {
       xx = 40;
         yy = 100;
          } else if (p == 1 ){
       xx =  40;
           yy= 270;
          } else if (p == 2){   
       xx = 250;
           yy= 100;
        } 
    else if (p == 3){
          xx = 250;
          yy= 270;
    }
      if (pri.indexOf("S") == -1 ){
      saturate = gearPho[i][j];
    saturate.saturate(5);
    drawImage(saturate, xx, yy, 150);
  }
      else{
       
        mirror = gearPho[i][j];
    mirror.mirrorVertical();
    drawImage(mirror, xx, yy, 150);
      }
      p++;
  pause(0.3);

}
  }
pause(1.5);
}


  /* 
 drawGrenades() method draws text from the gear 2D array in the 3rd row
  and draws the Image of the gear from the gearPho 2D array 3rd row
  */
  
  public void drawGrenades(){
    clear("white");
  setTextHeight(30);
drawText("HELLDIVER GRENADES", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(gear[2][0], 10, 75); 
  drawImage(gearPho[2][0], 40, 100, 120);
  pause(0.5);
  drawText(gear[2][1], 40, 260);
  drawImage(gearPho[2][1], 40, 270, 120 );
  pause(0.5);
   drawText(gear[2][2], 220 , 75);
  drawImage(gearPho[2][2], 250, 100, 120 );
pause(0.5);
   drawText(gear[2][3], 220, 260);
  drawImage(gearPho[2][3], 250, 270, 120 );
  pause(1.5);
}
 /* 
  drawArmor() draws texts from the gear 2D array in the 4th row
  and draws the Images of the gear from the gearPho 2D array in the 4th row
  */
    public void drawArmor(){
    clear("white");
  setTextHeight(30);
drawText("HELLDIVER ARMOR", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(gear[3][0], 10, 75); 
  drawImage(gearPho[3][0], 40, 100, 120);
  pause(0.5);
  drawText(gear[3][1], 30, 260);
  drawImage(gearPho[3][1], 40, 270, 120 );
  pause(0.5);
   drawText(gear[3][2], 220 , 75);
  drawImage(gearPho[3][2], 250, 100, 120 );
pause(0.5);
   drawText(gear[3][3], 220, 260);
  drawImage(gearPho[3][3], 250, 270, 120 );
  pause(1.5);
}

/*
 strategemIntro() method explains the strategems that are used in the game
  Displays a photo of a Strategem to show User
  */
  public void strategemIntro(){
    clear("white");
    setTextHeight(30); 
    drawText("STRATEGEMS", 110, 40);
      pause(1);
      drawImage(stratIcons[0][0], 130, 100, 150 );
    setTextHeight(15);
    drawText("Stratgems are used to help clear certain or large",50, 265 );
    drawText("amounts of enemies and can range from a variety",50, 285);
    drawText("tools like new weapons and area control strikes",50, 305);
    pause(6.0);
  }

  /* 
 drawCategoryScene() method introduces user to the Strategem categories 
  by drawing text taken from the StretegemCategories array 
  and drawing images taken from the categoryIcons Array by accessing the element there in
  */
  public void drawCategoryScene(){
  clear("white");
  setTextHeight(25);
drawText("4 Types of Strats", 50,40);
  pause(1);
  setTextHeight(20);
  drawText(StrategemCategories[0], 40, 75); 
  drawImage(categoryIcons[0], 40, 100, 150);
  pause(0.5);
  drawText(StrategemCategories[1], 40, 260);
  drawImage(categoryIcons[1], 40, 270, 150 );
  pause(0.5);
   drawText(StrategemCategories[2], 260, 75);
  drawImage(categoryIcons[2], 250, 100, 110 );
pause(0.5);
   drawText(StrategemCategories[3], 240, 260);
  drawImage(categoryIcons[3], 250, 270, 110 );
  pause(1.5);
}

  /* 
 drawSupport() Method shows the Support Stratagems that you could use, (the first row in the Strategems and stratIcons 2d array)
  displays a photo and text of each weapon
  applies filters based on the name of the weapon
  */
  
  public void drawSupport(){
       clear("white");
  setTextHeight(25);
drawText("SUPPORT WEAPONS", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(Strategems[0][0], 10, 75); 
  drawImage(stratIcons[0][0], 40, 100, 120);
  pause(0.5);
  drawText(Strategems[0][1], 30, 260);
  drawImage(stratIcons[0][1], 40, 270, 120 );
  pause(0.5);
   drawText(Strategems[0][2], 220 , 75);
  drawImage(stratIcons[0][2], 250, 100, 120 );
pause(0.5);
   drawText(Strategems[0][3], 220, 260);
  drawImage(stratIcons[0][3], 250, 270, 120 );
  pause(1.5);



    /*
    Nested for loop and algorithm to apply Contrast and mirror filters 
      Uses if else statements to define the location for new filtered images and uses 
      length() method to take the length of the text it is getting and see if it is greater than or equal to 14
      If so the image will be mirrored 
      and if not the image contrast will be multiplied
      */
     int p = 0;
    int xx = 0;
    int yy = 0;
 
  for (int i = 0; i < 1; i++){
    for (int j = 0; j < 4; j++){
      String sup = Strategems[i][j];
    ImageFilter mirr = stratIcons[i][j];
      ImageFilter con = stratIcons[i][j];
  if (p == 0) {
       xx = 40;
         yy = 100;
          } else if (p == 1 ){
       xx =  40;
           yy= 270;
          } else if (p == 2){   
       xx = 250;
           yy= 100;
        } 
    else if (p == 3){
          xx = 250;
          yy= 270;
    }
      if (sup.length() >= 14 ){
      mirr = stratIcons[i][j];
    mirr.mirrorVertical();
    drawImage(mirr, xx, yy, 120);
  }
      else{
       
        con = stratIcons[i][j];
    con.adjustContrast(5);
    drawImage(con, xx, yy, 120);
      }
      p++;
  pause(0.3);

}
  }
pause(1.5);
}



  
  
  /* 
  drawOrbital() Method shows the Orbital stratagems that you could use, (second row of the Stratagems and StratIcons 2d Arrays)
  displays a photo and text of each Orbital 
  applies filters based on the name of the weapon 
  */
  public void drawOrbital(){
       clear("white");
  setTextHeight(25);

    drawText("OBRITALS", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(Strategems[1][0], 10, 75); 
  drawImage(stratIcons[1][0], 40, 100, 120);
  pause(0.5);
  drawText(Strategems[1][1], 10, 260);
  drawImage(stratIcons[1][1], 40, 270, 120 );
  pause(0.5);
   drawText(Strategems[1][2], 220 , 75);
  drawImage(stratIcons[1][2], 250, 100, 120 );
pause(0.5);
   drawText(Strategems[1][3], 270, 260);
  drawImage(stratIcons[1][3], 250, 270, 120 );
  pause(1.5);

    /*
    Nested for loop and algorithm to apply saturation and Contrast
      Uses if-else statements to define the location for newly filtered images and uses
      indexOf method looks for the word Barrage in text and if it returns -1 it will saturate the image
      If not it will Contrast it
      */
          int p = 0;
    int xx = 0;
    int yy = 0;
 
  for (int i = 1; i < 2; i++){
    for (int j = 0; j < 4; j++){
      String sup = Strategems[i][j];
    ImageFilter saturate = stratIcons[i][j];
      ImageFilter con = stratIcons[i][j];
  if (p == 0) {
       xx = 40;
         yy = 100;
          } else if (p == 1 ){
       xx =  40;
           yy= 270;
          } else if (p == 2){   
       xx = 250;
           yy= 100;
        } 
    else if (p == 3){
          xx = 250;
          yy= 270;
    }
      if (sup.indexOf("Barrage") == -1 ){
      saturate = stratIcons[i][j];
    saturate.saturate(5);
    drawImage(saturate, xx, yy, 120);
  }
      else{
       
        con = stratIcons[i][j];
    con.adjustContrast(5);
    drawImage(con, xx, yy, 120);
      }
      p++;
  pause(0.3);

}
  }
pause(1.5);
}
  
   /* 
  drawEagle() method draws text and images from the strats 2d array in the 3rd row
  and draws the Images of the stratagems from the stratIcons 2d Arrayin the 3rd row
  */
  public void drawEagle(){
       clear("white");
  setTextHeight(25);
drawText("EAGLE STRIKES", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(Strategems[2][0], 10, 75); 
  drawImage(stratIcons[2][0], 40, 100, 120);
  pause(0.5);
  drawText(Strategems[2][1], 30, 260);
  drawImage(stratIcons[2][1], 40, 270, 120 );
  pause(0.5);
   drawText(Strategems[2][2], 220 , 75);
  drawImage(stratIcons[2][2], 250, 100, 120 );
pause(0.5);
   drawText(Strategems[2][3], 220, 260);
  drawImage(stratIcons[2][3], 250, 270, 120 );
  pause(1.5);
  }

/*
  drawSentry() method draws text and images from the strats 2d array in the 4th row
  and draws the Images of the stratagems from the stratIcons 2d Arrayin the 4th row
  */
    public void drawSentry(){
       clear("white");
  setTextHeight(25);
drawText("SENTRIES", 20,40);
  pause(1);
  setTextHeight(20);
  drawText(Strategems[3][0], 10, 75); 
  drawImage(stratIcons[3][0], 40, 100, 120);
  pause(0.5);
  drawText(Strategems[3][1], 30, 260);
  drawImage(stratIcons[3][1], 40, 270, 120 );
  pause(0.5);
   drawText(Strategems[3][2], 220 , 75);
  drawImage(stratIcons[3][2], 250, 100, 120 );
pause(0.5);
   drawText(Strategems[3][3], 220, 260);
  drawImage(stratIcons[3][3], 250, 270, 120 );
  pause(4);
  }

  /*
  Shows and example of a 500 kg bomb being used 
  draws an Image of a hell diver marking the drop spot (then plays audio file)
  Then uses a for loop to animate the bomb dropping in and after a pause of 0.9 seconds after the for loop ends 
  the applyExplosionEffect() filter is applied to mimic an explosion
  */
  
  public void fiveHunderedkgBomb(){
    clear("white");
    setTextHeight(20);
    drawText("Example of 500kg bomb being deployed", 5, 40);
    pause(3);
    drawImage("13363-helldiver-salute.png", 20, 170, 120);
    pause(2);
   playSound("(Audio)-20250207-1011-57.4123205.wav");
    pause(4.5);
  drawImage("x-icon-white-25.jpg", 270, 240, 130);
    pause(3.5);
    int x = 0;
        int y = 66;
    for (int count = 0; count < 9; count++){
        drawImage("c372e3116f03a1d0c394997692951ee9.png", x, y, 140);
      
      x += 25;
      y += 13;
      
      pause(0.1);
      clear("white");
    }
    drawImage("c372e3116f03a1d0c394997692951ee9.png", x, y, 140);
    pause (0.9);

ImageFilter explosion = new ImageFilter("6535.png");

    for (int counts = 0; counts < 5; counts++){
    explosion.applyExplosionEffect();
    drawImage(explosion, 0, 0, 1000);
      pause(0.1);
    }
   
  }
}
  










  
