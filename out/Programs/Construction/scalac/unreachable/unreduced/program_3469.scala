package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Byte], Char], b: T_B[Int], c: T_A[T_B[Int], T_B[Char]]) extends T_A[T_B[T_B[Char]], T_A[Byte, Byte]]
case class CC_B[D](a: T_B[D], b: CC_A) extends T_B[D]
case class CC_C() extends T_B[T_A[CC_B[CC_A], Boolean]]

val v_a: T_B[T_A[CC_B[CC_A], Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}