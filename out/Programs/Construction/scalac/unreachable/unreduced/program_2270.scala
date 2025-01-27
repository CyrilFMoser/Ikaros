package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Byte, c: T_A) extends T_A
case class CC_C(a: T_A, b: T_B[(Char,T_A), T_B[T_A, CC_A]]) extends T_A
case class CC_D[C]() extends T_B[T_B[C, C], C]
case class CC_E(a: Boolean, b: T_B[T_B[CC_D[T_A], CC_D[T_A]], CC_D[T_A]], c: CC_B) extends T_B[T_B[T_B[CC_C, Byte], T_B[CC_C, Byte]], T_B[CC_C, Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 2 
  case CC_C(CC_A(), _) => 3 
  case CC_C(CC_B(CC_A(), _, CC_A()), _) => 4 
  case CC_C(CC_B(CC_A(), _, CC_B(_, _, _)), _) => 5 
  case CC_C(CC_B(CC_A(), _, CC_C(_, _)), _) => 6 
  case CC_C(CC_C(_, _), _) => 7 
}
}
// This is not matched: CC_B(CC_A(), _, CC_C(_, _))