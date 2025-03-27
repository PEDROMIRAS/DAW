<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="estudiante">
        <xsl:if test="calificacion >= 80">
            <p>
                <xsl:value-of select="nombre"/>
                <xsl:text> ha aprobado con </xsl:text>
                <xsl:value-of select="calificacion"/>
                <xsl:text> puntos.</xsl:text>
            </p>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>
