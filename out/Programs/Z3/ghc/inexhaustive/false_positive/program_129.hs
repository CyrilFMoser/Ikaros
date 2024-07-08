module Program_1 () where 

 main = print $ show v_b
data B_A = C_A Char | C_B B_A | C_C (B_B B_A) | C_D
data B_B a = C_E Bool | C_F B_A (B_B a) | C_G B_A a

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_B (C_B (C_C _)) -> 1 
  C_B C_D -> 2 
  C_B (C_B (C_B _)) -> 3 
  C_C (C_E _) -> 4 
  C_C (C_F (C_A _) (C_F _ _)) -> 5 
  C_C (C_F (C_B _) _) -> 6 
  C_C (C_G C_D C_D) -> 7 
  C_C (C_G (C_A _) C_D) -> 8 
  C_C (C_F _ _) -> 9 
  C_C (C_G _ (C_B _)) -> 10 
  C_C (C_F (C_B _) (C_E _)) -> 11 
  C_C (C_G (C_C _) C_D) -> 12 
  C_C (C_F C_D (C_E _)) -> 13 
  C_C (C_G (C_B _) (C_B _)) -> 14 
  C_C (C_G (C_C _) (C_B _)) -> 15 
  C_C (C_G C_D (C_B _)) -> 16 
  C_C (C_G C_D (C_C _)) -> 17 
  C_C (C_G (C_A _) (C_C _)) -> 18 
  C_C (C_G C_D (C_A _)) -> 19 
