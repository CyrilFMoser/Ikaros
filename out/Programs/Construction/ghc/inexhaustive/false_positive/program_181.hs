module Program_28 () where 

 main = print $ show v_b
data B_B = C_F | C_G Int | C_H ((Int,Char)) | C_I | C_J
data B_C a b = C_K | C_L | C_M B_B Bool
data B_A = C_A (B_C B_A B_B) B_B | C_B Int | C_C (B_C B_B Char) | C_D | C_E (B_C ((Int,Int)) B_B) ((B_A,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G _ -> 1 
  C_H _ -> 2 
  C_J -> 3 
