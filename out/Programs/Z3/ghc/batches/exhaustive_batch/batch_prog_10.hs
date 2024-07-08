module Program_10 () where 

main = print $ show v_b
data B_B b c = C_E
data B_A a = C_A (B_A a) (B_A Int) | C_B | C_C (B_B a a) | C_D (B_B a ((Bool,Bool))) (B_A a)

v_a :: B_B Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
