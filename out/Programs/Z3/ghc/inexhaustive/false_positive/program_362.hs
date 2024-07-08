module Program_18 () where 

 main = print $ show v_b
data B_A = C_A (((Int,Bool),B_A)) B_A | C_B | C_C Int | C_D B_A B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C _) (C_D (C_A _ _) (C_A _ _)) -> 0 
  C_D (C_D C_B (C_A _ _)) (C_A (((_,_),C_D _ _)) (C_D _ _)) -> 1 
