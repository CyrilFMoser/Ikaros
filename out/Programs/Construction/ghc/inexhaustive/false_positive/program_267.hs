module Program_19 () where 

 main = print $ show v_b
data B_C c = C_G
data B_B = C_C | C_D ((Int,(Int,Int))) | C_E | C_F ((Int,(Int,Bool)))
data B_A a b = C_A | C_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D ((_,(_,_))) -> 1 
  C_E -> 2 
