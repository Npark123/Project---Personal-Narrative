import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  //Defines an array of equipment categories 
 String[] equipment = {"Primary Weapon", "Secondary Weapon", "Armor", "Throwables" };
    // Creates image filters for equipmentIcons
  ImageFilter[] equipmentIcons = { new ImageFilter("Primary.jpg"), new ImageFilter("Secondary.png"), new ImageFilter("Armor.png"), new ImageFilter("Throwable.png")};

     // Defines an array of strategem categories
    String[] StrategemCategories = {"Support Weapons", "Orbital Cannons", "Eagle Strikes", "Sentries"}; 
        // Creates image filters for categoryIcons
    ImageFilter[] categoryIcons = {new ImageFilter("Support.png"), new ImageFilter("Orbital.png"), new ImageFilter("Eagle.png"), new ImageFilter("Sentry.png")};
 
 // Defines a 2D array for the strategems
    String[][] Strategems =  {{"MG-43 Machine Gun", "Recoilless Rifle", "Quasar Cannon", "Arc Thrower"},
                            {"Orbital Precision Strike", "Orbital 120mm HE Barrage", "Orbital Napalm Barrage", "Orbital Laser"},
                            {"Eagle Strafing Run", "Eagle AirStrike", "Eagle Napalm Strike", "Eagle 500KG Bomb"},
                            {"Machine Gun Sentry", "Autocannon Sentry", "Rocket Sentry", "Flame Sentry"},
                           };
 // Create image filters for the stratagem icons
    ImageFilter[][] stratIcons = {
    {new ImageFilter("Support.png"), new ImageFilter("Recoil.png"), new ImageFilter("Quasar.png"), new ImageFilter("Arc.png")},
   {new ImageFilter("Orbital.png"), new ImageFilter("120.png"), new ImageFilter("OrbNa.png"), new ImageFilter("Orblaser.png")},
    {new ImageFilter("Eaglest.png"), new ImageFilter("Eagle.png"), new ImageFilter("Eaglena.png"), new ImageFilter("Eagle500.png")},
    {new ImageFilter("Sentry.png"), new ImageFilter("Autosen.png"), new ImageFilter("RockSen.png"), new ImageFilter("Flamesen.png")},
    };
  
 

     // Define an 2D array of gear options 
  String[][] gear = {{"AR-23 LIBERATOR", "StA-11 SMG", "SG-225IE BREAKER", "CB-9 EXPLODING CROSSBOW"},
                        {"P-2 PEACEMAKER", "P-4 SENATOR", "GP-31 GRENADE PISTOL", "CQC-19 STUN LANCE"},
                        {"G-6 FRAG", "G-10 INCENDIARY", "G-16 IMPACT", "G-123 THERMITE" },
                     {"DP-00 TACTICAL", "TR-117 COMMANDER", "SC-34 INFILTRATOR", "FS-05 MARKSMAN"},
                       };
    

    // Create image filters for the gear photos that are for each gear item
ImageFilter[][] gearPho = {
    {new ImageFilter("Primary.jpg"), new ImageFilter("smg.png"), new ImageFilter("breaker.png"), new ImageFilter("cross.png")},
   {new ImageFilter("Secondary.png"), new ImageFilter("Sen.png"), new ImageFilter("grepistol.png"), new ImageFilter("Stun.png")},
    {new ImageFilter("Throwable.png"), new ImageFilter("Incen.png"), new ImageFilter("Impact.png"), new ImageFilter("Thermite.png")},
    {new ImageFilter("Armor.png"), new ImageFilter("Commander.png"), new ImageFilter("Infiltrator.png"), new ImageFilter("Marksman.png")},
    };

    //Initializes the Sotyr object with all defined variables/arrays
Story scene = new Story (equipment, equipmentIcons, StrategemCategories, categoryIcons, gear, gearPho, Strategems, stratIcons);
    // Draw the scene based on the Story class
    scene.drawScene();
    //Play the Scene in the Theater
    Theater.playScenes(scene);
  }
}