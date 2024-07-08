module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A ((Int,Int)) (B_A a b) | C_B Char | C_C | C_D (B_A b b) a | C_E
data B_C d = C_J (B_B d) | C_K (B_A d d) | C_L Bool
data B_B c = C_F ((Char,Int)) (B_A c c) | C_G ((Int,Bool)) | C_H c | C_I (B_B c) (((Bool,Char),(Int,Bool)))

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_K (C_A _ _) -> 1 
  C_K (C_B _) -> 2 
  C_K (C_D _ _) -> 3 
  C_K (C_E) -> 4 
  C_L _ -> 5 
