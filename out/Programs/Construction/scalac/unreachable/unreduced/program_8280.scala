package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Char) extends T_A[T_A[E, E], E]
case class CC_B[G, F, H](a: CC_A[G], b: T_A[CC_A[G], H], c: F) extends T_B[F, G]
case class CC_C[I]() extends T_B[I, (CC_A[Int],(Boolean,Byte))]
case class CC_D() extends T_B[(CC_B[Boolean, Char, Char],CC_A[Int]), (CC_A[Int],(Boolean,Byte))]

val v_a: T_B[(CC_B[Boolean, Char, Char],CC_A[Int]), (CC_A[Int],(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D()