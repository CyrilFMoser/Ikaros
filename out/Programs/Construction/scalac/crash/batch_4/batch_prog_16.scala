package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],Boolean), b: T_A[T_A[Int]], c: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B[B](a: B) extends T_A[B]
case class CC_C(a: (CC_B[CC_A],CC_A), b: Boolean) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(CC_B(_)), _) => 1 
  case CC_A(_, CC_C((_,_), _), _) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_C(_, _) => 4 
}
}