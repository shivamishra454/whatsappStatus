package com.example.dpandstatus.latestdp;


import android.content.res.AssetManager;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.dpandstatus.categorie.Database;
import com.example.dpandstatus.R;

import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class LatestDpFragment extends Fragment {
    private static final int CELL_COUNT =1 ;
    ArrayList<String> list=new ArrayList<>();
    RecyclerView recyclerView;
    SwipeRefreshLayout mSwipeRefreshLayout;

    public LatestDpFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate( R.layout.fragment_latest_dp, container, false );

       // readFiles();


       recyclerView = view.findViewById(R.id.recyclerview);
        int numberOfColumns = 3;

        setDataInRecycler( (new  Database()).getLatestDp());
        return view;
    }
    private void readFiles() {


        AsyncTask.execute( new Runnable() {
            @Override
            public void run() {
                try {
                    InputStream myInput;
                    AssetManager assetManager = getContext().getAssets();
                    myInput = assetManager.open("sad.xlsx");
                    // InputStream intStream = getContentResolver().openInputStream(fileUri);
                    Log.e("tag", myInput.toString());
                    XSSFWorkbook workBook = new XSSFWorkbook(myInput);
                    XSSFSheet sheet = workBook.getSheetAt(0);
                    FormulaEvaluator formulaEvaluator = workBook.getCreationHelper().createFormulaEvaluator();
                    int rowCount = sheet.getPhysicalNumberOfRows();
                    Log.e("Tah", "row count "+String.valueOf( rowCount ) );
                    if (rowCount > 0) {
                        for (int r = 0; r < rowCount; r++) {
                            Row row = sheet.getRow(r);
                            if (row.getPhysicalNumberOfCells() == CELL_COUNT) {

                                String link = row.getCell(0).getStringCellValue();
                                Log.e("Tah", link);
                                list.add( getCorrectUrl(link) );


                            } else {
                                final int finalR1 = r;
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                      //  loadingText.setText("Loading....");
                                        //loadingDialog.dismiss();
                                      //  Toast.makeText(MainActivity.this, "Row No " + (finalR1 + 1) + " has incorrect data!", Toast.LENGTH_SHORT).show();
                                    }
                                });

                                return;
                            }

                            //setDataInRecycler(list);

                        }
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                             //   loadingText.setText("Done....");
                               // loadingDialog.dismiss();
                                //Toast.makeText(MainActivity.this, "Row No " + (finalR1 + 1) + " has incorrect data!", Toast.LENGTH_SHORT).show();
                            }
                        });

                    } else {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                               // loadingText.setText("Loading....");
                               // loadingDialog.dismiss();
                                //Toast.makeText(MainActivity.this, "File is Empty!", Toast.LENGTH_SHORT).show();
                            }
                        });


                    }
                } catch (final IOException e) {
                    e.printStackTrace();
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                          //  loadingText.setText("Loading....");
                          //  loadingDialog.dismiss();
                           // Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();



                        }
                    });

                }
            }
        });
    }

    private void setDataInRecycler(ArrayList<String> list1) {

                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                LatestDpAdapter adapter= new LatestDpAdapter(  list1, getContext() );

                int resId = R.anim.layout_animation_fall_down;
                LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);
                recyclerView.setLayoutAnimation(animation);

                recyclerView.setAdapter( adapter );


    }

   private String getCorrectUrl(String url){
   String driveLink = "https://drive.google.com/uc?export=download&id=";
   String[] urlCode = url.split( "/"  );

        return driveLink + urlCode[5];
    }
}