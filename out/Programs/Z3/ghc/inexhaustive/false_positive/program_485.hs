module Program_9 () where 

main = print $ show v_b
data B_A a b = C_A | C_B
data B_B c = C_C | C_D

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
