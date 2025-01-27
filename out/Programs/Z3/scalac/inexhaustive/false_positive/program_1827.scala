package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: CC_A[D], b: Boolean) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(CC_B(_, _), _) => 3 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Wildcard Wildcard (T_A Int (T_A Byte Char)))