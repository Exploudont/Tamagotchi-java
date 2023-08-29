# Tamagotchi

A basic project that would recreate the Tamagotchi game and expand it's functionality.

# Basic Usage

``` Java
import com.exploudont.tamagotchi.TamagotchiFactory;
import com.exploudont.tamagotchi.Tamagotchi;

// ...
Tamagotchi tama = TamagotchiFactory.create();
//...
```
## Event driven

The Tamagotchi use the event driven paradig to notify the changes.

``` Java
import com.exploudont.tamagotchi.listener.TamagotchiStageListener;
import com.exploudont.tamagotchi.listener.TamagotchiStatusListener;
import com.exploudont.tamagotchi.listener.TamgaotchiPoopListener;

//...
tama.setTamagotchiStageListener(example_stage_listener);
tama.setTamagotchiStatusListener(example_status_listener);
tama.setTamgaotchiPoopListener(example_poop_listener);
//...
```

# To-Do

- Create tamagotchi's games package.
- Create a simple tamagotchi GUI.
