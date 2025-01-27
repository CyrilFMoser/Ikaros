package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: Byte, b: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: CC_B, b: T_B) extends T_B
case class CC_D(a: ((CC_B,CC_A),T_B), b: T_A[T_A[T_B]]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _)) => 0 
  case CC_A(_, CC_D((_,_), _)) => 1 
  case CC_B(_, CC_C(_, _)) => 2 
  case CC_B(_, CC_D((_,_), CC_A(_, _))) => 3 
  case CC_B(_, CC_D((_,_), CC_B(_, _))) => 4 
}
}