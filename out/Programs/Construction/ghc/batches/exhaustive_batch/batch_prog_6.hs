module Program_6 () where 

main = print $ show v_b
data B_A a b = C_A (B_A a Bool) a | C_B Int | C_C

v_a :: C_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
