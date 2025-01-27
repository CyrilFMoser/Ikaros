package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Int) extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C]) extends T_A[C]
case class CC_C(a: CC_B[CC_B[Char]], b: T_A[T_A[Char]]) extends T_A[(Boolean,T_A[Byte])]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _), _)