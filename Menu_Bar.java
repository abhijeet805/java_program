import java.awt.*;
import java.awt.event.*;
/**
 * Menu_Bar
 */
public class Menu_Bar extends Frame
{

     MenuBar mb;
     Menu File,Edit,Font,Run,Help,saveas;
     MenuItem open,ne,save,cut,copy,paste,selectall,size,contact,color,debug,ppt,doc,pdf;

     Menu_Bar()
     {
          setVisible(true);
          setSize(500, 500);
          
          mb=new MenuBar();

          File=new Menu("File");
          Edit=new Menu("Edit");
          Font=new Menu("Font");
          Run=new Menu("Run");
          Help=new Menu("Help");
          saveas=new Menu("Saveas");

          open=new MenuItem("Open");
          save=new MenuItem("Save");
          cut=new MenuItem("cut");
          copy=new MenuItem("Copy");
          paste=new MenuItem("Paste");
          selectall=new MenuItem("Selec All");
          size=new MenuItem("Size");
          color=new MenuItem("Color");
          contact=new MenuItem("Contact");
          debug=new MenuItem("Debug");
          ne=new MenuItem("New ");
          ppt=new MenuItem(".ppt");
          pdf=new MenuItem(".pdf");
          doc=new MenuItem(".doc");

          mb.add(File);
          mb.add(Edit);
          mb.add(Run);
          mb.add(Font);
          mb.add(Help);
          
          File.add(open);
          File.add(save);
          File.add(saveas);

          Edit.add(cut);
          Edit.add(copy);
          Edit.add(paste);
          Edit.add(selectall);
          
          Run.add(debug);

          Font.add(size);
          Font.add(color);

          Help.add(contact);

          saveas.add(ppt);
          saveas.add(pdf);
          saveas.add(doc);

        setMenuBar(mb);
     }
     public static void main(String[] args) {
          new Menu_Bar();
     }
}