package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: D) extends T_A[D, T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]]
case class CC_C(a: CC_B[CC_B[Char]]) extends T_A[T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]]

val v_a: T_A[T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}