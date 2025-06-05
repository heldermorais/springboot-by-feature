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
package tcmpa.nie.byfeature.petclinic.owner;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tcmpa.nie.byfeature.petclinic.common.controllers.AbstractCrudController;
import tcmpa.nie.byfeature.petclinic.owner.persistence.OwnerRepository;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 * @author Wick Dynex
 */
@RestController
@RequestMapping("/owner")
@Tag(name = "Owner", description = "Owner management operations")
class OwnerController extends AbstractCrudController<OwnerService, Owner, Integer> {


	public OwnerController(OwnerService useCase) {
		super(useCase);
	}


	@Operation(summary = "Find all owners", description = "Retrieves all owners from the system")
	@Override
	public Collection<Owner> findAll() {
		return super.findAll();
	}



	@Override
	public Owner findById(Integer integer) {
		return super.findById(integer);
	}
}
