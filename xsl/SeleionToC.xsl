<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl">
	<xsl:output method="xml" indent="CommerceSelection" encoding="utf-8"/>

	<xsl:template match="/">
		<CommerceSelectionList>
			<xsl:choose>
				<xsl:when test="name = 'SoftwareSelectionList">
					<xsl:for-each select="SoftwareSelection">
						<CommerceSelection>
							<xsl:attribute name="cns">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="sno">
								<xsl:value-of select="学生编号"/>
							</xsl:attribute>
							<xsl:attribute name="grd">
								<xsl:value-of select="成绩"/>
							</xsl:attribute>
						</CommerceSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'MathSelectionList">
					<xsl:for-each select="MathSelection">
						<CommerceSelection>
							<xsl:attribute name="cns">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="sno">
								<xsl:value-of select="学号"/>
							</xsl:attribute>
							<xsl:attribute name="grd">
								<xsl:value-of select="分数"/>
							</xsl:attribute>
						</CommerceSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'UniteSelectionList">
					<xsl:for-each select="UniteSelection">
						<CommerceSelection>
							<xsl:attribute name="cns">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="sno">
								<xsl:value-of select="学生编号"/>
							</xsl:attribute>
							<xsl:attribute name="grd">
								<xsl:value-of select="分数"/>
							</xsl:attribute>
						</CommerceSelection>
					</xsl:for-each>
				</xsl:when>
			</xsl:choose>
		</CommerceSelectionList>
	</xsl:template>
</xsl:stylesheet>