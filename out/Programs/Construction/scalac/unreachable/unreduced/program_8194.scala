package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, Boolean], b: T_B[(Char,Char), T_A[Boolean]]) extends T_A[T_A[Int]]
case class CC_B(a: (T_A[CC_A],Int), b: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: Char, b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_D[D]() extends T_B[CC_A, D]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_, _)) => 2 
  case CC_C(_, CC_B((_,_), CC_A(_, _))) => 3 
  case CC_C(_, CC_C('x', _)) => 4 
  case CC_C(_, CC_C(_, _)) => 5 
}
}