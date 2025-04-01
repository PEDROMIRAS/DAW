<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/stock">
        <html>
            <body>
                <h3>Productos en edificio A</h3>
                <table border="1">
                    <tr>
                        <th>Nombre</th>
                        <th>Peso (g)</th>
                    </tr>
                    <xsl:apply-templates select="producto[lugar/@edificio='A' and ((peso/@unidad='g' and peso &lt; 2000) or (peso/@unidad='kg' and peso &lt; 2))]"/>
                </table>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="producto">
        <tr>
            <td>
                <xsl:value-of select="nombre"/>
            </td>
            <td>
                <xsl:value-of select="peso"/>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>