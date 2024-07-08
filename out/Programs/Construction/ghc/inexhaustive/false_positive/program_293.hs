module Program_13 () where 

 main = print $ show v_b
data B_B b c = C_F (B_C c c) (B_A c) | C_G | C_H | C_I (B_B Int Int) (B_C b b)
data B_C d e = C_J (B_A e) (B_A d) | C_K | C_L Int (B_A e) | C_M (((Bool,Int),Bool)) Int
data B_A a = C_A ((Int,Char)) | C_B a | C_C (B_A a) a | C_D | C_E (B_A a)

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_C _ _ -> 1 
  C_D -> 2 
  C_E _ -> 3 
