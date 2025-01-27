package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Char, c: T_A[C]) extends T_A[C]
case class CC_B() extends T_B[T_A[Int]]
case class CC_C() extends T_B[T_A[Int]]
case class CC_D(a: T_A[T_A[CC_B]], b: T_B[T_A[Int]], c: T_B[CC_B]) extends T_B[T_A[Int]]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_A(CC_C(), _, _) => 1 
  case CC_A(CC_D(CC_A(_, _, _), CC_B(), _), _, _) => 2 
  case CC_A(CC_D(CC_A(_, _, _), CC_C(), _), _, _) => 3 
  case CC_A(CC_D(CC_A(_, _, _), CC_D(_, _, _), _), _, _) => 4 
}
}