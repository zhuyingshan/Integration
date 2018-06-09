<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="MathStudents">
	    <xsl:apply-templates/>
		<MathStudents>
		    <xsl:for-each select="name='mathstudent'">
			    <学生编号>
				   <xsl:value-of select="学号"/>
				</学生编号>
				<姓名>
				   <xsl:value-of select="姓名"/>
				</姓名> 
				<专业>
                   <xsl:value-of select="院系"/>
				</专业>
			</xsl:for-each>
		</MathStudents>
	<xsl:template>
</xsl:stylesheet>