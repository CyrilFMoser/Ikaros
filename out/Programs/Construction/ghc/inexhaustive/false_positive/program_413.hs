module Program_7 () where 

 main = print $ show v_b
data B_A = C_A B_A | C_B B_A Int | C_C ((B_A,B_A)) B_A | C_D | C_E Char B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C _ _ -> 1 
  C_D -> 2 
  C_E _ _ -> 3 
