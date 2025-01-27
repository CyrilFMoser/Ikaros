package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_B(CC_B(CC_A(_), _), _) => 1 
  case CC_B(CC_B(CC_B(_, _), _), _) => 2 
}
}
// This is not matched: CC_A(_)