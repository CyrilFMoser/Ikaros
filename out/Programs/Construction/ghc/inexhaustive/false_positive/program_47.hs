module Program_22 () where 

 main = print $ show v_b
data B_A a = C_A (((Char,Bool),(Int,Char))) | C_B B_B B_B | C_C
data B_B = C_D Int Char | C_E (B_A B_B) Char | C_F (B_A B_B) | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E (C_A ((_,_))) _ -> 1 
  C_E (C_B (C_D _ _) _) _ -> 2 
  C_E (C_B (C_E _ _) _) _ -> 3 
  C_E (C_B C_G _) _ -> 4 
  C_E (C_C) _ -> 5 
  C_F _ -> 6 
  C_G -> 7 
