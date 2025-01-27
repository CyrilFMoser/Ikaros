module Program_9 () where 

main = print $ show v_b
data B_B c = C_D | C_E ((B_A ((Bool,Int)) Bool,B_A Bool Int)) c c | C_F c (B_B c)
data B_A a b = C_A (B_A Int (B_A a a)) a | C_B | C_C Char (B_A a b) (B_A b b)

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E ((C_A _ _,C_A _ _)) _ _ -> 1 
  C_E ((C_A _ _,C_B)) _ _ -> 2 
  C_E ((C_A _ _,C_C _ _ _)) _ _ -> 3 
  C_E ((C_B,C_A _ _)) _ _ -> 4 
  C_E ((C_B,C_B)) _ _ -> 5 
  C_E ((C_B,C_C _ _ _)) _ _ -> 6 
  C_E ((C_C _ _ _,C_B)) _ _ -> 7 
  C_E ((C_C _ _ _,C_C _ _ _)) _ _ -> 8 
  C_F 'x' _ -> 9 
  C_F _ _ -> 10 

--  This is not matched: C_E ((C_C _ _ _,C_A _ _)) _ _