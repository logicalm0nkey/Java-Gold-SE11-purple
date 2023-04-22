// foo モジュールの宣言
module foo {
    exports xlib;
    // java.base は全てのモジュールに暗黙に含まれるので宣言しないでもよい
    requires java.base;
}
