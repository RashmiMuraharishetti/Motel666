package com.assessment.Motel666;

import com.assessment.Motel666.Controller.MotelController;
import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Service.MotelService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Motel666ApplicationTests {

    @Mock
    MotelService mockService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPostDetails(){
        Motel expected = new Motel("1b468f7d-79e8-40c1-80a2-0dd7226e7771", "promotion-viewed", 1544401072, "homepage.topnav");
        MotelController motelController = new MotelController(mockService);

        when(mockService.addDetails(expected)).thenReturn(expected);

        Motel actual = motelController.addDetails(expected);

        Assert.assertEquals(expected, actual);

	}

	@Test
    public void testGetDetails(){
	    Iterable<Motel> expected = new ArrayList<Motel>();
        MotelController motelController = new MotelController(mockService);

        when(mockService.getDetails()).thenReturn(expected);

        Iterable<Motel> actual = motelController.getDetails();

        verify(mockService, times(1)).getDetails();

    }

}


