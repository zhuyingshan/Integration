<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8"/>
	<xsl:template match="/">
		<MathSelectionList>
			<xsl:choose>
				<xsl:when test="name = 'SoftwareSelectionList'">
					<xsl:for-each select="SoftwareSelection">
						<MathSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="学号">
								<xsl:value-of select="学生编号"/>
							</xsl:attribute>
							<xsl:attribute name="分数">
								<xsl:value-of select="成绩"/>
							</xsl:attribute>
						</MathSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'CormmerceSelectionList'">
					<xsl:for-each select="CormmerceSelection">
						<MathSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="cns"/>
							</xsl:attribute>
							<xsl:attribute name="学号">
								<xsl:value-of select="sno"/>
							</xsl:attribute>
							<xsl:attribute name="分数">
								<xsl:value-of select="grd"/>
							</xsl:attribute>
						</MathSelection>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="name = 'UniteSelectionList'">
					<xsl:for-each select="UniteSelection">
						<MathSelection>
							<xsl:attribute name="课程编号">
								<xsl:value-of select="课程编号"/>
							</xsl:attribute>
							<xsl:attribute name="学号">
								<xsl:value-of select="学生编号"/>
							</xsl:attribute>
							<xsl:attribute name="分数">
								<xsl:value-of select="分数"/>
							</xsl:attribute>
						</MathSelection>
					</xsl:for-each>
				</xsl:when>
			</xsl:choose>
		</MathSelectionList>
	</xsl:template>
</xsl:stylesheet>