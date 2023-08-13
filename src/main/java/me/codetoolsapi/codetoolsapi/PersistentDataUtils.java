package me.codetoolsapi.codetoolsapi;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PersistentDataUtils {
    public static void addPersistentData(PersistentDataContainer data, String key, Object value) {
        NamespacedKey k = new NamespacedKey(CodeToolsApi.getPlugin(), key);
        if (value instanceof String) {
            data.set(k, PersistentDataType.STRING, (String) value);
        } else if (value instanceof Boolean) {
            data.set(k, PersistentDataType.BOOLEAN, (Boolean) value);
        } else if (value instanceof Double) {
            data.set(k, PersistentDataType.DOUBLE, (Double) value);
        } else if (value instanceof Float) {
            data.set(k, PersistentDataType.FLOAT, (Float) value);
        } else if (value instanceof Integer) {
            data.set(k, PersistentDataType.INTEGER, (Integer) value);
        } else if (value instanceof Long) {
            data.set(k, PersistentDataType.LONG, (Long) value);
        } else if (value instanceof Short) {
            data.set(k, PersistentDataType.SHORT, (Short) value);
        } else if (value instanceof int[]) {
            data.set(k, PersistentDataType.INTEGER_ARRAY, (int[]) value);
        } else if (value instanceof long[]) {
            data.set(k, PersistentDataType.LONG_ARRAY, (long[]) value);
        } else if (value instanceof Byte) {
            data.set(k, PersistentDataType.BYTE, (byte) value);
        } else if (value instanceof byte[]) {
            data.set(k, PersistentDataType.BYTE_ARRAY, (byte[]) value);
        } else if (value instanceof PersistentDataContainer) {
            data.set(k, PersistentDataType.TAG_CONTAINER, (PersistentDataContainer) value);
        } else if (value instanceof PersistentDataContainer[]) {
            data.set(k, PersistentDataType.TAG_CONTAINER_ARRAY, (PersistentDataContainer[]) value);
        }
    }

    public static Object getPersistentData(PersistentDataContainer data, String key) {
        NamespacedKey k = new NamespacedKey(CodeToolsApi.getPlugin(), key);
        if (data.has(k, PersistentDataType.STRING)) {
            return data.get(k, PersistentDataType.STRING);
        } else if (data.has(k, PersistentDataType.BOOLEAN)) {
            return data.get(k, PersistentDataType.BOOLEAN);
        } else if (data.has(k, PersistentDataType.DOUBLE)) {
            return data.get(k, PersistentDataType.DOUBLE);
        } else if (data.has(k, PersistentDataType.FLOAT)) {
            return data.get(k, PersistentDataType.FLOAT);
        } else if (data.has(k, PersistentDataType.INTEGER)) {
            return data.get(k, PersistentDataType.INTEGER);
        } else if (data.has(k, PersistentDataType.LONG)) {
            return data.get(k, PersistentDataType.LONG);
        } else if (data.has(k, PersistentDataType.SHORT)) {
            return data.get(k, PersistentDataType.SHORT);
        } else if (data.has(k, PersistentDataType.INTEGER_ARRAY)) {
            return data.get(k, PersistentDataType.INTEGER_ARRAY);
        } else if (data.has(k, PersistentDataType.LONG_ARRAY)) {
            return data.get(k, PersistentDataType.LONG_ARRAY);
        } else if (data.has(k, PersistentDataType.BYTE)) {
            return data.get(k, PersistentDataType.BYTE);
        } else if (data.has(k, PersistentDataType.BYTE_ARRAY)) {
            return data.get(k, PersistentDataType.BYTE_ARRAY);
        } else if (data.has(k, PersistentDataType.TAG_CONTAINER)) {
            return data.get(k, PersistentDataType.TAG_CONTAINER);
        } else if (data.has(k, PersistentDataType.TAG_CONTAINER_ARRAY)) {
            return data.get(k, PersistentDataType.TAG_CONTAINER_ARRAY);
        } else {
            return null;
        }
    }

    public static void removePersistentData(PersistentDataContainer data, String key) {
        NamespacedKey k = new NamespacedKey(CodeToolsApi.getPlugin(), key);
        if (data.has(k, PersistentDataType.STRING) ||
                data.has(k, PersistentDataType.BOOLEAN) ||
                data.has(k, PersistentDataType.DOUBLE) ||
                data.has(k, PersistentDataType.FLOAT) ||
                data.has(k, PersistentDataType.INTEGER) ||
                data.has(k, PersistentDataType.LONG) ||
                data.has(k, PersistentDataType.SHORT) ||
                data.has(k, PersistentDataType.INTEGER_ARRAY) ||
                data.has(k, PersistentDataType.LONG_ARRAY) ||
                data.has(k, PersistentDataType.BYTE) ||
                data.has(k, PersistentDataType.BYTE_ARRAY) ||
                data.has(k, PersistentDataType.TAG_CONTAINER) ||
                data.has(k, PersistentDataType.TAG_CONTAINER_ARRAY)) {
            data.remove(k);
        }
    }
    public static boolean hasPersistentData(PersistentDataContainer data, String key) {
        NamespacedKey k = new NamespacedKey(CodeToolsApi.getPlugin(), key);
        return data.has(k, PersistentDataType.STRING) ||
                data.has(k, PersistentDataType.BOOLEAN) ||
                data.has(k, PersistentDataType.DOUBLE) ||
                data.has(k, PersistentDataType.FLOAT) ||
                data.has(k, PersistentDataType.INTEGER) ||
                data.has(k, PersistentDataType.LONG) ||
                data.has(k, PersistentDataType.SHORT) ||
                data.has(k, PersistentDataType.INTEGER_ARRAY) ||
                data.has(k, PersistentDataType.LONG_ARRAY) ||
                data.has(k, PersistentDataType.BYTE) ||
                data.has(k, PersistentDataType.BYTE_ARRAY) ||
                data.has(k, PersistentDataType.TAG_CONTAINER) ||
                data.has(k, PersistentDataType.TAG_CONTAINER_ARRAY);
    }
}
