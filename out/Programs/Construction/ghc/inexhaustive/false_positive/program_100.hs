module Program_12 () where 

 main = print $ show v_b
data B_C e = C_F e ((Bool,Int)) | C_G (B_B e e) | C_H e | C_I | C_J (B_A e e)
data B_A a b = C_A (B_A a a) | C_B ((Bool,Bool)) | C_C | C_D
data B_B c d = C_E

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _) -> 0 
  C_A (C_B _) -> 1 
  C_A (C_C) -> 2 
  C_A (C_D) -> 3 
  C_B _ -> 4 
  C_C -> 5 
