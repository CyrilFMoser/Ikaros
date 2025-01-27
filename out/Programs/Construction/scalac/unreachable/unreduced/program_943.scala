package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_C(a: CC_B, b: CC_A, c: T_B[CC_B, CC_B]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_D[E, D](a: T_A[E], b: T_B[D, E]) extends T_B[D, E]
case class CC_E[F, G](a: T_A[F], b: CC_D[F, G], c: CC_C) extends T_B[G, F]

val v_a: T_A[T_A[T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), CC_D(_, _)) => 1 
  case CC_C(_, CC_A(), CC_E(_, _, _)) => 2 
}
}
// This is not matched: CC_B()