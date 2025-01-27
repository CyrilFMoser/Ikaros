package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_B, T_B], T_B]
case class CC_B(a: T_A[T_B, CC_A], b: Char, c: T_A[T_A[T_B, T_B], T_B]) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: T_A[T_A[T_B, T_B], T_B], c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, 'x', CC_A(_, _)), CC_A(_, CC_C()), _) => 1 
  case CC_D(CC_B(_, _, CC_A(_, _)), CC_A(_, CC_C()), _) => 2 
  case CC_D(CC_B(_, 'x', CC_B(_, _, _)), CC_A(_, CC_C()), _) => 3 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), CC_A(_, CC_C()), _) => 4 
  case CC_D(CC_B(_, 'x', CC_A(_, _)), CC_A(_, CC_D(_, _, _)), _) => 5 
  case CC_D(CC_B(_, _, CC_A(_, _)), CC_A(_, CC_D(_, _, _)), _) => 6 
  case CC_D(CC_B(_, 'x', CC_B(_, _, _)), CC_A(_, CC_D(_, _, _)), _) => 7 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), CC_A(_, CC_D(_, _, _)), _) => 8 
  case CC_D(CC_B(_, 'x', CC_A(_, _)), CC_B(_, _, CC_A(_, _)), _) => 9 
  case CC_D(CC_B(_, _, CC_A(_, _)), CC_B(_, _, CC_A(_, _)), _) => 10 
  case CC_D(CC_B(_, 'x', CC_B(_, _, _)), CC_B(_, _, CC_A(_, _)), _) => 11 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), CC_B(_, _, CC_A(_, _)), _) => 12 
  case CC_D(CC_B(_, 'x', CC_A(_, _)), CC_B(_, _, CC_B(_, _, _)), _) => 13 
  case CC_D(CC_B(_, _, CC_A(_, _)), CC_B(_, _, CC_B(_, _, _)), _) => 14 
  case CC_D(CC_B(_, 'x', CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _)), _) => 15 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), CC_B(_, _, CC_B(_, _, _)), _) => 16 
}
}