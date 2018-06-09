<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8"/>

	<xsl:template match="/">
		<SoftwareSelectionList>
			<xsl:choose>
				<xsl:when test="name = 'MathSelectionList">
					<xsl:for-each select="MathSelection">
						<SoftwareSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="学生编号">
								<xsl:value-of select="学号"/>
							</xsl:attribute>
							<xsl:attribute name="成绩">
								<xsl:value-of select="分数"/>
							</xsl:attribute>
						</SoftwareSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'CormmerceSelectionList">
					<xsl:for-each select="CormmerceSelection">
						<SoftwareSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="cns"/>
							</xsl:attribute>
							<xsl:attribute name="学生编号">
								<xsl:value-of select="sno"/>
							</xsl:attribute>
							<xsl:attribute name="成绩">
								<xsl:value-of select="grd"/>
							</xsl:attribute>
						</SoftwareSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'UniteSelectionList">
					<xsl:for-each select="UniteSelection">
						<SoftwareSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="学生编号">
								<xsl:value-of select="学生编号"/>
							</xsl:attribute>
							<xsl:attribute name="成绩">
								<xsl:value-of select="分数"/>
							</xsl:attribute>
						</SoftwareSelection>
					</xsl:for-each>
				</xsl:when>
			</xsl:choose>
		</SoftwareSelectionList>
	</xsl:template>
</xsl:stylesheet>