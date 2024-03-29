USE [ARCH70]
GO
/****** Object:  Table [dbo].[invoice]    Script Date: 04/19/2013 00:09:07 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[invoice](
	[id] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	[customerId] [numeric](18, 0) NULL,
	[description] [varchar](50) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	[issueDate] [datetime] NULL,
	[amount] [decimal](18, 7) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF