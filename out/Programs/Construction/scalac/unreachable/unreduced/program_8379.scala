package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_B[Boolean, Boolean], T_A[Char, Char]], E]
case class CC_B(a: T_B[CC_A[Boolean], T_A[Int, (Boolean,Boolean)]], b: T_B[Char, T_A[Char, Boolean]], c: CC_A[CC_A[Byte]]) extends T_A[T_B[T_B[Boolean, Boolean], T_A[Char, Char]], CC_A[CC_A[Byte]]]
case class CC_C() extends T_A[T_B[T_B[Boolean, Boolean], T_A[Char, Char]], CC_A[CC_A[Byte]]]
case class CC_D[F]() extends T_B[CC_B, F]
case class CC_E[G]() extends T_B[CC_B, G]

val v_a: T_A[T_B[T_B[Boolean, Boolean], T_A[Char, Char]], CC_A[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}
// This is not matched: CC_C()