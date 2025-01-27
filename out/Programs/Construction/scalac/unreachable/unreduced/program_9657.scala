package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_B[Byte]], c: Boolean) extends T_A[T_B[Byte]]
case class CC_B() extends T_A[T_B[Byte]]
case class CC_C[C](a: T_B[C], b: Byte, c: T_B[CC_A]) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E() extends T_B[Char]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(_, CC_B(), _)