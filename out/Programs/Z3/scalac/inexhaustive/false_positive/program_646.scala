package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[D], c: D) extends T_B[D]
case class CC_C[E](a: T_A[E]) extends T_B[T_B[Int]]
case class CC_D() extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_) => 1 
  case CC_C(CC_A()) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
  case CC_B(_, CC_B(_, _, _), _) => 4 
  case CC_B(_, CC_D(), CC_B(_, _, _)) => 5 
  case CC_B(_, CC_C(_), CC_B(_, _, _)) => 6 
  case CC_B(CC_A(), _, _) => 7 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(CC_A(), CC_D(), CC_B(_, _, _)) => 9 
  case CC_B(CC_A(), CC_D(), _) => 10 
  case CC_B(CC_A(), CC_C(_), _) => 11 
  case CC_B(_, CC_D(), _) => 12 
}
}
// This is not matched: (CC_C (T_B Boolean) Wildcard (T_B (T_B Int)))
// This is not matched: (CC_B Char (T_A Char))