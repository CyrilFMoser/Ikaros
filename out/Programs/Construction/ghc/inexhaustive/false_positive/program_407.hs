module Program_3 () where 

 main = print $ show v_b
data B_B a b = C_F
data B_C c = C_G B_A | C_H | C_I c (B_B c c) | C_J ((Char,B_A)) B_A
data B_A = C_A | C_B (B_C B_A) B_A | C_C | C_D Char | C_E

v_a :: B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_H -> 1 
  C_J _ _ -> 2 
