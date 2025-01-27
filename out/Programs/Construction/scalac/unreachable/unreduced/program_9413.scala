package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_B, b: D, c: CC_A[D]) extends T_A[D, Boolean]
case class CC_C(a: T_A[T_B, Boolean], b: Char) extends T_A[CC_A[CC_A[T_B]], Boolean]
case class CC_D(a: T_B, b: T_A[Char, CC_A[(Int,Byte)]], c: T_A[T_B, Boolean]) extends T_B
case class CC_E(a: CC_C) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B(_, _, _)) => 0 
  case CC_E(CC_C(CC_A(), 'x')) => 1 
  case CC_E(CC_C(CC_A(), _)) => 2 
  case CC_E(CC_C(CC_B(_, _, _), 'x')) => 3 
  case CC_E(CC_C(CC_B(_, _, _), _)) => 4 
  case CC_F(_) => 5 
}
}
// This is not matched: CC_D(_, _, CC_A())