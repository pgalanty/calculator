package pl.pgalanty.calculator.domains.parabola;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
public class ParabolaController {

    private ParabolaService parabolaService;

    @RequestMapping(value = "/api/parabola", method = RequestMethod.GET)
    private String parabola(@RequestBody PointsDTO pointsDTO ) {
        return parabolaService.parabola(pointsDTO);
    }


}
