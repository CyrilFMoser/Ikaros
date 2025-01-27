package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Byte, Byte], Int], C]
case class CC_B(a: CC_A[T_A[Char, Char]]) extends T_A[T_A[T_A[Byte, Byte], Int], CC_A[T_A[Char, Byte]]]
case class CC_C(a: (Boolean,CC_A[CC_B])) extends T_A[T_A[T_A[Byte, Byte], Int], T_A[CC_B, T_A[CC_B, CC_B]]]

val v_a: T_A[T_A[T_A[Byte, Byte], Int], T_A[CC_B, T_A[CC_B, CC_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}