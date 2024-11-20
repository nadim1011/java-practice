import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class game {
    public static void main(String[] args) {
      

        try {
            File inputFile = new File("inp.txt");
            Scanner fileScanner = new Scanner(inputFile);
            Scanner scanner = new Scanner(System.in);
            
            int point=0;
            System.out.println("Enter your name:");
            String name= scanner.next();
            System.out.println("Welcome "+name+"\nSelect the level you want to play..");
            System.out.println("1 for easy\n2 for medium\n3 for hard");
            System.out.println("Enter 1 or 2 or 3:");
            int lev= scanner.nextInt();
            //System.out.println(lev);

             int nQ=0;
             if(lev==1)
              nQ=10;
            else if(lev==2)
              nQ=15;
            else
              nQ=20;

            int ind=0;


            while (fileScanner.hasNextLine()) {
              ind++;
              if(ind-1==nQ)
                break;

                String line = fileScanner.nextLine();
                String str=line;
                int a,b;
                int y=line.charAt(0)-'0';
                int x=line.charAt(1)-'0';
                a=y*10+x;
                int n=line.charAt(5)-'0';
                int m=line.charAt(6)-'0';
                b=n*10+m;

                int ans=0;
                char s=line.charAt(3);
                if(s=='+')
                  ans=a+b;
                else if(s=='-')
                  ans=a-b;
                else if(s=='*')
                  ans=a*b;
                else
                  ans=a/b;

                
                
                System.out.println(str);
                int uans = scanner.nextInt();
                if(uans==ans)
                  point++;

                //System.out.println(str);
                //System.out.println();
            }
            System.out.println(point);
            String fileName = "result.txt";
            try {
           
            PrintWriter writer = new PrintWriter(fileName);
            writer.write(name+" "+lev+" "+point+"\n");
            writer.close();

                }
                catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
           

            // Close the scanner
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
    }
}
