module Program_3 () where 

main = print $ show v_b
data B_A a b = C_A Bool (B_A (B_A (B_B Int) (B_B Int)) (B_A (B_B Int) (B_B Int)))
data B_B c = C_B (B_B c) (B_A (((Char,Bool),Bool)) c)

v_a :: C_B (B_B Bool) (B_A (((Char,Bool),Bool)) Bool)
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ (C_A _ _) -> 0 
