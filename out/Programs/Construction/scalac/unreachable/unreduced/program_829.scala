package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[CC_A[Byte]]) extends T_B[CC_A[Int]]
case class CC_C(a: Boolean, b: T_B[Char], c: T_A[T_A[Boolean]]) extends T_B[CC_A[Int]]
case class CC_D(a: T_B[CC_A[Int]], b: T_A[T_B[CC_B]], c: Char) extends T_B[CC_A[Int]]

val v_a: T_B[CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_, _, 'x') => 1 
  case CC_D(_, _, _) => 2 
}
}
// This is not matched: CC_C(_, _, _)