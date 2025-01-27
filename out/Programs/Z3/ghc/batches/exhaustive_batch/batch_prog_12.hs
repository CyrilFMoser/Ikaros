module Program_12 () where 

main = print $ show v_b
data B_B b c = C_D | C_E b
data B_A a = C_A (B_A a) (B_B a a) (B_B a a) | C_B a (B_B a a) (B_A a) | C_C Char

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E _ -> 1 
