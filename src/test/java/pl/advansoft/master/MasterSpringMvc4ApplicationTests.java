package pl.advansoft.master;

import static org.mockito.Mockito.when;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import pl.advansoft.master.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MasterSpringMvc4ApplicationTests {

	public static final String TEXT = "page";

	@Mock
	private HelloController controller;

	@Mock
	private Model model;

	@Mock
	private LinkedList<String> list;

	@Test
	public void testControllerHello() {
		when(controller.hello(ArgumentMatchers.any(Model.class), ArgumentMatchers.any(String.class))).thenReturn(TEXT);
		Assert.assertEquals(TEXT, controller.hello(model, "ps"));
	}

	@Test
	public void testLinkedList() {
		when(list.get(0)).thenReturn(TEXT);
		Assert.assertEquals(TEXT, list.get(0));
		Assert.assertNull(list.get(999));
	}
}
