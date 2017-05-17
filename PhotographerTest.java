import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{
  
  //variables declared here!
  Photographer photographer;
  Camera camera;

  @Before 
  public void before() {
    photographer = new Photographer();
    camera = new Camera(); 
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameras());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(camera);
    boolean actual = photographer.removeCamera(camera);
    assertEquals(true, actual);
    assertEquals(0, photographer.cameras());
  }

  @Test
  public void canPrintAllCameras(){
    DigitalCamera digitalCamera = new DigitalCamera();
    AnalogCamera analogCamera = new AnalogCamera();
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    assertEquals("I am digital deets\n"+"I am analog deets\n", photographer.printAllCameras());
  }
}
