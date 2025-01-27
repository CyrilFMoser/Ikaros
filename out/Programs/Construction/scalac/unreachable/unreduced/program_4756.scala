package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: (T_B[T_A, T_A],T_A), c: ((T_A,Char),T_A)) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: Int, b: CC_A, c: T_B[CC_A, T_B[CC_A, T_A]]) extends T_A
case class CC_D[C](a: CC_A, b: T_A) extends T_B[T_A, C]

val v_a: CC_D[T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_D(CC_A(_, _, _), CC_B(_)) => 1 
  case CC_D(CC_A(_, _, _), CC_C(_, CC_A(_, _, _), _)) => 2 
}
}