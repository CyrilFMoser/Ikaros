module Program_11 () where 

 main = print $ show v_b
data B_A a = C_A ((Int,(Int,Int))) | C_B (B_A a) | C_C

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_A ((_,(_,_))) -> 1 
  C_B (C_B (C_C)) -> 2 
  C_B (C_B _) -> 3 
  C_B (C_A _) -> 4 
