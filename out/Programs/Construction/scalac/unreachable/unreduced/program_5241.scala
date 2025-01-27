package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B[E, D](a: T_B[T_A[T_B[D, D]], D], b: Byte, c: E) extends T_B[D, E]
case class CC_C[G](a: T_B[G, G], b: CC_B[G, G], c: Int) extends T_B[CC_A, G]
case class CC_D() extends T_B[CC_A, T_A[T_B[(Char,Boolean), CC_A]]]

val v_a: T_B[CC_A, T_A[T_B[(Char,Boolean), CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), 0, _) => 0 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, _) => 1 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), _) => 2 
  case CC_D() => 3 
}
}