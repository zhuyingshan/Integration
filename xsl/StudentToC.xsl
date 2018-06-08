<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="Students">
	    <xsl:apply-templates/>
		<Students>
		    <xsl:for-each select="commercestudent">
			    <commercestudent>
				    <xsl:choose>
					    <xsl:when test="major='commerce'">
						     <sno>
							     <xsl:value-of select="id"/>
							 </sno>
							 <snm>
							     <xsl:value-of select="name"/>
							 </snm> 
							 <sde>
					             <xsl:value-of select="major"/>
							 </sde>
					    </xsl:when>
					</xsl:choose>
				</commercestudent>
			</xsl:for-each>
		</Students>
	<xsl:template>
</xsl:stylesheet>