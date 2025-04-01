<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="stock">
        <html>
            <body>
                <!--Nombres de productos en aula C14 -->
                <h3>Productos en aula C14</h3>
                <xsl:for-each select="producto">
                    <xsl:if test="lugar/aula='C14'">
                        <p>
                            Nombre: <xsl:value-of select="nombre"/>
                        </p>
                    </xsl:if>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>