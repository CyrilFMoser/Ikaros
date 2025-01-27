package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B() extends T_B[T_A[(Int,Byte)], Boolean]
case class CC_C(a: (T_B[(Char,Boolean), CC_B],CC_B), b: T_B[Byte, CC_A[CC_B]]) extends T_B[T_A[(Int,Byte)], Boolean]
case class CC_D(a: CC_B, b: T_B[CC_B, CC_B], c: CC_A[CC_B]) extends T_B[T_A[(Int,Byte)], Boolean]

val v_a: T_B[T_A[(Int,Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,CC_B()), _) => 1 
}
}
// This is not matched: CC_D(_, _, CC_A(CC_A(_, _), CC_A(_, _)))