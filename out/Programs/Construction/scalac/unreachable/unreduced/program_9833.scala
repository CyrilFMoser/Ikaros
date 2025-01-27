package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Boolean, Byte],T_A[Byte, Boolean]), c: T_A[C, C]) extends T_A[T_A[Byte, C], C]
case class CC_B() extends T_A[T_A[Byte, T_A[T_A[Byte, Boolean], CC_A[Byte]]], T_A[T_A[Byte, Boolean], CC_A[Byte]]]

val v_a: T_A[T_A[Byte, T_A[T_A[Byte, Boolean], CC_A[Byte]]], T_A[T_A[Byte, Boolean], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}