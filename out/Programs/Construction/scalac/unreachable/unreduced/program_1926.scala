package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_B) extends T_A[T_A[C, C], C]
case class CC_B(a: (Char,CC_A[T_B]), b: T_B) extends T_B
case class CC_C(a: CC_B, b: CC_B, c: T_A[Byte, CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _)), CC_B((_,_), _)) => 0 
  case CC_B((_,CC_A(_, _)), CC_C(CC_B(_, _), CC_B(_, _), _)) => 1 
  case CC_B((_,CC_A(_, _)), CC_D()) => 2 
  case CC_C(CC_B(_, _), CC_B(_, CC_B(_, _)), _) => 3 
  case CC_C(CC_B(_, _), CC_B(_, CC_C(_, _, _)), _) => 4 
  case CC_C(CC_B(_, _), CC_B(_, CC_D()), _) => 5 
  case CC_D() => 6 
}
}