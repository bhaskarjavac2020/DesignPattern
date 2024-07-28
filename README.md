StrategyDesignPattern using springboot
If we have to support more file types, we just have to create new classes like SqliteFileParser and ParquetFileParser which implements the FileParser interface. As a result, multiple developers implementing these new file parsers will avoid any merge conflicts later.

The existing file parsers remain untouched thereby reducing any chances of breaking existing functionality.

Additionally our code now aligns with SOLID principles particularly our beloved Open/Closed principle. By encapsulating the file parsing implementations into separate classes, we can extend the system with new parsing strategies without modifying the existing code. This makes our system more adaptable to future requirements and easier to maintain.
