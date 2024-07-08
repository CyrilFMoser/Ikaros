module Program_6 () where 

 main = print $ show v_b
data B_B c = C_C (B_C c c) | C_D (B_A c ((Bool,Bool))) Bool | C_E (B_B c) | C_F (B_B c)
data B_C d e = C_G Bool (B_C e e) | C_H e | C_I | C_J ((Bool,Char)) | C_K
data B_A a b = C_A (B_C b b) | C_B ((Bool,Bool))

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ -> 0 
  C_D _ _ -> 1 
  C_E _ -> 2 
