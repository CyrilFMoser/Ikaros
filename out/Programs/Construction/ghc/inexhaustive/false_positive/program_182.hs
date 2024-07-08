module Program_29 () where 

 main = print $ show v_b
data B_C b c = C_I (B_A c)
data B_A a = C_A a | C_B | C_C a (B_C a a)
data B_B = C_D B_B | C_E (B_C Int B_B) | C_F (B_C B_B B_B) (B_C ((Int,Char)) B_B) | C_G | C_H

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C _ (C_I (C_A _)) -> 2 
  C_C _ (C_I (C_C _ _)) -> 3 
