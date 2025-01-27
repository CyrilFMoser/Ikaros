package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_A[E, F], F], b: T_A[F, T_A[Boolean, F]]) extends T_A[E, F]
case class CC_B[G](a: G, b: G, c: CC_A[G, G]) extends T_A[G, T_A[CC_A[Char, Byte], Char]]
case class CC_C[H]() extends T_B[(T_A[(Int,Byte), (Boolean,Boolean)],Boolean), H]
case class CC_D[I](a: I, b: I) extends T_B[(T_A[(Int,Byte), (Boolean,Boolean)],Boolean), I]
case class CC_E[J](a: T_B[J, J], b: J) extends T_B[(T_A[(Int,Byte), (Boolean,Boolean)],Boolean), J]

val v_a: T_B[(T_A[(Int,Byte), (Boolean,Boolean)],Boolean), Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, _) => 2 
}
}