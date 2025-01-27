package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[E, F]
case class CC_B(a: T_A[CC_A[Byte, Boolean, Int], T_A[Int, Boolean]], b: T_A[T_A[(Byte,Char), Char], Boolean], c: T_A[T_B[Byte, Boolean], CC_A[Int, Byte, Char]]) extends T_A[T_A[Char, T_A[Boolean, (Byte,Boolean)]], T_A[CC_A[Int, Int, Int], T_B[Int, Byte]]]
case class CC_C(a: CC_B, b: T_B[T_B[CC_B, CC_B], Char]) extends T_B[T_A[T_A[(Char,Char), CC_B], T_B[Int, CC_B]], T_A[T_A[Int, Byte], Byte]]
case class CC_D[H](a: T_A[CC_A[H, H, H], CC_C], b: H, c: CC_C) extends T_B[T_A[T_A[(Char,Char), CC_B], T_B[Int, CC_B]], T_A[T_A[Int, Byte], Byte]]
case class CC_E(a: Char, b: Char) extends T_B[T_A[T_A[(Char,Char), CC_B], T_B[Int, CC_B]], T_A[T_A[Int, Byte], Byte]]

val v_a: T_B[T_A[T_A[(Char,Char), CC_B], T_B[Int, CC_B]], T_A[T_A[Int, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(CC_B(_, _, _), _)) => 0 
  case CC_E('x', 'x') => 1 
  case CC_E(_, 'x') => 2 
  case CC_E('x', _) => 3 
  case CC_E(_, _) => 4 
}
}
// This is not matched: CC_C(_, _)