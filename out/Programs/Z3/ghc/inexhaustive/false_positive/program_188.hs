module Program_6 () where 

 main = print $ show v_b
data B_A = C_A ((Int,Bool)) Char | C_B B_A | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A ((_,_)) _ -> 0 
  C_B (C_B C_C) -> 1 
