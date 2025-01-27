package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[T_B[E, Boolean], E]
case class CC_B[F]() extends T_A[T_B[F, Boolean], F]
case class CC_C(a: (Char,CC_B[Char]), b: (CC_A[Boolean],T_A[Int, Char]), c: T_A[Byte, CC_A[Char]]) extends T_A[T_B[(CC_A[Boolean],CC_B[Boolean]), Boolean], (CC_A[Boolean],CC_B[Boolean])]
case class CC_D[H, G](a: T_A[G, G]) extends T_B[G, H]
case class CC_E[J, I](a: CC_C, b: I, c: J) extends T_B[I, J]

val v_a: T_A[T_B[(CC_A[Boolean],CC_B[Boolean]), Boolean], (CC_A[Boolean],CC_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_A(CC_E(CC_C(_, _, _), _, (_,_)), _) => 1 
  case CC_B() => 2 
  case CC_C(('x',CC_B()), (CC_A(_, _),_), _) => 3 
  case CC_C((_,CC_B()), (CC_A(_, _),_), _) => 4 
}
}