package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_B[(Boolean,Char), T_A[Boolean]], c: T_B[CC_A[Byte], Boolean]) extends T_A[CC_A[CC_A[Char]]]
case class CC_C(a: Char, b: Char) extends T_A[CC_A[CC_A[Char]]]
case class CC_D[E, F](a: T_A[E], b: CC_B) extends T_B[F, E]
case class CC_E[G, H]() extends T_B[G, H]
case class CC_F[I, J](a: J) extends T_B[I, J]

val v_a: T_A[CC_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D(_, _), _) => 0 
  case CC_B(_, CC_E(), _) => 1 
  case CC_B(_, CC_F(_), _) => 2 
  case CC_C(_, _) => 3 
}
}