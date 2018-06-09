<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" indent="yes" method="xml"/>
    <xsl:template match="/">
       <MathCourses>
          <xsl:for-each select ="name='MathCourse'">
             <cno><xsl:value-of select ="编号"></xsl:value-of></cno>
             <cnm><xsl:value-of select ="课程名称"></xsl:value-of></cnm>
             <tec><xsl:value-of select ="授课老师"></tec>
             <share><xsl:value-of select ="共享"></share>
             </xsl:for-each>
          </MathCourses>
    </xsl:template>
</xsl:stylesheet>
