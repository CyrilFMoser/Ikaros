module Program_8 () where 

 main = print $ show v_b
data B_A a = C_A (B_A Char) ((Int,Bool)) | C_B Int ((Char,(Bool,Bool))) | C_C a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _ _) _) ((_,_)) -> 0 
  C_A (C_A (C_B _ _) _) ((_,_)) -> 1 
  C_A (C_A (C_C _) _) ((_,_)) -> 2 
  C_A (C_B _ _) ((_,_)) -> 3 
  C_A (C_C _) ((_,_)) -> 4 
  C_B _ ((_,(_,_))) -> 5 
  C_C _ -> 6 
