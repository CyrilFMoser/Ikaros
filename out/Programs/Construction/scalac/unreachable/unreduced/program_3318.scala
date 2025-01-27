package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B(a: CC_A[T_A[(Char,Int), Boolean]], b: Int, c: T_A[CC_A[Int], T_A[Byte, Boolean]]) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]], CC_A[CC_A[Boolean]]]]
case class CC_C[D](a: D, b: CC_A[D], c: Boolean) extends T_A[D, T_A[T_A[D, D], D]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]], CC_A[CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_A(), _, _)