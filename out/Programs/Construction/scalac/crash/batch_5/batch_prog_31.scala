package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[(Boolean,Char)], c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
}
}