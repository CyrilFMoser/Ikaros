package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[E]]
case class CC_C[H, G](a: CC_A[G], b: T_A[H]) extends T_B[H, G]
case class CC_D[I, J]() extends T_B[J, I]
case class CC_E() extends T_B[(Char,(Int,Boolean)), (Byte,Char)]

val v_a: T_B[CC_E, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(CC_A(CC_C(_, _)), _) => 1 
}
}
// This is not matched: (CC_B Int (T_B (T_A (Tuple Int Boolean)) Int))