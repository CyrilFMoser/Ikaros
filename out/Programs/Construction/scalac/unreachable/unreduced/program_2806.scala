package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[T_A[D, D], D]) extends T_A[T_A[T_B[Byte], (Char,Char)], D]
case class CC_B() extends T_B[T_A[CC_A[Byte], CC_A[Char]]]
case class CC_C(a: Int, b: (T_B[CC_B],CC_A[Boolean]), c: T_A[Byte, T_A[Byte, CC_B]]) extends T_B[T_A[CC_A[Byte], CC_A[Char]]]

val v_a: T_B[T_A[CC_A[Byte], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (_,CC_A(_, _)), _) => 1 
}
}