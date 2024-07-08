module Program_28 () where 

 main = print $ show v_b
data B_A a = C_A | C_B | C_C (B_A ((Int,Char))) | C_D (B_B a) (B_B a)
data B_B b = C_E

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C (C_A) -> 2 
  C_C (C_B) -> 3 
  C_C (C_C (C_B)) -> 4 
  C_C (C_C (C_C _)) -> 5 
  C_C (C_C (C_D _ _)) -> 6 
  C_C (C_D (C_E) (C_E)) -> 7 
  C_D _ (C_E) -> 8 
