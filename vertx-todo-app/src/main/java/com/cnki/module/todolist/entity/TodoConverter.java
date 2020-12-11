package com.cnki.module.todolist.entity;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link com.cnki.module.todolist.entity.Todo}.
 * NOTE: This class has been automatically generated from the {@link com.cnki.module.todolist.entity.Todo} original class using Vert.x codegen.
 */
public class TodoConverter {


  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Todo obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "completed":
          if (member.getValue() instanceof Boolean) {
            obj.setCompleted((Boolean)member.getValue());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).intValue());
          }
          break;
        case "order":
          if (member.getValue() instanceof Number) {
            obj.setOrder(((Number)member.getValue()).intValue());
          }
          break;
        case "title":
          if (member.getValue() instanceof String) {
            obj.setTitle((String)member.getValue());
          }
          break;
        case "url":
          if (member.getValue() instanceof String) {
            obj.setUrl((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(Todo obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(Todo obj, java.util.Map<String, Object> json) {
    if (obj.isCompleted() != null) {
      json.put("completed", obj.isCompleted());
    }
    json.put("id", obj.getId());
    if (obj.getOrder() != null) {
      json.put("order", obj.getOrder());
    }
    if (obj.getTitle() != null) {
      json.put("title", obj.getTitle());
    }
    if (obj.getUrl() != null) {
      json.put("url", obj.getUrl());
    }
  }
}
