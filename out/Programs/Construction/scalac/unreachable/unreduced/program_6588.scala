package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Int,Char)], b: T_A[T_A[Boolean]], c: T_B[Byte]) extends T_A[T_B[T_A[Char]]]
case class CC_B[C](a: T_B[Byte], b: Byte, c: (T_A[CC_A],Char)) extends T_A[C]
case class CC_C[D]() extends T_A[D]
case class CC_D(a: CC_A) extends T_B[T_A[CC_B[CC_A]]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _, _) => 0 
  case CC_A(CC_C(), _, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(_, _, _)