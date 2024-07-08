module Program_23 () where 

 main = print $ show v_b
data B_B c d = C_C ((Int,Bool)) | C_D
data B_A a b = C_A b a | C_B

v_a :: B_B Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
