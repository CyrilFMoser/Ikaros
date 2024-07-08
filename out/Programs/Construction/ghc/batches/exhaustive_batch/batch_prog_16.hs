module Program_16 () where 

 main = print $ show v_b
data B_A a = C_A | C_B
data B_B = C_C ((Char,B_B)) (B_A B_B) | C_D (((Char,Int),Int)) | C_E

v_a :: B_A B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
