<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="Students">
	    <xsl:apply-templates/>
		<Students>
		    <xsl:for-each select="softwarestudent">
			    <softwarestudent>
				    <xsl:choose>
					    <xsl:when test="major='software'">
						     <学号>
							     <xsl:value-of select="id"/>
							 </学号>
							 <姓名>
							     <xsl:value-of select="name"/>
							 </姓名> 
							 <院系>
					             <xsl:value-of select="major"/>
							 </院系>
					    </xsl:when>
					</xsl:choose>
				</softwarestudent>
			</xsl:for-each>
		</Students>
	<xsl:template>
</xsl:stylesheet>