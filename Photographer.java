import java.util.*;

public class Photographer {

  private ArrayList<Camera> cameraList;
  private HashMap <String, Integer> photos;

  public Photographer() {
    cameraList = new ArrayList<Camera>();
    photos = new HashMap <> ();
  }

  public void addCamera(Camera camera){
    cameraList.add(camera);
  }

  public int cameras(){
    return cameraList.size();
  }

  public boolean removeCamera(Camera camera) {
    return cameraList.remove(camera);
  }

  public String printAllCameras(){
    String result = "";
    for (int i=0; i< cameraList.size(); i++){
      result += ((Printable)cameraList.get(i)).printDetails()+'\n';
    }
    return result;
  }

  public void addPhotos(String date, Integer numberOfPhotos){
    photos.put(date, numberOfPhotos);
  }

  public Integer getPhotos(String date){
    return photos.get(date);
  }


}