package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> result = new HashMap<>();
        for(int i = 0;i < items.size(); i++){
            if (result.get(items.get(i)) != null) {
                result.put(items.get(i), result.get(items.get(i) +1 ));
            }
            else {
                result.put(items.get(i), 1);
            }
        }
        return result;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for(int i = 0;i < items.size(); i++){
            if (inventory.get(items.get(i)) == null) {
                inventory.put(items.get(i), 1);
            }
            else {
                inventory.put(items.get(i), inventory.get(items.get(i)) + 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for(int i = 0;i < items.size(); i++){
            if (inventory.get(items.get(i)) != null && inventory.get(items.get(i)) > 0) {
                inventory.put(items.get(i), inventory.get(items.get(i)) - 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        return null;
    }
}
