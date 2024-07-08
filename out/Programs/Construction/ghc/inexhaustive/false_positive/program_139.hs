module Program_19 () where 

 main = print $ show v_b
data B_B a b = C_F (B_B b b) a | C_G B_D | C_H (((Bool,Int),(Char,Bool))) Bool | C_I | C_J
data B_D = C_N B_D B_C | C_O B_C | C_P | C_Q (B_B ((Bool,Bool)) ((Char,Char))) | C_R B_A B_A
data B_C = C_K B_C B_A | C_L | C_M ((B_D,B_A)) B_C
data B_A = C_A ((B_D,B_C)) | C_B Char | C_C (B_B B_D B_A) | C_D Int B_D | C_E B_A

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_N _ _ -> 0 
  C_O _ -> 1 
  C_P -> 2 
  C_Q (C_F _ _) -> 3 
  C_Q (C_G (C_N _ _)) -> 4 
  C_Q (C_G (C_O _)) -> 5 
  C_Q (C_G C_P) -> 6 
  C_Q (C_G (C_Q _)) -> 7 
  C_Q (C_G (C_R _ _)) -> 8 
  C_Q (C_H _ _) -> 9 
  C_Q (C_I) -> 10 
  C_Q (C_J) -> 11 
