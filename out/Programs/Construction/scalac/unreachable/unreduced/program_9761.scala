package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[D, C], c: T_A[T_B, D]) extends T_A[C, T_B]
case class CC_B[E](a: E, b: T_B, c: Char) extends T_A[E, T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[Boolean, T_B], b: ((T_B,CC_C),Int), c: CC_C) extends T_B
case class CC_E(a: Char, b: CC_B[(CC_C,CC_C)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(CC_C(), _, _), ((_,_),_), CC_C()) => 1 
  case CC_D(CC_A(CC_D(_, _, _), _, _), ((_,_),_), CC_C()) => 2 
  case CC_D(CC_A(CC_E(_, _), _, _), ((_,_),_), CC_C()) => 3 
  case CC_D(CC_B(_, CC_C(), _), ((_,_),_), CC_C()) => 4 
  case CC_D(CC_B(_, CC_D(_, _, _), _), ((_,_),_), CC_C()) => 5 
  case CC_D(CC_B(_, CC_E(_, _), _), ((_,_),_), CC_C()) => 6 
  case CC_E(_, CC_B((_,_), CC_C(), _)) => 7 
  case CC_E(_, CC_B((_,_), CC_D(_, _, _), _)) => 8 
  case CC_E(_, CC_B((_,_), CC_E(_, _), _)) => 9 
}
}