package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_A[T_B]) extends T_A[Byte]
case class CC_B(a: T_A[CC_A], b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: CC_B, b: T_A[Char], c: (CC_A,T_B)) extends T_B
case class CC_D(a: CC_C, b: CC_C, c: CC_A) extends T_B
case class CC_E(a: Char, b: CC_C, c: (CC_D,T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_, _, _), _)