package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]], T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]]], T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]]]
case class CC_C[D](a: CC_B, b: Boolean) extends T_A[D, (CC_A[CC_B],(CC_B,CC_B))]

val v_a: T_A[T_A[T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]], T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]]], T_A[T_A[T_A[Byte, Int], T_A[Byte, Int]], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}