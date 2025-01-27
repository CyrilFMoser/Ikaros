package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Byte) extends T_A[Byte]
case class CC_B(a: T_A[CC_A]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
}
}
// This is not matched: CC_B(_)