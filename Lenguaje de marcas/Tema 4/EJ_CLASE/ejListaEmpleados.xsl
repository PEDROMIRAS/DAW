<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
    <body> 
        <h3>Lista Empleados</h3>
        <xsl:apply-templates select="//empleado">
        <xsl:sort select="salario" order="descending"/>
    </xsl:apply-templates>
    </body>
    </xsl:template>
    <xsl:template match="empleado">
            <p>
                <xsl:text>Nombre: </xsl:text>
                <xsl:value-of select="nombre"/>
            </p>
            <p> 
                <xsl:text>Salario:</xsl:text>
                <xsl:value-of select="salario"/>
            </p>
    </xsl:template>
</xsl:stylesheet>