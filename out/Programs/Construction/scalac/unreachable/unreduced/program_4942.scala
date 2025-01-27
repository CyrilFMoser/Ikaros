package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, Boolean]], b: CC_A[Int]) extends T_A[Byte, T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]]
case class CC_C[D](a: T_A[T_A[D, D], D], b: D, c: Byte) extends T_A[T_A[D, D], D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A()) => 0 
  case CC_B(CC_C(_, _, _), CC_A()) => 1 
}
}