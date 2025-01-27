package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H](a: T_A[H, H], b: T_B[H], c: T_A[H, H]) extends T_A[H, T_A[H, H]]
case class CC_D(a: CC_B[Boolean, CC_C[Int]], b: Int) extends T_B[CC_B[T_B[Char], T_A[Boolean, (Char,Boolean)]]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, CC_A()) => 1 
  case CC_C(_, _, CC_B()) => 2 
}
}
// This is not matched: CC_B()