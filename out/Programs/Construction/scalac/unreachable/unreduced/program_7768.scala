package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E) extends T_A[E]
case class CC_C() extends T_A[T_A[CC_A[Int]]]
case class CC_D(a: CC_A[CC_B[CC_C]], b: (CC_A[CC_C],CC_B[CC_C]), c: Boolean) extends T_B[(CC_B[Boolean],Int), Boolean]
case class CC_E[F](a: (Byte,CC_B[Byte])) extends T_B[(CC_B[Boolean],Int), Boolean]
case class CC_F(a: T_B[CC_D, CC_A[CC_C]]) extends T_B[(CC_B[Boolean],Int), Boolean]

val v_a: T_A[T_B[(CC_B[Boolean],Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_D(CC_A(_, _), _, _)) => 1 
  case CC_B(_, CC_F(_)) => 2 
}
}
// This is not matched: CC_B(_, CC_E((_,_)))