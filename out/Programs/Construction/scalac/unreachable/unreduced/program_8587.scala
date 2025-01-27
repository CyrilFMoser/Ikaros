package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: T_A[CC_B], b: T_A[T_A[Int]], c: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C(_, CC_B(_), _)) => 4 
  case CC_A(CC_C(_, CC_C(_, _, _), _)) => 5 
  case CC_B(_) => 6 
  case CC_C(_, _, _) => 7 
}
}
// This is not matched: CC_A(CC_C(_, CC_A(_), _))