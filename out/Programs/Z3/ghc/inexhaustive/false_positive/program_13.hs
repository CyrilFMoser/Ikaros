module Program_20 () where 

 main = print $ show v_b
data B_A = C_A | C_B ((B_A,B_A))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((C_B _,C_A)) -> 0 
  C_B ((C_A,C_B ((_,_)))) -> 1 
  C_B ((C_B _,C_B ((_,_)))) -> 2 
