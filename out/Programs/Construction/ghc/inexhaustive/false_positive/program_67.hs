module Program_11 () where 

 main = print $ show v_b
data B_B a = C_F | C_G (B_B a) | C_H
data B_A = C_A | C_B (B_C B_A B_A) | C_C (B_C B_A Bool) (B_C B_A ((Char,Char))) | C_D (B_B B_A) (B_C B_A B_A) | C_E (((Char,Bool),B_A)) (((Int,Char),B_A))
data B_C b c = C_I (B_C c c) | C_J c | C_K ((B_A,Char)) | C_L

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G (C_F) -> 1 
  C_G (C_G _) -> 2 
  C_H -> 3 
