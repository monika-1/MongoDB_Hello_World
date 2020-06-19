import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
public class ListOfCollection {

    public static void main( String args[] ) {

        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );
        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDb",
                "password".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("myDb");

//        System.out.println("Collection created successfully");

        for (String name : database.listCollectionNames()) {
            System.out.println(name);
        }
    }

    public int findMaxLength(int[] nums) {
        int ones = 0;
        int zeroes = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) zeroes++;
            else ones++;
        }

        return 2 * Math.min(ones, zeroes);
    }
} 