module Program_27 () where 

 main = print $ show v_b
data B_B c = C_B (B_A c c) ((Bool,Char))
data B_A a b = C_A (B_A a a)

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
