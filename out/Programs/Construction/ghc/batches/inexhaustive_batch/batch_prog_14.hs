module Program_14 () where 

main = print $ show v_b
data B_B = C_C | C_D B_B Char | C_E B_B Int (B_A Char Bool)
data B_A a b = C_A B_B B_B Bool | C_B ((Bool,B_B)) ((B_A B_B B_B,Int))

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ _ -> 0 

--  This is not matched: C_B _ _