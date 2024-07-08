module Program_5 () where 

main = print $ show v_b
data B_B a b = C_E ((B_A,B_A))
data B_A = C_A B_A | C_B (B_B B_A B_A) | C_C | C_D (B_B B_A B_A)

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _)) -> 0 
  C_A C_C -> 1 
  C_A (C_D _) -> 2 
  C_D (C_E ((C_C,C_D _))) -> 3 
  C_D (C_E ((C_B _,C_B _))) -> 4 
  C_D (C_E ((C_D _,C_C))) -> 5 
  C_D (C_E ((C_A _,C_C))) -> 6 
  C_D (C_E _) -> 7 
  C_D (C_E ((C_A _,C_D _))) -> 8 
  C_D (C_E ((C_D _,C_D _))) -> 9 
  C_D (C_E ((C_A _,C_B _))) -> 10 
  C_D (C_E ((C_C,C_B _))) -> 11 
  C_D (C_E ((C_B _,C_A _))) -> 12 
  C_D (C_E ((C_B _,C_C))) -> 13 
