package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_B) extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[((Int,Byte),Int), Char], c: CC_A[T_B]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Int, b: CC_A[CC_B], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_, _, _), _), _, _) => 0 
  case CC_B(CC_A(_, CC_C(), _), _, _) => 1 
  case CC_B(CC_A(_, CC_D(_, _, _), _), _, _) => 2 
  case CC_C() => 3 
  case CC_D(_, _, CC_B(_, _, _)) => 4 
  case CC_D(_, _, CC_C()) => 5 
  case CC_D(_, _, CC_D(_, CC_A(_, _, _), CC_B(_, _, _))) => 6 
  case CC_D(_, _, CC_D(_, CC_A(_, _, _), CC_C())) => 7 
  case CC_D(_, _, CC_D(_, CC_A(_, _, _), CC_D(_, _, _))) => 8 
}
}