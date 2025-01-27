package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_A[Byte, Boolean]], T_A[(Boolean,Int), T_B[Int]]]
case class CC_B(a: (T_A[CC_A, CC_A],T_B[CC_A])) extends T_A[T_B[T_A[Byte, Boolean]], T_A[(Boolean,Int), T_B[Int]]]
case class CC_C(a: T_A[T_B[CC_B], T_B[Char]]) extends T_B[T_A[T_B[CC_B], Int]]
case class CC_D(a: T_A[CC_A, CC_A], b: Boolean) extends T_B[T_A[T_B[CC_B], Int]]
case class CC_E() extends T_B[T_A[T_B[CC_B], Int]]

val v_a: T_B[T_A[T_B[CC_B], Int]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(_, _)