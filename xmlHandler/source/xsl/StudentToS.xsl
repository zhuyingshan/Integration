<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="SoftwareStudents">
	    <xsl:apply-templates/>
		<SoftwareStudents>
		    <xsl:for-each select="name='softwarestudent'">
			    <学号>
				   <xsl:value-of select="学号"/>
				</学号>
				<姓名>
				   <xsl:value-of select="姓名"/>
				</姓名> 
				<院系>
                   <xsl:value-of select="院系"/>
				</院系>
			</xsl:for-each>
		</SoftwareStudents>
	<xsl:template>
</xsl:stylesheet>