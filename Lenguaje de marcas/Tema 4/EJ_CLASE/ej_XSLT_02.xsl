<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="UTF-8"/>

    <xsl:template match="/ies">
        <!-- Encabezados CSV -->
        <xsl:text>Nombre del ciclo,Grado,Año del título,Aforo alumnado&#10;</xsl:text>

        <!-- Iterar sobre los ciclos -->
        <xsl:apply-templates select="ciclos/ciclo"/>
    </xsl:template>

    <xsl:template match="ciclo">
        <!-- Datos en formato CSV -->
        <xsl:value-of select="nombre"/><xsl:text>,</xsl:text>
        <xsl:value-of select="grado"/><xsl:text>,</xsl:text>
        <xsl:value-of select="decretoTitulo/@año"/><xsl:text>,</xsl:text>
        <xsl:value-of select="aforoalumnado"/><xsl:text>&#10;</xsl:text>
    </xsl:template>
</xsl:stylesheet>