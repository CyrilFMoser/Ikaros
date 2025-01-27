package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Boolean, Int],T_B[Char, Boolean]), b: T_B[E, T_A[E, E]], c: T_B[E, E]) extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_A[T_A[F, F], F]) extends T_A[T_A[(CC_A[Boolean],T_B[Boolean, Boolean]), (CC_A[Boolean],T_B[Boolean, Boolean])], (CC_A[Boolean],T_B[Boolean, Boolean])]
case class CC_C(a: T_B[CC_A[Byte], CC_A[Int]], b: CC_A[T_B[Boolean, Int]], c: CC_B[T_A[Byte, (Boolean,Boolean)]]) extends T_A[T_A[(CC_A[Boolean],T_B[Boolean, Boolean]), (CC_A[Boolean],T_B[Boolean, Boolean])], (CC_A[Boolean],T_B[Boolean, Boolean])]
case class CC_D[G](a: CC_C, b: T_B[G, G]) extends T_B[T_B[G, G], G]

val v_a: T_A[T_A[(CC_A[Boolean],T_B[Boolean, Boolean]), (CC_A[Boolean],T_B[Boolean, Boolean])], (CC_A[Boolean],T_B[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
}
}
// This is not matched: CC_A(_, _, _)