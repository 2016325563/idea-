package cn.kgc.mapper;

import cn.kgc.entity.Library;

import java.util.List;

public interface LibraryMapper {


    // 根据图书馆id查询图书馆信息以及所属的图书类别信息
    Library queryLibraryDetailsById(int libraryId);

    // 查询每种类别的书本数量
    List<Library> countBooksPerCategory();
}
