package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_B, Byte], C]
case class CC_B(a: CC_A[Boolean], b: CC_A[CC_A[(Int,Boolean)]], c: (CC_A[Boolean],Char)) extends T_B
case class CC_C[D](a: CC_A[D], b: T_A[D, D], c: (T_A[T_B, CC_B],CC_B)) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, (CC_A(_),_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D()