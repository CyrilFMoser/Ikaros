package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]], b: CC_B[Byte], c: Int) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(), CC_B(_), _) => 0 
  case CC_E(CC_B(_), CC_B(_), _) => 1 
  case CC_E(CC_C(_), CC_B(_), _) => 2 
}
}