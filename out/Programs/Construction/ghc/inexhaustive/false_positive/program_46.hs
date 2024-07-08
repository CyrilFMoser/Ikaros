module Program_21 () where 

 main = print $ show v_b
data B_B c d = C_D Bool Char | C_E (B_C d c) | C_F (B_A d d) | C_G (B_A ((Char,Bool)) c) (B_A c d) | C_H
data B_A a b = C_A ((Char,Int)) | C_B (B_A a b) (B_B b Bool) | C_C Char
data B_C e f = C_I | C_J (B_C e ((Char,Char))) | C_K (((Char,Bool),(Char,Bool))) | C_L

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E _ -> 1 
  C_F (C_A _) -> 2 
  C_F (C_C _) -> 3 
  C_G _ _ -> 4 
  C_H -> 5 
