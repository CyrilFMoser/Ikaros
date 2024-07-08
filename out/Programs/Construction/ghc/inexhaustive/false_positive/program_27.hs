module Program_5 () where 

 main = print $ show v_b
data B_B b c = C_C (B_B b c) c | C_D ((Char,Int)) (B_A b) | C_E ((Bool,(Char,Int))) (B_B c c)
data B_A a = C_A ((Char,Int)) a | C_B a
data B_C d e = C_F (B_A d) (B_A Char) | C_G (B_B d e) | C_H e (B_B e e) | C_I ((Int,Int)) | C_J

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ -> 0 
  C_D ((_,_)) (C_A _ _) -> 1 
  C_D ((_,_)) (C_B _) -> 2 
