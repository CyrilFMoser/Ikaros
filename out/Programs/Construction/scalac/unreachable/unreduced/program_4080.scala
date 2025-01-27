package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, (T_B,T_B)], b: T_A[T_B, (T_B,T_B)]) extends T_A[T_B, (T_B,T_B)]
case class CC_B(a: T_A[T_A[T_B, (Boolean,Char)], CC_A], b: T_A[CC_A, Boolean]) extends T_A[T_B, (T_B,T_B)]
case class CC_C(a: CC_A, b: T_B, c: T_A[T_B, (T_B,T_B)]) extends T_A[T_B, (T_B,T_B)]
case class CC_D(a: (T_B,T_A[CC_A, (Char,Boolean)]), b: T_A[CC_B, Char], c: Boolean) extends T_B
case class CC_E(a: T_B, b: T_A[Char, T_A[Int, CC_B]], c: T_B) extends T_B
case class CC_F(a: CC_C, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_D(_, _, _),_), _, _) => 0 
  case CC_D((CC_F(_, _),_), _, _) => 1 
  case CC_E(_, _, _) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_D((CC_E(_, _, _),_), _, _)