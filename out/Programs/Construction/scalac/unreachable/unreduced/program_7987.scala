package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[CC_A[Int]], b: T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], T_A[Char, Boolean]], c: T_A[CC_A[Boolean], CC_A[Boolean]]) extends T_A[T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]], CC_A[(Byte,Boolean)]]
case class CC_C(a: CC_B, b: Byte, c: Char) extends T_A[T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]], CC_A[(Byte,Boolean)]]

val v_a: T_A[T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]], CC_A[(Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C(CC_B(CC_A(_), _, _), _, 'x') => 2 
}
}
// This is not matched: CC_C(CC_B(CC_A(_), _, _), _, _)