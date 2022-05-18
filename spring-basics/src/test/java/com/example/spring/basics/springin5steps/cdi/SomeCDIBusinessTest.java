package com.example.spring.basics.springin5steps.cdi;

import com.example.spring.basics.springin5steps.SpringIn5StepsBasicApplication;
import com.example.spring.basics.springin5steps.SpringIn5StepsCDIApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = SpringIn5StepsCDIApplication.class)
@ExtendWith(MockitoExtension.class)
class SomeCDIBusinessTest {


    // Instead of depending upon the data layer to get values from the someCDIDAO and creating different version
    // of this class, we can create mocks and inject them into the business layer to see the working.

    // @Autowired
    // Inject Mock
    @InjectMocks
    SomeCDIBusiness business;

    // Create Mock
    @Mock
    SomeCDIDAO someCDIDAO;

    @Test
    public void testBasicScenaio(){
        when(someCDIDAO.getData()).thenReturn(new int[] {2, 4});
        int result = business.findGreatest();
        assertEquals(4, result);
    }

    @Test
    public void testBasicScenaioMinimumValue(){
        when(someCDIDAO.getData()).thenReturn(new int[] {2, 4});
        int result = business.findMinimum();
        assertEquals(2, result);

    }

}