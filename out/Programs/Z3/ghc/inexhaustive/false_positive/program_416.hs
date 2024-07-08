module Program_0 () where 

 main = print $ show v_b
data B_B b c = C_E (B_B c c) | C_F b (B_A c)
data B_A a = C_A (B_A a) (B_B a a) | C_B ((Bool,Int)) | C_C Char (B_B a a) | C_D

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_E (C_E (C_F _ _)) -> 1 
