USE [QuanLyBanCaPhe]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaHoaDon] [int] NOT NULL,
	[MaSanPham] [int] NOT NULL,
	[SoLuong] [int] NULL,
	[DonGia] [bigint] NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC,
	[MaSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaChucVu] [nvarchar](50) NOT NULL,
	[TenChucVu] [nvarchar](50) NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[MaChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[NgayLap] [datetime] NULL,
	[MaNhanVien] [nvarchar](50) NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoaiSP] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiSP] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[MaLoaiSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[TenNhanVien] [nvarchar](50) NULL,
	[NgaySinh] [datetime] NULL,
	[GioiTinh] [bit] NULL,
	[MaChucVu] [nvarchar](50) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSanPham] [int] IDENTITY(1,1) NOT NULL,
	[TenSanPham] [nvarchar](50) NULL,
	[AnhSanPham] [nvarchar](50) NULL,
	[GiaBan] [bigint] NULL,
	[MaLoaiSP] [int] NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSanPham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/6/2023 4:17:21 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTaiKhoan] [nvarchar](50) NOT NULL,
	[TenDangNhap] [nvarchar](50) NULL,
	[MatKhau] [nvarchar](50) NULL,
	[MaNhanVien] [nvarchar](50) NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[MaTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (1, 2, 2, 45000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (2, 8, 1, 45000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (2, 9, 1, 30000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (3, 9, 3, 30000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (3, 10, 1, 35000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (3, 18, 1, 35000)
INSERT [dbo].[ChiTietHoaDon] ([MaHoaDon], [MaSanPham], [SoLuong], [DonGia]) VALUES (4, 19, 4, 29000)
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu]) VALUES (N'CV1', N'admin')
INSERT [dbo].[ChucVu] ([MaChucVu], [TenChucVu]) VALUES (N'CV2', N'nhân viên')
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [MaNhanVien]) VALUES (1, CAST(N'2023-07-07 00:00:00.000' AS DateTime), N'NV3')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [MaNhanVien]) VALUES (2, CAST(N'2023-07-22 00:00:00.000' AS DateTime), N'NV1')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [MaNhanVien]) VALUES (3, CAST(N'2023-07-26 00:00:00.000' AS DateTime), N'NV1')
INSERT [dbo].[HoaDon] ([MaHoaDon], [NgayLap], [MaNhanVien]) VALUES (4, CAST(N'2023-07-27 00:00:00.000' AS DateTime), N'NV1')
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP]) VALUES (1, N'Cà phê')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP]) VALUES (2, N'Freeze')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP]) VALUES (3, N'Trà')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP]) VALUES (4, N'Bánh ngọt')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP]) VALUES (5, N'Khác')
SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [MaChucVu]) VALUES (N'NV1', N'An', CAST(N'2001-08-08 00:00:00.000' AS DateTime), 1, N'CV2')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [MaChucVu]) VALUES (N'NV2', N'Cường', CAST(N'2002-04-04 00:00:00.000' AS DateTime), 0, N'CV2')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [NgaySinh], [GioiTinh], [MaChucVu]) VALUES (N'NV3', N'Tâm', CAST(N'2002-03-03 00:00:00.000' AS DateTime), 1, N'CV1')
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (1, N'Phindi Choco', N'images/phindichoco.jpg', 46000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (2, N'Latte', N'images/latte.jpg', 45000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (3, N'Freeze Trà xanh', N'images/freeze_traxanh.jpg', 55000, 2)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (4, N'Trà thạch vải', N'images/tra_thachvai.jpg', 45000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (5, N'Bánh phô mai cà phê', N'images/banh_phomaicaphe.jpg', 29000, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (6, N'Ly sứ Mosaic', N'images/lysu_mosaic.jpg', 79000, 5)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (8, N'Phindi kem sữa', N'images/phindikemsua.jpg', 45000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (9, N'Phin sữa đá', N'images/phinsuada.jpg', 30000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (10, N'Trà xanh đậu đỏ', N'images/tra_xanhdaudo.jpg', 35000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (11, N'Bánh phô mai trà xanh', N'images/banh_phomaitraxanh.jpg', 25000, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (14, N'Truyền thống', N'images/truyenthong_200gr.jpg', 38000, 5)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (16, N'Trà thạch đào', N'images/tra_thachdao.jpg', 42000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (18, N'Bánh Mousse đào', N'images/banh_moussedao.jpg', 35000, 4)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (19, N'Bạc xỉu đá', N'images/caphe_bacxiuda.jpg', 29000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (20, N'Cà phê sữa lon', N'images/caphesua_lon.jpg', 69000, 5)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (21, N'Cappuccino', N'images/cappuccino.jpg', 65000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (22, N'Caramel macchiatto', N'images/caramel_macchiatto.jpg', 69000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (23, N'Caramel phin frezeze', N'images/caramel_phin_freeze.jpg', 45000, 2)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (24, N'Cookies cream', N'images/cookies_cream.jpg', 45000, 2)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (25, N'Espresso', N'images/expresso.jpg', 45000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (26, N'Freeze Socola', N'images/freeze_socola.jpg', 59000, 2)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (27, N'Phin đen đá', N'images/phindenda.jpg', 29000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (28, N'Phin đen nóng', N'images/phindennong.jpg', 29000, 1)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (29, N'Trà sen vàng (củ năng)', N'images/tra_senvang_cunang.jpg', 45000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (30, N'Trà sen vàng (sen)', N'images/tra_senvang_sen.jpg', 42000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (31, N'Trà thạch vải', N'images/tra_thachvai.jpg', 45000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (32, N'Trà tuyết phúc bồn tử', N'images/tra_tuyetphucbontu.png', 59000, 3)
INSERT [dbo].[SanPham] ([MaSanPham], [TenSanPham], [AnhSanPham], [GiaBan], [MaLoaiSP]) VALUES (33, N'Trà tuyết xoài đào', N'images/tra_tuyetxoaidao.png', 59000, 3)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [MaNhanVien]) VALUES (N'TK1', N'duyan', N'11', N'NV1')
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [MaNhanVien]) VALUES (N'TK2', N'cuong', N'22', N'NV2')
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [MaNhanVien]) VALUES (N'TK3', N'tam', N'33', N'NV3')
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([MaHoaDon])
REFERENCES [dbo].[HoaDon] ([MaHoaDon])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([MaSanPham])
REFERENCES [dbo].[SanPham] ([MaSanPham])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChucVu] FOREIGN KEY([MaChucVu])
REFERENCES [dbo].[ChucVu] ([MaChucVu])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChucVu]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([MaLoaiSP])
REFERENCES [dbo].[LoaiSanPham] ([MaLoaiSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NhanVien]
GO
