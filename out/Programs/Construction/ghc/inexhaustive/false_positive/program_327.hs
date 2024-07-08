module Program_15 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C | C_D B_A B_A | C_E ((B_A,Char)) (((Int,Char),B_A))
data B_B a b = C_F | C_G B_A | C_H (B_B b b) b | C_I

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ -> 1 
  C_H (C_F) _ -> 2 
  C_H (C_G C_A) _ -> 3 
  C_H (C_G (C_B _ _)) _ -> 4 
  C_H (C_G (C_D _ _)) _ -> 5 
  C_H (C_G (C_E _ _)) _ -> 6 
  C_H (C_H _ _) _ -> 7 
  C_H (C_I) _ -> 8 
  C_I -> 9 
