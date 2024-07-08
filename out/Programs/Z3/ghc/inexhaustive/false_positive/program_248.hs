module Program_30 () where 

 main = print $ show v_b
data B_A a = C_A (B_A a) ((Int,Int)) | C_B | C_C (B_A Int) | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ ((_,_)) -> 0 
  C_A (C_A (C_C _) _) _ -> 1 
  C_A (C_C (C_B)) ((_,_)) -> 2 
  C_A (C_C (C_B)) _ -> 3 
  C_A (C_C (C_A _ _)) ((_,_)) -> 4 
  C_A (C_A (C_D) ((_,_))) ((_,_)) -> 5 
  C_A (C_C (C_D)) _ -> 6 
  C_A (C_C (C_C _)) ((_,_)) -> 7 
