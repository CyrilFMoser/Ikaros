module Program_20 () where 

main = print $ show v_b
data B_B c d = C_D | C_E Int
data B_A a b = C_A (B_A a b) | C_B ((((Char,Char),Bool),B_A ((Int,Int)) Int)) (B_A a Int) a | C_C Int

v_a :: C_B ((((Char,Char),Bool),B_A ((Int,Int)) Int)) (B_A Char Int) Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ (C_B _ _ _) _ -> 0 
  C_B _ (C_C _) _ -> 1 

--  This is not matched: C_B _ (C_A _) _