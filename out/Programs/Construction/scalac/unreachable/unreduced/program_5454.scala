package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: T_B[T_B[Char]]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C(a: T_B[T_B[CC_B]], b: T_A[T_A[CC_B]]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_D(a: Int, b: Char, c: CC_A[CC_A[Boolean]]) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_)