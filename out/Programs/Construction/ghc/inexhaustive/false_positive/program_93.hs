module Program_7 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B ((B_B,B_B)) | C_C ((Bool,B_B)) | C_D ((B_B,B_B)) (B_A a b)
data B_B = C_E Bool | C_F (B_C B_B) | C_G (B_C ((Char,Bool))) B_B | C_H ((B_B,B_B)) ((B_B,Int))
data B_C c = C_I c | C_J ((B_B,B_B)) Int | C_K | C_L | C_M

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J _ _ -> 1 
  C_K -> 2 
  C_M -> 3 
