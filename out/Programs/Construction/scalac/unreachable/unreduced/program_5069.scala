package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (Char,T_B)]
case class CC_B[D](a: D, b: (T_A[T_B, T_B],CC_A[T_B])) extends T_A[D, (Char,T_B)]
case class CC_C[E]() extends T_A[E, (Char,T_B)]

val v_a: T_A[Char, (Char,T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,CC_A())) => 1 
}
}
// This is not matched: CC_C()