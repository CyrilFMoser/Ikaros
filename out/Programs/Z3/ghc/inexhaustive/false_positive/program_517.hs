module Program_9 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B (B_B B_A B_A) | C_C | C_D (B_B B_A B_A)
data B_B a b = C_E ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _) -> 0 
  C_A (C_B (C_E _)) -> 1 
  C_B (C_E ((C_D _,C_B _))) -> 2 
  C_B (C_E ((C_D _,C_C))) -> 3 
  C_B (C_E ((C_A _,C_B _))) -> 4 
  C_B (C_E ((C_B _,C_A _))) -> 5 
  C_B (C_E ((C_C,C_D _))) -> 6 
