module Program_14 () where 

 main = print $ show v_b
data B_B c d = C_F c (B_A d d) | C_G
data B_C e = C_H (B_D e Char)
data B_D f g = C_I | C_J (B_A Int g) | C_K Char | C_L (B_C g)
data B_A a b = C_A (B_A b b) | C_B (B_C b) a | C_C (B_A b Char) b | C_D ((Bool,Int)) ((Bool,Char)) | C_E

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
