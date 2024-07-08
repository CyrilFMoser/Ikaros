module Program_31 () where 

 main = print $ show v_b
data B_B = C_B B_A | C_C | C_D B_A ((B_A,B_A))
data B_A = C_A B_A B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_A _ (C_D _ _)) ((C_A (C_A _ _) C_C,C_A _ (C_B _))) -> 0 
