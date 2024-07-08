module Program_13 () where 

main = print $ show v_b
data B_A a b = C_A (B_A a a) | C_B (B_A b Char) (B_A b b) | C_C ((Char,Int)) b | C_D b (B_A b b)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((_,_)) _ -> 0 
