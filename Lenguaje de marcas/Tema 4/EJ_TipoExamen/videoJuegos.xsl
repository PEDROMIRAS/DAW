<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/video_games">
        <html>
            <head>
                <title>Catalog of Vintage Video Games</title>
            </head>
            <body>
                <h1>Catalog of Vintage Video Games</h1>
                <xsl:apply-templates select="game"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="game">
        <div class="game">
            <h2><xsl:value-of select="name"/></h2>
            <p><xsl:value-of select="description"/></p>
            <p>Platform: <xsl:value-of select="platform"/></p>
        </div>
    </xsl:template>

</xsl:stylesheet>