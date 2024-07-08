module Program_24 () where 

 main = print $ show v_b
data B_C = C_G ((Bool,(Bool,Char))) B_C | C_H B_A | C_I
data B_A = C_A (B_B B_A) Char | C_B (B_B Int) B_C | C_C B_A | C_D ((B_C,B_C)) (B_B ((Char,Bool))) | C_E
data B_B a = C_F B_C

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H (C_A (C_F _) _) -> 1 
  C_H (C_B _ _) -> 2 
  C_H (C_C _) -> 3 
  C_H (C_D _ _) -> 4 
  C_I -> 5 
