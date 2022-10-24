package com.github.ng_labo;

import com.maxmind.db.Reader;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

public class Lookup {
    final File mmdb;

    public Lookup(String pathToMmdb) {
        this.mmdb = new File(pathToMmdb);
    }

    public Map call(String host) throws IOException {
        try (Reader reader = new Reader(mmdb)) {
            InetAddress address = InetAddress.getByName(host);
            return reader.get(address, Map.class);
        }
    }
}
