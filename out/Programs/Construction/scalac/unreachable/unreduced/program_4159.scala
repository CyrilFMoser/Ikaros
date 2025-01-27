package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C(a: Byte, b: CC_A[Byte, T_B[Char]], c: T_B[T_A[Boolean, Char]]) extends T_B[T_A[(Int,Boolean), Byte]]
case class CC_D(a: CC_A[Boolean, CC_B[Byte]], b: (CC_C,CC_B[(Int,Byte)]), c: Int) extends T_B[T_A[(Int,Boolean), Byte]]
case class CC_E[G](a: CC_B[G], b: CC_D, c: G) extends T_B[T_A[(Int,Boolean), Byte]]

val v_a: T_B[T_A[(Int,Boolean), Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), _) => 0 
  case CC_E(_, CC_D(_, _, _), _) => 1 
}
}
// This is not matched: CC_D(CC_A(), (CC_C(_, _, _),CC_B()), _)