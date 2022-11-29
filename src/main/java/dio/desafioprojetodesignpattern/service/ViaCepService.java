package dio.desafioprojetodesignpattern.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio.desafioprojetodesignpattern.model.Endereco;

@FeignClient(name = "viacep", url="https://viacep.com.br/ws")
public class ViaCepService {
    //@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    //Endereco consultarCep(@PathVariable("cep") String cep);
}
