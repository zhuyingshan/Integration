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
							 <学号>
					             <xsl:value-of select="学号"/>
							 </学号>
							 <姓名>
							     <xsl:value-of select="姓名"/>
							 </姓名> 
							 <院系>
							     <xsl:value-of select="院系"/>
							 </院系>
					    </xsl:when>
						<xsl:when test="name='commercestudent'">
						     <学号>
					             <xsl:value-of select="sno"/>
							 </学号>
							 <姓名>
							     <xsl:value-of select="snm"/>
							 </姓名> 
							 <院系>
							     <xsl:value-of select="sde"/>
							 </院系>
					    </xsl:when>
					    <xsl:when test="name='mathstudent'">
						     <学号>
					             <xsl:value-of select="学生编号"/>
							 </学号>
							 <姓名>
							     <xsl:value-of select="姓名"/>
							 </姓名> 
							 <院系>
							     <xsl:value-of select="专业"/>
							 </院系>
					    </xsl:when>
					</xsl:choose>
					
				</student>
			</xsl:for-each>
		</Students>
	</xsl:template>


</xsl:stylesheet>