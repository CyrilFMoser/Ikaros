module Program_2 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B | C_C | C_D Int | C_E B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C -> 1 
  C_D _ -> 2 
  C_E _ -> 3 
