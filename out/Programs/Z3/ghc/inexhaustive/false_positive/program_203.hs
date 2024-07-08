module Program_19 () where 

 main = print $ show v_b
data B_B b c = C_D c b | C_E b
data B_A a = C_A a a | C_B (B_B a a) (B_B a a) | C_C

v_a :: B_B Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
