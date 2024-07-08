module Program_10 () where 

 main = print $ show v_b
data B_A a b = C_A B_B B_C
data B_C = C_E
data B_B = C_B B_B ((B_B,B_C)) | C_C | C_D

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
