package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: (T_A[Byte],Boolean)) extends T_A[C]
case class CC_B(a: CC_A[T_B[Char]]) extends T_B[T_A[CC_A[Char]]]
case class CC_C(a: T_A[(CC_B,CC_B)], b: T_B[(Byte,CC_B)], c: T_B[T_A[CC_B]]) extends T_B[T_A[CC_A[Char]]]
case class CC_D(a: CC_B, b: CC_C) extends T_B[T_A[CC_A[Char]]]

val v_a: T_B[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(_, CC_C(CC_A(_, _), _, _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)