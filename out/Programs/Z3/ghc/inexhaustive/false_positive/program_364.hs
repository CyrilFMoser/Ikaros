module Program_2 () where 

 main = print $ show v_b
data B_A a = C_A | C_B
data B_B b = C_C | C_D ((Char,Char)) b | C_E (B_B b) (B_A b) | C_F

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
