module Program_23 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B | C_C
data B_B a = C_D a

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
