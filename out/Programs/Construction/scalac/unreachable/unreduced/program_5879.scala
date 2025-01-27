package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: (T_B[CC_A],CC_A), b: (T_A[CC_A],T_A[CC_A]), c: (T_A[(Int,Byte)],T_A[CC_A])) extends T_A[T_A[Byte]]
case class CC_C[C](a: T_A[C], b: Char, c: CC_B) extends T_A[C]
case class CC_D() extends T_B[T_A[T_A[Byte]]]
case class CC_E(a: CC_B, b: T_B[CC_C[CC_D]], c: T_A[CC_C[(Byte,Byte)]]) extends T_B[T_A[T_A[Byte]]]
case class CC_F() extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_F()