module Program_29 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) | C_B ((Char,Int)) | C_C (B_A a) ((Int,Bool)) | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_B _ -> 1 
  C_A (C_D) -> 2 
  C_A (C_A (C_D)) -> 3 
  C_A (C_A (C_B _)) -> 4 
  C_A (C_C (C_B _) _) -> 5 
  C_A (C_C (C_D) _) -> 6 
  C_A (C_C _ ((_,_))) -> 7 
  C_A (C_C (C_B _) ((_,_))) -> 8 
  C_C (C_B _) _ -> 9 
  C_C (C_C (C_C _ _) _) ((_,_)) -> 10 
  C_C (C_C _ ((_,_))) _ -> 11 
