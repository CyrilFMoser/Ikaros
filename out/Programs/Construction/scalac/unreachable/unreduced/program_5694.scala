package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[CC_A[(Char,Char)]], b: Char) extends T_B[CC_A[Byte]]
case class CC_C(a: (Boolean,T_A[CC_B]), b: T_A[CC_B], c: T_B[CC_A[Byte]]) extends T_B[CC_A[Byte]]

val v_a: T_B[CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_A(_)), _, CC_B(_, _)) => 0 
  case CC_C((_,CC_A(_)), _, CC_C(_, _, _)) => 1 
}
}
// This is not matched: CC_B(_, _)