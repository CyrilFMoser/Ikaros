module Program_29 () where 

 main = print $ show v_b
data B_B = C_B | C_C B_B
data B_A = C_A B_A
data B_C a = C_D | C_E a | C_F ((Char,(Bool,Int))) | C_G (B_C Int) B_A | C_H
data B_D b c = C_I (B_C c) | C_J B_B B_A | C_K B_B

v_a :: B_C B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E (C_A (C_A _)) -> 1 
  C_G _ _ -> 2 
  C_H -> 3 
