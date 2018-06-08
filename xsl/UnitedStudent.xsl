<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"> 
    <xsl:output method="xml" encoding="UTF-8"/>
	<xsl:template match="Students">
	    <xsl:apply-templates/>
		<Students>
		    <xsl:for-each select="student">
			    <student>
				    <xsl:choose>
					    <xsl:when test="name='softwarestudent'">
						     <major>
							     <xsl:value-of select="院系"/>
							 </major>
							 <name>
							     <xsl:value-of select="姓名"/>
							 </name> 
							 <id>
					             <xsl:value-of select="学号"/>
							 </id>
					    </xsl:when>
						<xsl:when test="name='commercestudent'">
						     <major>
							     <xsl:value-of select="sde"/>
							 </major>
							 <name>
							     <xsl:value-of select="snm"/>
							 </name> 
							 <id>
					             <xsl:value-of select="Sno"/>
							 </id>
					    </xsl:when>
					    <xsl:when test="name='mathstudent'">
						     <major>
							     <xsl:value-of select="专业"/>
							 </major>
							 <name>
							     <xsl:value-of select="姓名"/>
							 </name> 
							 <id>
					             <xsl:value-of select="学生编号"/>
							 </id>
					    </xsl:when>
					</xsl:choose>
					
				</student>
			</xsl:for-each>
		</Students>
	</xsl:template>


</xsl:stylesheet>