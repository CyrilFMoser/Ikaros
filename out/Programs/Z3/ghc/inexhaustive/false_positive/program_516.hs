module Program_8 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B (B_B B_A B_A) | C_C | C_D (B_B B_A B_A)
data B_B a b = C_E ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A C_C) -> 0 
  C_B (C_E ((C_C,C_C))) -> 1 
  C_B (C_E ((C_B _,C_C))) -> 2 
  C_B (C_E ((C_A _,C_C))) -> 3 
