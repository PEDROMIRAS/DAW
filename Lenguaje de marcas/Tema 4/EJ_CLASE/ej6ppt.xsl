<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
    <html>
        <table version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
            <tr>
                <th>Posicion</th>
                <th>País</th>
                <th>Lista de idiomas</th>
                <th>Lugar</th>
            </tr>
            <xsl:for-each-group select="idiomas/idioma" group-by="@pais">
                <tr>
                    <td>
                        <xsl:value-of select="position()"/>
                    </td>
                    <td>
                        <xsl:value-of select="@pais"/>
                    </td>
                    <td>
                        <xsl:value-of select="current-group()/@nombre" separator=", "/>
                    </td>
                    <td>
                        <xsl:value-of select="sum(current-group()/@poblacion)"/>
                    </td>
                </tr>
            </xsl:for-each-group>
        </table>
    </html>
    </xsl:template>
</xsl:stylesheet>