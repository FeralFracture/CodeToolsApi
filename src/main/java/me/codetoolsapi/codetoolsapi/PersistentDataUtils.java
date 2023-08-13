package me.codetoolsapi.codetoolsapi;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class PersistentDataUtils {
    public static void addPersistentStringData(ItemMeta meta, String key, Object value) {
        if (value instanceof String) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.STRING, (String) value);
        } else if (value instanceof Boolean) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BOOLEAN, (Boolean) value);
        } else if (value instanceof Double) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.DOUBLE, (Double) value);
        } else if (value instanceof Float) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.FLOAT, (Float) value);
        } else if (value instanceof Integer) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER, (Integer) value);
        } else if (value instanceof Long) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG, (Long) value);
        } else if (value instanceof Short) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.SHORT, (Short) value);
        } else if (value instanceof int[]) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER_ARRAY, (int[]) value);
        } else if (value instanceof long[]) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG_ARRAY, (long[]) value);
        } else if (value instanceof Byte) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE, (byte) value);
        } else if (value instanceof byte[]) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE_ARRAY, (byte[]) value);
        } else if (value instanceof PersistentDataContainer) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER, (PersistentDataContainer) value);
        } else if (value instanceof PersistentDataContainer[]) {
            meta.getPersistentDataContainer().set(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER_ARRAY, (PersistentDataContainer[]) value);
        }
    }

    public static Object getPersistentStringData(ItemMeta meta, String key) {
        if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.STRING) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.STRING);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BOOLEAN) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BOOLEAN);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.DOUBLE) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.DOUBLE);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.FLOAT) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.FLOAT);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.SHORT) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.SHORT);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER_ARRAY) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.INTEGER_ARRAY);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG_ARRAY) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.LONG_ARRAY);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE_ARRAY) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.BYTE_ARRAY);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER);
        } else if (meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER_ARRAY) != null) {
            return meta.getPersistentDataContainer().get(new NamespacedKey(CodeToolsApi.getPlugin(), key), PersistentDataType.TAG_CONTAINER_ARRAY);
        } else {
            return null;
        }
    }
}
