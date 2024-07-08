module Program_27 () where 

 main = print $ show v_b
data B_C b c = C_F | C_G (B_C b b) ((B_A,B_A)) | C_H | C_I
data B_A = C_A | C_B (B_C B_A B_A) | C_C B_A
data B_B a = C_D (B_B B_A) (B_B a) | C_E

v_a :: B_C B_A B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G (C_F) _ -> 1 
  C_G (C_G (C_F) ((_,_))) _ -> 2 
  C_G (C_G (C_G _ _) ((_,_))) _ -> 3 
  C_G (C_G (C_H) ((_,_))) _ -> 4 
  C_G (C_G (C_I) ((_,_))) _ -> 5 
  C_G (C_H) _ -> 6 
  C_G (C_I) _ -> 7 
  C_I -> 8 
