package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: (CC_A[T_A],CC_A[T_A]), b: CC_A[T_B[Boolean, T_A]]) extends T_A
case class CC_C[D](a: (T_A,T_B[T_A, CC_B])) extends T_B[D, T_B[CC_B, T_B[T_A, Byte]]]
case class CC_D[E](a: CC_B) extends T_B[E, T_B[CC_B, T_B[T_A, Byte]]]
case class CC_E[F](a: F) extends T_B[F, T_B[CC_B, T_B[T_A, Byte]]]

val v_a: T_B[Byte, T_B[CC_B, T_B[T_A, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),_)) => 0 
  case CC_C((CC_B(_, _),_)) => 1 
  case CC_D(CC_B(_, CC_A())) => 2 
  case CC_E(_) => 3 
}
}