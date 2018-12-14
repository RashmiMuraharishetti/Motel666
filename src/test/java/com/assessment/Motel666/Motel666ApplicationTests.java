package com.assessment.Motel666;

import com.assessment.Motel666.Controller.MotelController;
import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Service.MotelService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Motel666ApplicationTests {

    @Mock
    MotelService mockService;

    @Autowired
    MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPostDetails(){
        Motel expected = new Motel(1L, "1b468f7d-79e8-40c1-80a2-0dd7226e7771", "promotion-viewed", 1544401072, "homepage.topnav");
        MotelController motelController = new MotelController(mockService);

        when(mockService.addDetails(expected)).thenReturn(expected);

        Motel actual = motelController.addDetails(expected);

        Assert.assertEquals(expected, actual);

	}

	@Test
    public void testGetDetails(){
	    Iterable<Motel> expected = new ArrayList<Motel>();
        MotelController motelController = new MotelController(mockService);

        when(mockService.getDetails(anyLong(), anyLong())).thenReturn(expected);

        Iterable<Motel> actual = motelController.getDetails(34L,89L);

        verify(mockService, times(1)).getDetails(anyLong(), anyLong());

    }

    @Test
    public void testGetDetailsById(){
        Iterable<Motel> expected = new ArrayList<>();
        MotelController motelController = new MotelController(mockService);

        when(mockService.findByuserId(anyString())).thenReturn(expected);

       /* try {
            mockMvc.perform(MockMvcRequestBuilders
                    .get("/motel/getdetailsbyid/{userId}", anyString())
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

       Iterable<Motel> actual = motelController.getDetailsById("rtsye");

        verify(mockService, Mockito.times(1)).findByuserId(anyString());
        verifyNoMoreInteractions(mockService);
    }

}


