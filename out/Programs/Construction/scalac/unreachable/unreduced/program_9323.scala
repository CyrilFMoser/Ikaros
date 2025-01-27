package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[C, T_A[Boolean, T_A[Boolean, T_B]]]
case class CC_B(a: CC_A[T_A[T_B, T_B]], b: Byte) extends T_B
case class CC_C(a: (T_A[T_B, CC_B],((Byte,Boolean),T_B)), b: CC_B, c: CC_A[CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), 12) => 0 
  case CC_A(CC_C((_,_), CC_B(_, _), _), 12) => 1 
  case CC_A(CC_D(), 12) => 2 
  case CC_A(CC_B(_, _), _) => 3 
  case CC_A(CC_C((_,_), CC_B(_, _), _), _) => 4 
  case CC_A(CC_D(), _) => 5 
}
}