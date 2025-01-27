package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_B, T_A[Byte, T_B]], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: CC_B[CC_C], c: CC_B[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(CC_C(), CC_B(_, _), _) => 2 
}
}