module foo {
    exports xlib;
    // requires bar;
    requires transitive bar;
}
