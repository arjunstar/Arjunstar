USE [ARCH70]
GO
/****** Object:  Table [dbo].[employee]    Script Date: 04/19/2013 00:08:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[employee](
	[employeeid] [numeric](10, 0) NULL,
	[employeename] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	[firstname] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	[department] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF