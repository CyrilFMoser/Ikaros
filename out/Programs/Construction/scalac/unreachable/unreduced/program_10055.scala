package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: T_B) extends T_A[C, Char]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: T_A[D, D]) extends T_A[D, Char]
case class CC_C[E](a: CC_B[(Byte,T_B)]) extends T_B
case class CC_D(a: Boolean) extends T_B
case class CC_E(a: ((CC_D,T_B),Byte), b: CC_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_D(_) => 1 
  case CC_E(_, _) => 2 
}
}