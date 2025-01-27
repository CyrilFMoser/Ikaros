package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Char, Char], T_B[Byte, Boolean]]) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]], T_A[Char, T_A[Boolean, Int]]]
case class CC_B(a: T_A[CC_A, Int], b: Char, c: T_B[T_A[CC_A, (Boolean,Boolean)], T_A[Byte, CC_A]]) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]], T_A[Char, T_A[Boolean, Int]]]
case class CC_C[E]() extends T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]], T_A[Char, T_A[Boolean, Int]]]
case class CC_D[F, G]() extends T_B[F, G]

val v_a: T_A[T_B[T_B[Boolean, Boolean], T_B[Boolean, Int]], T_A[Char, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_D()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)