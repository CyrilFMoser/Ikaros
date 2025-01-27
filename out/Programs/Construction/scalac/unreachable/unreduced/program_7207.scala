package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_B[T_B[Boolean]]) extends T_A[Byte]
case class CC_B(a: Char, b: T_A[T_A[CC_A]], c: T_A[Int]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D[C](a: CC_A, b: CC_B) extends T_B[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)