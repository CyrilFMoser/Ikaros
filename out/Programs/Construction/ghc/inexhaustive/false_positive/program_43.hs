module Program_19 () where 

 main = print $ show v_b
data B_B c d = C_E d d | C_F | C_G | C_H | C_I ((Int,Bool)) (B_B c c)
data B_A a b = C_A a | C_B (B_A a b) | C_C | C_D b

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G -> 1 
  C_H -> 2 
  C_I ((_,_)) (C_E _ _) -> 3 
  C_I ((_,_)) (C_F) -> 4 
  C_I ((_,_)) (C_G) -> 5 
  C_I ((_,_)) (C_H) -> 6 
  C_I ((_,_)) (C_I _ _) -> 7 
