module Program_18 () where 

 main = print $ show v_b
data B_A a b = C_A ((Int,B_B)) B_C | C_B | C_C B_C | C_D (B_A a b) | C_E b
data B_B = C_F Int | C_G ((B_B,(Bool,Char))) | C_H (B_A Char B_B) B_B
data B_C = C_I B_B | C_J ((B_C,B_B)) | C_K

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
  C_H _ (C_F _) -> 1 
  C_H _ (C_G _) -> 2 
  C_H _ (C_H _ _) -> 3 
