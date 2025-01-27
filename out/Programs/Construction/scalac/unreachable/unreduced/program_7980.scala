package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (Char,T_B)]
case class CC_B[D](a: D, b: T_B, c: D) extends T_A[D, (Char,T_B)]
case class CC_C[E](a: T_B) extends T_A[E, (Char,T_B)]
case class CC_D(a: T_A[(T_B,(Int,Byte)), T_B], b: CC_C[((Boolean,Byte),Boolean)], c: T_A[CC_A[T_B], (Char,T_B)]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[Char, (Char,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_D(_, _, CC_A(_)), _) => 1 
  case CC_B(_, CC_D(_, _, CC_B(_, _, _)), _) => 2 
  case CC_B(_, CC_D(_, _, CC_C(_)), _) => 3 
  case CC_B(_, CC_E(), _) => 4 
  case CC_C(CC_D(_, _, CC_A(_))) => 5 
  case CC_C(CC_D(_, _, CC_C(_))) => 6 
  case CC_C(CC_E()) => 7 
}
}
// This is not matched: CC_C(CC_D(_, _, CC_B(_, _, _)))