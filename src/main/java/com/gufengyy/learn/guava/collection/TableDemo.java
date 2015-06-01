package com.gufengyy.learn.guava.collection;

import java.util.Map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TableDemo {
    public static void main(String[] args) {
        Table<Integer, Integer, String> table = HashBasedTable.create();
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 5; column++) {
                table.put(row, column, "(" + row + "," + column + ")");
            }
        }
        
        for(int row = 0; row<table.rowMap().size();row++){
            Map<Integer, String> data = table.row(row);
            for(int col=0;col<data.size();col++){
                System.out.print("cell(" + row + "," + col + "):" + data.get(col));
            }
            System.out.println();
        }
    }
}
