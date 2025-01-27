package Program_12 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B() extends T_A
case class CC_C[B, C](a: T_A) extends T_B[B]
case class CC_D[D](a: CC_B, b: CC_C[D, D], c: T_A) extends T_B[D]
case class CC_E() extends T_B[(CC_A,T_A)]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(), CC_C(_), _) => 1 
  case CC_D(CC_B(), _, _) => 2 
  case CC_D(_, CC_C(_), _) => 3 
  case CC_D(_, _, CC_A(_)) => 4 
  case CC_D(CC_B(), CC_C(_), CC_B()) => 5 
  case CC_D(CC_B(), _, CC_A(_)) => 6 
  case CC_D(_, _, CC_B()) => 7 
  case CC_D(CC_B(), _, CC_B()) => 8 
}
}
// This is not matched: (CC_C T_A (T_B T_A) Wildcard (T_B T_A))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char)))