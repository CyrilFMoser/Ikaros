package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Byte]], b: Int, c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[D](a: T_B[CC_A, D], b: CC_A) extends T_B[CC_A, D]
case class CC_C() extends T_B[CC_A, Byte]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_, _, _)) => 0 
  case CC_B(CC_B(CC_C(), _), CC_A(_, _, _)) => 1 
  case CC_B(CC_C(), CC_A(_, _, _)) => 2 
  case CC_C() => 3 
}
}