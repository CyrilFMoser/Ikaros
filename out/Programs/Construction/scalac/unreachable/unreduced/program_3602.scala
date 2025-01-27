package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], Boolean], b: (Byte,T_B[Byte, Byte]), c: Char) extends T_A[T_B[T_B[Boolean, Char], T_A[Int]]]
case class CC_B(a: T_B[CC_A, (CC_A,CC_A)]) extends T_A[T_B[T_B[Boolean, Char], T_A[Int]]]
case class CC_C(a: Boolean, b: T_A[Byte]) extends T_A[T_B[T_B[Boolean, Char], T_A[Int]]]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F, G](a: (T_B[CC_C, CC_A],CC_B)) extends T_B[F, G]

val v_a: T_A[T_B[T_B[Boolean, Char], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_D()), _) => 0 
  case CC_A(_, (_,CC_E(_)), _) => 1 
  case CC_B(CC_D()) => 2 
  case CC_B(CC_E(_)) => 3 
  case CC_C(_, _) => 4 
}
}