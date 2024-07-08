module Program_10 () where 

 main = print $ show v_b
data B_C c = C_E (B_B c c) | C_F c ((B_A,(Bool,Int))) | C_G (((Char,Bool),(Int,Bool)))
data B_B a b = C_C | C_D
data B_A = C_A | C_B (B_C B_A)
data B_D d = C_H Bool | C_I | C_J (B_B d d) (((Int,Bool),B_A)) | C_K | C_L (B_C d) ((Int,B_A))

v_a :: B_D B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_J _ _ -> 1 
  C_K -> 2 
  C_L (C_E _) _ -> 3 
  C_L (C_F _ _) _ -> 4 
  C_L (C_G _) _ -> 5 
