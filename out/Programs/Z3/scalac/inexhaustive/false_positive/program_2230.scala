package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D], c: Int) extends T_B[D]
case class CC_C(a: CC_A[Char], b: T_A[Byte], c: T_B[(Byte,Int)]) extends T_B[Boolean]
case class CC_D[E](a: T_B[E]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _, CC_B(_, _, _)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_C(CC_A(), CC_A(), CC_B(_, _, _)) => 2 
  case CC_B(CC_D(_), _, 12) => 3 
  case CC_B(_, _, 12) => 4 
  case CC_B(CC_D(_), _, _) => 5 
  case CC_B(CC_C(_, _, _), CC_A(), _) => 6 
  case CC_B(CC_B(_, _, _), _, _) => 7 
  case CC_B(CC_C(_, _, _), _, 12) => 8 
  case CC_D(CC_B(_, _, _)) => 9 
  case CC_D(_) => 10 
}
}
// This is not matched: (CC_D Boolean Wildcard (T_B Boolean))
// This is not matched: (CC_B Wildcard Wildcard T_B)