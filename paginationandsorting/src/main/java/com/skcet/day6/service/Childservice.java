package com.skcet.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.skcet.day6.model.Childmodel;
import com.skcet.day6.repository.Childrepo;

@Service
public class Childservice {
@Autowired
Childrepo crepo;

public Childmodel savedetails(Childmodel f)
{
	return crepo.save(f);
}


public List<Childmodel> getChild()
{
	return crepo.findAll();
}

public List<Childmodel> sortDes(String name)
{
	return crepo.findAll(Sort.by(name).descending());
}

}