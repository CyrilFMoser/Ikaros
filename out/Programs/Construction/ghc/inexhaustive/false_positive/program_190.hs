module Program_8 () where 

 main = print $ show v_b
data B_A a = C_A ((Int,Int)) (B_A a) | C_B | C_C (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C (C_A ((_,_)) (C_A _ _)) -> 2 
  C_C (C_A ((_,_)) (C_B)) -> 3 
  C_C (C_A ((_,_)) (C_C _)) -> 4 
  C_C (C_B) -> 5 
  C_C (C_C (C_A _ _)) -> 6 
  C_C (C_C (C_B)) -> 7 
