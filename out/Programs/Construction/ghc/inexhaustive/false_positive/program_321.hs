module Program_1 () where 

 main = print $ show v_b
data B_C d = C_F (B_C d) | C_G | C_H | C_I ((Int,Int)) Int
data B_B c = C_C | C_D Bool c | C_E Bool
data B_A a b = C_A | C_B Bool

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_G -> 1 
  C_H -> 2 
