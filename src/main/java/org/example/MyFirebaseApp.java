package org.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyFirebaseApp {

    public static void main(String[] args) throws IOException {
        String pathToServiceAccountKey = "./smart-blumentopf-firebase-adminsdk-2h0p8-e43c01cc82.json";

        FileInputStream serviceAccount = new FileInputStream(pathToServiceAccountKey);
        GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(credentials)
                .setDatabaseUrl("https://smart-blumentopf-default-rtdb.europe-west1.firebasedatabase.app") // Replace with your project's database URL
                .build();

        FirebaseApp.initializeApp(options);

        System.out.println("Firebase initialized successfully!");

        //try adding data
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("server/saving-data/fireblog");

        DatabaseReference flowerpotRef = ref.child("flowerpots");

        // Use unique keys for each Flowerpot
        flowerpotRef.child("1").setValueAsync(new Flowerpot(1, 2, 3));
        flowerpotRef.child("2").setValueAsync(new Flowerpot(2, 2, 3));
    }

}
