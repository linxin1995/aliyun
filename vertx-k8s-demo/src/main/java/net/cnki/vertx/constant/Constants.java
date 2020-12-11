package net.cnki.vertx.constant;

public final class Constants {
  private Constants() {}
  /** API Route */
  public static final String API_GET = "/todos/:todoId";
  public static final String API_LIST_ALL = "/todos";
  public static final String API_CREATE = "/todos";
  public static final String API_UPDATE = "/todos/:todoId";
  public static final String API_DELETE = "/todos/:todoId";
  public static final String API_DELETE_ALL = "/todos";

  public static final String REDIS_TODO_KEY = "VERT_TODO";
}
