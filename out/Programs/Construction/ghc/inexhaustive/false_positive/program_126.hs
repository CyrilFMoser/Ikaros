module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_B a b) (B_A a a) | C_C Bool (B_A a a) | C_D a
data B_B c d = C_E d | C_F d (B_B c c) | C_G | C_H d ((Char,Int)) | C_I (B_B d d) Int

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F _ _ -> 1 
  C_H _ _ -> 2 
  C_I _ _ -> 3 
