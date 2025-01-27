package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Byte) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B]
case class CC_C(a: T_B, b: Boolean) extends T_A[T_A[T_B, T_B], T_B]
case class CC_D(a: Byte, b: ((CC_C,T_B),CC_C), c: T_B) extends T_B
case class CC_E(a: T_B, b: CC_C, c: T_A[T_A[CC_D, T_B], CC_A[Boolean]]) extends T_B
case class CC_F(a: Byte, b: T_A[T_A[T_B, T_B], T_B], c: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_D(_, (_,_), CC_D(_, _, _)), CC_C(_, _), _) => 1 
  case CC_E(CC_D(_, (_,_), CC_E(_, _, _)), CC_C(_, _), _) => 2 
  case CC_E(CC_D(_, (_,_), CC_F(_, _, _)), CC_C(_, _), _) => 3 
  case CC_E(CC_E(CC_D(_, _, _), CC_C(_, _), _), CC_C(_, _), _) => 4 
  case CC_E(CC_E(CC_E(_, _, _), CC_C(_, _), _), CC_C(_, _), _) => 5 
  case CC_E(CC_E(CC_F(_, _, _), CC_C(_, _), _), CC_C(_, _), _) => 6 
  case CC_E(CC_F(_, _, _), CC_C(_, _), _) => 7 
  case CC_F(_, CC_A(CC_D(_, _, _), _), _) => 8 
  case CC_F(_, CC_A(CC_E(_, _, _), _), _) => 9 
  case CC_F(_, CC_A(CC_F(_, _, _), _), _) => 10 
  case CC_F(_, CC_B(_, _), _) => 11 
  case CC_F(_, CC_C(CC_D(_, _, _), _), _) => 12 
  case CC_F(_, CC_C(CC_E(_, _, _), _), _) => 13 
}
}
// This is not matched: CC_F(_, CC_C(CC_F(_, _, _), _), _)