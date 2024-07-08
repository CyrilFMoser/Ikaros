module Program_5 () where 

 main = print $ show v_b
data B_B = C_C ((B_D,B_B)) B_B | C_D (B_A B_B B_B) (B_C B_B) | C_E | C_F B_D Int
data B_A a b = C_A b | C_B B_D
data B_D = C_L ((B_B,B_B)) | C_M B_D Int | C_N | C_O
data B_C c = C_G c ((B_B,B_B)) | C_H c | C_I | C_J (((Int,Int),(Int,Int))) Int | C_K ((Int,B_D)) ((B_D,(Char,Char)))

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_M _ _ -> 0 
  C_N -> 1 
  C_O -> 2 
