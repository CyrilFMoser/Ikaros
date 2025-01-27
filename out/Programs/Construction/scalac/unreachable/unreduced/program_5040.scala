package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_C(a: (Byte,CC_A), b: T_B[T_B[T_A, CC_A], CC_A], c: Char) extends T_A
case class CC_D[C]() extends T_B[C, T_A]
case class CC_E[D](a: Char, b: (T_B[CC_C, T_A],T_B[CC_B, T_A])) extends T_B[CC_C, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_D()) => 1 
  case CC_B(CC_B(CC_A(), _), CC_D()) => 2 
  case CC_B(CC_B(CC_B(_, _), _), CC_D()) => 3 
  case CC_B(CC_C((_,_), _, _), CC_D()) => 4 
  case CC_C((_,CC_A()), _, _) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_C(_, _, _), _), CC_D())