package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]
case class CC_C[C](a: CC_A, b: T_A[C], c: Boolean) extends T_B[C]
case class CC_D[D](a: D, b: T_A[Char], c: D) extends T_B[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(CC_D(_, _, _))