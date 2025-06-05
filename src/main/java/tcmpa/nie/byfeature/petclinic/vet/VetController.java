/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tcmpa.nie.byfeature.petclinic.vet;

import java.util.Collection;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@RestController
@RequestMapping("/vet")
@Tag(name = "Vet", description = "Operations related to vets")
class VetController {

	protected final VetUseCases vetUseCases;

    VetController(VetUseCases vetUseCases) {
        this.vetUseCases = vetUseCases;
    }

	@GetMapping("/")
	@Operation(summary = "Find all vets", description = "Retrieves all vets from the system")
	public Collection<Vet> findAll() {
		return this.vetUseCases.findAll();
	}


	@GetMapping("/find-by-specialty")
	@Operation(summary = "Find all vets by specialty", description = "Retrieves all vets with a specialty from the system")
	public Collection<Vet> findAllBySpecialty(@RequestParam("keyword") String keyword) {

		return this.vetUseCases.findBySpecialty(keyword);

	}

}
