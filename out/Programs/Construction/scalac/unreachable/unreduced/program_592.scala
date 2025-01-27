package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[D, T_A[D, D]]]
case class CC_C[E](a: CC_A[E], b: (CC_A[Byte],Boolean)) extends T_A[E, T_A[E, T_A[E, E]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _), (_,_)) => 2 
}
}