module Program_11 () where 

 main = print $ show v_b
data B_C a b = C_C | C_D B_A | C_E B_B B_B | C_F Int (B_C a b) | C_G
data B_A = C_A B_A
data B_B = C_B

v_a :: B_C Bool B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D _ -> 1 
  C_F _ _ -> 2 
  C_G -> 3 
