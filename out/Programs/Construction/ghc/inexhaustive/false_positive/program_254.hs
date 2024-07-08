module Program_8 () where 

 main = print $ show v_b
data B_B a b = C_D B_A B_A | C_E B_A B_A | C_F | C_G
data B_A = C_A (B_B B_A B_A) | C_B | C_C B_A

v_a :: B_B Int B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ _ -> 0 
  C_F -> 1 
  C_G -> 2 
