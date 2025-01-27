package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Char, Char], T_A[Boolean, Char]]]
case class CC_B(a: (T_A[Char, (Int,Char)],CC_A[(Boolean,Int)])) extends T_A[Char, T_A[T_A[Char, Char], T_A[Boolean, Char]]]
case class CC_C() extends T_A[Char, T_A[T_A[Char, Char], T_A[Boolean, Char]]]

val v_a: T_A[Char, T_A[T_A[Char, Char], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
  case CC_C() => 2 
}
}