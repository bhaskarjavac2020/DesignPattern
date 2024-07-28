package com.design.strategy.parser.imple;

import com.design.strategy.parser.FileParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
@Slf4j
@Service
public class CsvParser implements FileParser {
    @Override
    public void parse(File file) {
        log.info("Parsing CSV file");
    }
}
