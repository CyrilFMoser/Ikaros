module Program_17 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((Bool,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B ((_,C_B _)) -> 1 
