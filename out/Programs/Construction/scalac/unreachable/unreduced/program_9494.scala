package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[T_B, T_B], T_B]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[CC_A[CC_A[T_B]], CC_A[CC_A[T_B]]], CC_A[CC_A[T_B]]]
case class CC_C(a: (T_B,T_A[T_B, CC_B]), b: CC_B, c: CC_A[T_B]) extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, CC_C]], b: T_B, c: Byte) extends T_B
case class CC_E(a: CC_A[Int], b: T_A[T_A[CC_A[CC_D], CC_A[CC_D]], CC_A[CC_D]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(), CC_A(CC_A(_))) => 0 
  case CC_D(_, CC_C(_, _, _), _) => 1 
  case CC_D(_, CC_D(_, CC_C(_, _, _), _), _) => 2 
  case CC_D(_, CC_D(_, CC_D(_, _, _), _), _) => 3 
  case CC_D(_, CC_D(_, CC_E(_, _), _), _) => 4 
  case CC_D(_, CC_E(CC_A(_), CC_A(_)), _) => 5 
  case CC_E(CC_A(_), _) => 6 
}
}