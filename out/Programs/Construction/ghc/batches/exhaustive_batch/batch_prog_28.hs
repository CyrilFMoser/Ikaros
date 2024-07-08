module Program_28 () where 

 main = print $ show v_b
data B_B c d = C_E (B_C d) (B_B c c)
data B_C e = C_F ((Bool,Char)) | C_G (B_C ((Bool,Int))) (B_A e e) | C_H
data B_A a b = C_A | C_B b | C_C b (B_C b) | C_D a (B_C a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ -> 1 
  C_C _ _ -> 2 
  C_D _ _ -> 3 
