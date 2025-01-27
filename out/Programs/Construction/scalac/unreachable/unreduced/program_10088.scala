package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: C) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_A[(Char,Char)], b: T_B[Boolean]) extends T_A[T_A[T_A[Int]]]
case class CC_D() extends T_B[CC_A[CC_B[CC_C]]]
case class CC_E(a: Int, b: T_A[T_A[CC_D]], c: Int) extends T_B[CC_A[CC_B[CC_C]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 1 
  case CC_A(_, CC_B(), CC_B()) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: CC_A(_, CC_B(), CC_A(_, _, _))