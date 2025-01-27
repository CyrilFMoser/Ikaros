package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Boolean, Byte], T_A[Boolean, Boolean]]]
case class CC_B(a: T_B[T_B[Byte, (Char,Boolean)], T_B[Int, Char]], b: T_A[CC_A[Int], T_B[Int, Byte]]) extends T_A[T_B[T_B[Byte, Char], T_A[Byte, Int]], T_B[T_A[Boolean, Byte], T_A[Boolean, Boolean]]]
case class CC_C(a: CC_A[CC_A[(Boolean,Int)]], b: Byte) extends T_A[T_B[T_B[Byte, Char], T_A[Byte, Int]], T_B[T_A[Boolean, Byte], T_A[Boolean, Boolean]]]
case class CC_D[F, G](a: Byte, b: (CC_A[Boolean],Boolean)) extends T_B[F, G]
case class CC_E[H](a: CC_D[H, H], b: T_A[H, H], c: T_A[H, H]) extends T_B[Int, H]

val v_a: T_A[T_B[T_B[Byte, Char], T_A[Byte, Int]], T_B[T_A[Boolean, Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)