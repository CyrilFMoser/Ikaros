module Program_1 () where 

 main = print $ show v_b
data B_B b = C_B | C_C | C_D | C_E (B_B b) ((Int,Char)) | C_F
data B_A a = C_A (B_B a) a

v_a :: B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C -> 1 
  C_E _ _ -> 2 
  C_F -> 3 
