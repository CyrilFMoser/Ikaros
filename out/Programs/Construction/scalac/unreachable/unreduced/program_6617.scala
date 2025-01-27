package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, C]) extends T_A[C, T_A[(Boolean,Byte), T_A[Char, Char]]]
case class CC_B() extends T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[(Boolean,Byte), T_A[Char, Char]]]
case class CC_C[D](a: CC_B, b: (Int,Char)) extends T_A[D, T_A[(Boolean,Byte), T_A[Char, Char]]]

val v_a: T_A[T_A[CC_A[Int], CC_A[Boolean]], T_A[(Boolean,Byte), T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}