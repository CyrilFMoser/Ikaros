package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: T_B[T_B[Byte]]) extends T_B[CC_B]
case class CC_F[B](a: CC_E) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_B(_))