package medio.sacola.resource;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import medio.sacola.Service.SacolaService;
import medio.sacola.model.Item;
import medio.sacola.model.Sacola;
import medio.sacola.resource.dto.ItemDto;
import org.springframework.web.bind.annotation.*;


@Api(value = "/ifood-devweek/sacolas")

@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDto itemDto){
    return sacolaService.incluirItemNaSacola(itemDto);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id){
        return sacolaService.verSacola(id);
    }

    @PatchMapping("/fecharSacola/{sacolaId}")
    public Sacola fecharSacola(@PathVariable("sacolaId") Long sacolaId,
                               @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(sacolaId, formaPagamento);
    }

}
