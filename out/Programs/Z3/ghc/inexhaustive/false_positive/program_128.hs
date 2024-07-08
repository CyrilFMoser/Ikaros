module Program_0 () where 

 main = print $ show v_b
data B_B a = C_E Bool | C_F B_A (B_B a) | C_G B_A a
data B_A = C_A Char | C_B B_A | C_C (B_B B_A) | C_D

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_C (C_E _)) -> 1 
  C_B (C_B C_D) -> 2 
  C_C (C_G (C_B _) (C_A _)) -> 3 
  C_C (C_F (C_A _) (C_G _ _)) -> 4 
  C_C (C_G (C_A _) _) -> 5 
  C_C (C_G (C_A _) (C_A _)) -> 6 
  C_C (C_G (C_B _) _) -> 7 
  C_C (C_G (C_B _) C_D) -> 8 
  C_C (C_G (C_C _) _) -> 9 
  C_C (C_F (C_B _) (C_G _ _)) -> 10 
  C_C (C_G _ (C_A _)) -> 11 
  C_C (C_G (C_A _) (C_B _)) -> 12 
  C_C (C_F _ (C_G _ _)) -> 13 
