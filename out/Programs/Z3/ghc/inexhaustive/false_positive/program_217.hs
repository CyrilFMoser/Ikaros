module Program_31 () where 

 main = print $ show v_b
data B_A = C_A
data B_B a b = C_B B_A B_A | C_C a | C_D (B_B b b) B_A | C_E ((B_A,B_A)) Bool

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ C_A -> 0 
  C_D (C_C _) C_A -> 1 
  C_D (C_C _) _ -> 2 
  C_D (C_D (C_E _ _) C_A) _ -> 3 
