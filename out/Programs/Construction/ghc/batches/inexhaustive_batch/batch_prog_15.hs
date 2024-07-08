module Program_15 () where 

 main = print $ show v_b
data B_B c d = C_B | C_C ((Int,Int)) | C_D Bool (B_C c d)
data B_C e f = C_E (B_B f f) | C_F (B_A Bool f) (B_C f f)
data B_A a b = C_A a (B_C a Char)

v_a :: B_B Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C ((_,_)) -> 1 
