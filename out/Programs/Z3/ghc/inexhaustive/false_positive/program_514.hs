module Program_6 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B (B_B B_A B_A) | C_C | C_D (B_B B_A B_A)
data B_B a b = C_E ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A (C_B _) -> 1 
  C_A (C_A (C_D _)) -> 2 
  C_A (C_D (C_E _)) -> 3 
  C_B (C_E _) -> 4 
  C_B (C_E ((C_C,C_A _))) -> 5 
  C_B (C_E ((C_D _,C_A _))) -> 6 
  C_B (C_E ((C_C,C_B _))) -> 7 
  C_B (C_E ((C_B _,C_D _))) -> 8 
  C_B (C_E ((C_A _,C_D _))) -> 9 
  C_B (C_E ((C_B _,C_B _))) -> 10 
  C_B (C_E ((C_D _,C_D _))) -> 11 
  C_D (C_E ((C_D _,C_A _))) -> 12 
  C_D (C_E ((C_C,C_A _))) -> 13 
  C_D (C_E ((C_B _,C_D _))) -> 14 
  C_D (C_E ((C_D _,C_B _))) -> 15 
  C_D (C_E ((C_C,C_C))) -> 16 
  C_D _ -> 17 
