package ua.nix.akolovych.api;

public interface Shop<T> {
    void add(T good);
    T getById(String id);
    void update(T good);
    T delete(String id);
}
