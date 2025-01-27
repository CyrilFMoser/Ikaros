package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_B[T_B[Byte, Boolean], T_B[Byte, Byte]], c: Byte) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C[E, D](a: E, b: T_A[E]) extends T_B[E, D]
case class CC_D[F, G](a: Char) extends T_B[G, F]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_D(_), _), _) => 0 
  case CC_A(_, CC_D(_), _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(_, CC_C(CC_C(_, _), _), _)