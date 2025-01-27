module Program_21 () where 

main = print $ show v_b
data B_B b c = C_C Bool (B_A b) Bool
data B_A a = C_A a a (B_A a) | C_B (B_B a a)

v_a :: B_B Int Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_B (C_C _ _ _)) _ -> 0 

--  This is not matched: C_C _ (C_A _ _ _) _