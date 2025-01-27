package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B(a: T_A[T_A[(Int,Int), Byte], CC_A[Byte]], b: Boolean) extends T_A[T_A[T_A[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]]

val v_a: T_A[T_A[T_A[T_A[Byte, CC_A[Byte]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]], T_A[Byte, CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}