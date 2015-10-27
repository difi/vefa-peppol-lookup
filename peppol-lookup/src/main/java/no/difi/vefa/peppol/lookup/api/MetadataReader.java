package no.difi.vefa.peppol.lookup.api;

import no.difi.vefa.peppol.common.model.DocumentIdentifier;
import no.difi.vefa.peppol.common.model.ServiceMetadata;
import no.difi.vefa.peppol.security.api.PeppolSecurityException;

import java.util.List;

public interface MetadataReader {

    List<DocumentIdentifier> parseDocumentIdentifiers(FetcherResponse fetcherResponse) throws LookupException;

    ServiceMetadata parseServiceMetadata(FetcherResponse fetcherResponse) throws LookupException, PeppolSecurityException;

}
