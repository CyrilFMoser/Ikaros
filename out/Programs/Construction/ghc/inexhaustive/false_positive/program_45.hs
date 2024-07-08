module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A B_B B_B | C_B (B_A a a) ((Bool,B_B))
data B_B = C_C (B_A B_B Bool) | C_D Char ((B_B,B_B)) | C_E B_B | C_F Char
data B_C c = C_G c

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ -> 0 
