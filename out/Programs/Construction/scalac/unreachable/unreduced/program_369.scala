package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[T_B, T_B],T_B), b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C(a: Byte, b: CC_B[T_B], c: Byte) extends T_B
case class CC_D(a: CC_A[T_A[T_B, CC_C]], b: T_A[T_A[CC_A[CC_C], CC_A[CC_C]], CC_A[CC_C]], c: T_B) extends T_B
case class CC_E(a: T_A[T_A[(Int,CC_D), (Int,CC_D)], (Int,CC_D)]) extends T_B

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B((_,_), CC_A())