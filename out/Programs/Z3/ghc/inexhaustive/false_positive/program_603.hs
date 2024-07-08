module Program_29 () where 

main = print $ show v_b
data B_A = C_A Char B_A | C_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_A _ _) -> 0 
  C_A _ C_B -> 1 
