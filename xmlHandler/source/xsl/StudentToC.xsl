<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="CommerceStudents">
	    <xsl:apply-templates/>
		<CommerceStudents>
		    <xsl:for-each select="name='commercestudent'">
			    <sno>
				   <xsl:value-of select="学号"/>
				</sno>
				<snm>
				   <xsl:value-of select="姓名"/>
				</snm> 
				<sde>
                   <xsl:value-of select="院系"/>
				</sde>
			</xsl:for-each>
		</CommerceStudents>
	<xsl:template>
</xsl:stylesheet>