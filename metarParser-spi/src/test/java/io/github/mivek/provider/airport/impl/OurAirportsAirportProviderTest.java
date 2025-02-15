package io.github.mivek.provider.airport.impl;

import io.github.mivek.model.Airport;
import io.github.mivek.provider.airport.AirportProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author mivek
 */
@Disabled
class OurAirportsAirportProviderTest {

    @Test
    void testGetAirport() throws IOException, URISyntaxException, InterruptedException {
        AirportProvider provider = new OurAirportsAirportProvider();

        Map<String, Airport> airports = provider.getAirports();

        assertThat(airports, not(anEmptyMap()));
        assertThat(airports, hasKey("LFPG"));
        assertNotNull(airports.get("LFPG"));
    }
}
