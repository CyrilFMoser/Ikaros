module Program_26 () where 

 main = print $ show v_b
data B_C c = C_D B_A c | C_E Int B_A | C_F
data B_B a b = C_B | C_C Bool
data B_D d = C_G (B_C d)
data B_A = C_A Int

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
