package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Byte]], b: T_B[T_B[Boolean, Char], T_B[Boolean, Boolean]]) extends T_A[T_B[T_A[Char], T_B[Boolean, Byte]]]
case class CC_B() extends T_A[T_B[T_A[Char], T_B[Boolean, Byte]]]
case class CC_C() extends T_A[T_B[T_A[Char], T_B[Boolean, Byte]]]
case class CC_D[D, E](a: Boolean) extends T_B[E, D]
case class CC_E[G, F]() extends T_B[F, G]

val v_a: T_A[T_B[T_A[Char], T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_)) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, CC_E())