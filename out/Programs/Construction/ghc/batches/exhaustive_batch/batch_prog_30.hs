module Program_30 () where 

 main = print $ show v_b
data B_A = C_A (((Int,Char),B_A)) B_A | C_B ((Bool,B_A)) (B_B ((Int,Char))) | C_C (B_B B_A) | C_D | C_E (((Char,Bool),B_A)) (B_B B_A)
data B_B a = C_F | C_G | C_H | C_I

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (((_,_),C_A _ _)) _ -> 0 
  C_A (((_,_),C_B _ _)) _ -> 1 
  C_A (((_,_),C_C _)) _ -> 2 
  C_A (((_,_),C_D)) _ -> 3 
  C_A (((_,_),C_E _ _)) _ -> 4 
  C_B _ _ -> 5 
  C_C _ -> 6 
  C_D -> 7 
  C_E _ _ -> 8 
