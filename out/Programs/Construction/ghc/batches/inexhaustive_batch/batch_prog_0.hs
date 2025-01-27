module Program_0 () where 

main = print $ show v_b
data B_A a b = C_A a b | C_B ((B_A Bool Int,Char)) | C_C (B_A a a) Int

v_a :: B_A Bool Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((C_A _ _,_)) -> 0 
  C_B ((C_B _,_)) -> 1 
  C_B ((C_C _ _,_)) -> 2 
  C_C _ _ -> 3 

--  This is not matched: C_A _ _