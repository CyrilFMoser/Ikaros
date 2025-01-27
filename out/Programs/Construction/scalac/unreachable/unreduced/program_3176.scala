package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[T_A[(Int,Char)]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: Boolean) extends T_A[T_A[(Int,Char)]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[(Int,Char)]]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_), _)