<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/hobbies">
        <html>
            <head>
                <title>Catalog of Hobbies</title>
            </head>
            <body>
                <h1>Catalog of Hobbies</h1>
                <xsl:apply-templates select="hobby"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="hobby">
        <div class="hobby">
            <h2><xsl:value-of select="name"/></h2>
            <p><xsl:value-of select="description"/></p>
            <p>Popularity: <xsl:value-of select="popularity"/></p>
            <xsl:if test="@difficulty">
                <p>Difficulty: <xsl:value-of select="@difficulty"/></p>
            </xsl:if>
        </div>
    </xsl:template>

</xsl:stylesheet>