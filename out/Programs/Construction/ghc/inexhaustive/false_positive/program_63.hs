module Program_9 () where 

 main = print $ show v_b
data B_C d = C_F Int | C_G | C_H (B_B d d) Int | C_I (B_B d d) d
data B_A a = C_A | C_B
data B_B b c = C_C (B_C Int) | C_D ((Char,Bool)) | C_E

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_G -> 1 
  C_H (C_C (C_F _)) _ -> 2 
  C_H (C_C (C_H _ _)) _ -> 3 
  C_H (C_C (C_I _ _)) _ -> 4 
  C_H (C_D _) _ -> 5 
  C_H (C_E) _ -> 6 
  C_I _ _ -> 7 
