package com.example.a4devicescontrol;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class DeviceActivity extends AppCompatActivity {
    TextView txtDate, txtTime;
    DatabaseReference myData = FirebaseDatabase.getInstance().getReference();
    LinearLayout device1, device2, device3, device4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        findView();
        setDateAndTime();
        device1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DeviceActivity.this);
                dialog.setContentView(R.layout.dialog_device);
                final RadioButton rbLevel0, rbLevel1, rbLevel2, rbLevel3, rbLevel4 ;
                rbLevel0 = dialog.findViewById(R.id.RadioButtonLevel0ControlPower);
                rbLevel1 = dialog.findViewById(R.id.RadioButtonLevel1ControlPower);
                TextView text = dialog.findViewById(R.id.text);
                text.setText("Device 1");
                myData.child("DR1").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        switch (Objects.requireNonNull(dataSnapshot.getValue()).toString()) {
                            case "0": {
                                rbLevel0.setChecked(true);
                                break;
                            }
                            case "1": {
                                rbLevel1.setChecked(true);
                                break;
                            }

                            default:break;
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                rbLevel0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR1").setValue(0);
                    }
                });
                rbLevel1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR1").setValue(1);
                    }
                });
                dialog.show();
            }
        });
        device2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DeviceActivity.this);
                dialog.setContentView(R.layout.dialog_device);
                final RadioButton rbLevel0, rbLevel1, rbLevel2, rbLevel3, rbLevel4 ;
                rbLevel0 = dialog.findViewById(R.id.RadioButtonLevel0ControlPower);
                rbLevel1 = dialog.findViewById(R.id.RadioButtonLevel1ControlPower);
                TextView text = dialog.findViewById(R.id.text);
                text.setText("Device 2");
                myData.child("DR2").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        switch (Objects.requireNonNull(dataSnapshot.getValue()).toString()) {
                            case "0": {
                                rbLevel0.setChecked(true);
                                break;
                            }
                            case "1": {
                                rbLevel1.setChecked(true);
                                break;
                            }

                            default:break;
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                rbLevel0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR2").setValue(0);
                    }
                });
                rbLevel1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR2").setValue(1);
                    }
                });
                dialog.show();
            }
        });
        device3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DeviceActivity.this);
                dialog.setContentView(R.layout.dialog_device);
                final RadioButton rbLevel0, rbLevel1, rbLevel2, rbLevel3, rbLevel4 ;
                rbLevel0 = dialog.findViewById(R.id.RadioButtonLevel0ControlPower);
                rbLevel1 = dialog.findViewById(R.id.RadioButtonLevel1ControlPower);
                TextView text = dialog.findViewById(R.id.text);
                text.setText("Device 3");
                myData.child("DR3").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        switch (Objects.requireNonNull(dataSnapshot.getValue()).toString()) {
                            case "0": {
                                rbLevel0.setChecked(true);
                                break;
                            }
                            case "1": {
                                rbLevel1.setChecked(true);
                                break;
                            }

                            default:break;
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                rbLevel0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR3").setValue(0);
                    }
                });
                rbLevel1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR3").setValue(1);
                    }
                });

                dialog.show();
            }
        });
        device4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(DeviceActivity.this);
                dialog.setContentView(R.layout.dialog_device);
                final RadioButton rbLevel0, rbLevel1, rbLevel2, rbLevel3, rbLevel4 ;
                rbLevel0 = dialog.findViewById(R.id.RadioButtonLevel0ControlPower);
                rbLevel1 = dialog.findViewById(R.id.RadioButtonLevel1ControlPower);

                TextView text = dialog.findViewById(R.id.text);
                text.setText("Device 4");
                myData.child("DR4").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        switch (Objects.requireNonNull(dataSnapshot.getValue()).toString()) {
                            case "0": {
                                rbLevel0.setChecked(true);
                                break;
                            }
                            case "1": {
                                rbLevel1.setChecked(true);
                                break;
                            }
                            default:break;
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                rbLevel0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR4").setValue(0);
                    }
                });
                rbLevel1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myData.child("DR4").setValue(1);
                    }
                });
                dialog.show();
            }
        });
    }
    private void setDateAndTime() {
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        txtDate.setText(currentDate);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        String curentTime = format.format(calendar.getTime());
        txtTime.setText(curentTime);
    }
    private void findView() {
        txtDate = findViewById(R.id.textDate);
        txtTime = findViewById(R.id.textTime);
        device1 = findViewById(R.id.device1);
        device2 = findViewById(R.id.device2);
        device3 = findViewById(R.id.device3);
        device4 = findViewById(R.id.device4);

    }
}
