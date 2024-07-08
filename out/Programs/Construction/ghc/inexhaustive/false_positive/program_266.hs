module Program_18 () where 

 main = print $ show v_b
data B_D e = C_G | C_H e (B_A e e) | C_I (((Bool,Char),Bool)) | C_J (B_A e e) e
data B_A a b = C_A
data B_B c = C_B | C_C (B_D c) | C_D
data B_C d = C_E | C_F

v_a :: B_D Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_I (((_,_),_)) -> 1 
  C_J _ _ -> 2 
