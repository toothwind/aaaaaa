package com.ayay25001.openmap;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class MainActivity extends Activity {

    private NotificationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
//        getSharedPreferences();123
//        PreferenceManager.getDefaultSharedPreferences(this);

        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

    }

    public void test(View view) {
//        FileOutputStream fileOutputStream = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileOutputStream = openFileOutput("test1.txt", MODE_PRIVATE);
//            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
//            bufferedWriter.write("123465789");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (bufferedWriter != null) {
//                try {
//                    bufferedWriter.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//
//        Intent intent = new Intent(Intent.ACTION_CALL);
//        intent.setData(Uri.parse("tel:10010"));
////        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
////            // TODO: Consider calling
////            //    ActivityCompat#requestPermissions
////            // here to request the missing permissions, and then overriding
////            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
////            //                                          int[] grantResults)
////            // to handle the case where the user grants the permission. See the documentation
////            // for ActivityCompat#requestPermissions for more details.
////            return;
////        }
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//            Log.d("MainActivity", "还没获取权限,取申请");
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 10086);
//        } else {
//            Log.d("MainActivity", "已经获取了权限");
//            startActivity(intent);
//        }

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, Main2Activity.class), 0);

        Notification notification = new NotificationCompat.Builder(this)
                .setContentTitle("啊啊啊啊title")
                .setContentText("呜呜呜呜内容")
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_delete))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
//                .setSound(Uri.fromFile(new File("/system/media/audio/ringtones/Leisure_time.ogg")))
//                .setVibrate(new long[]{0,1000,1000,1000})
//                .setLights(Color.GREEN,1000,1000)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .build();
        manager.notify(1, notification);

    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == 10086) {
//            if (permissions.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Log.d("MainActivity", "获取了权限..");
//            } else {
//                Log.d("MainActivity", "拒绝了权限申请");
//            }
//
//
//        }
//    }

    public void judge(View view) {
//        StringBuffer sb = new StringBuffer("");
//        BufferedReader bufferedReader = null;
//        try {
//            FileInputStream fileInputStream = openFileInput("test1.txt");
//            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//            String line = "";
//            while (((line = bufferedReader.readLine()) != null)) {
//                sb.append(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (bufferedReader != null) {
//                try {
//                    bufferedReader.close();
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
//            }
//        }
//        Toast.makeText(this, sb.toString(), Toast.LENGTH_SHORT).show();

        manager.cancel(1);
    }

    public void openCamera(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }

    public void 下载(View view) {
        startActivity(new Intent(this, DownloadActivity.class));
    }

}
