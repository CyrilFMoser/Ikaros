package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[D, C, E](a: CC_A) extends T_B[D, C]
case class CC_D[F](a: Char, b: F) extends T_B[F, CC_B]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_D('x', 0) => 0 
  case CC_D(_, _) => 1 
  case CC_D('x', _) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: (CC_C Byte (CC_B T_A) T_A Wildcard (T_B Byte (CC_B T_A)))
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Byte)))