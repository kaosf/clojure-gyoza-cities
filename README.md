# gyoza

Gyoza-Cities

## Versions

* Ubuntu: 13.04 amd64
* Oracle: JDK 6
* Clojure: 1.5.1
* Leiningen: 2.2.0

## Usage

```sh
lein deps # for depencencies installation
lein repl
```

```clojure
(use 'gyoza.core) ;-> nil
(gyoza-cities) ;-> (("Hamamatsu-shi" 4059.0) ("Utsunomiya-shi" 3624.0) ("Kyoto-shi" 2529.0) ("Shizuoka-shi" 2052.0) ("Otsu-shi" 1976.0))
```

## References

* [tnoda-clojure &bull; 餃子がたくさん売れるところを探す．](http://tnoda-clojure.tumblr.com/post/47473997856/searching-gyoza-town-in-japan)

## License

[MIT](http://opensource.org/licenses/MIT)
