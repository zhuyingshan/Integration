<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="Students">
	    <xsl:apply-templates/>
		<Students>
		    <xsl:for-each select="mathstudent">
			    <mathstudent>
				    <xsl:choose>
					    <xsl:when test="major='math'">
						     <学生编号>
							     <xsl:value-of select="学号"/>
							 </学生编号>
							 <姓名>
							     <xsl:value-of select="姓名"/>
							 </姓名> 
							 <专业>
					             <xsl:value-of select="院系"/>
							 </专业>
					    </xsl:when>
					</xsl:choose>
				</mathstudent>
			</xsl:for-each>
		</Students>
	<xsl:template>
</xsl:stylesheet>