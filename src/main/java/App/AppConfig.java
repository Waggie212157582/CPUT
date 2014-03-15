/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App;

import Service.Crud.BooksCrudServiceInter;
import Service.Crud.CrudImpl.BooksCrudServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author WAGGIE
 */
@Configurable
public class AppConfig {
    @Bean(name = "BooksCrudService")
    public  BooksCrudServiceInter getBooksCrudServiceInter(){
        return new BooksCrudServiceImpl();
    }
}
