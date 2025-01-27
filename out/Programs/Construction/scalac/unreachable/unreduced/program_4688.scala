package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[Int, Boolean],T_B[Char, (Char,Char)])) extends T_A[Boolean, T_B[(Char,Int), T_B[Boolean, Boolean]]]
case class CC_B(a: T_B[CC_A, Char], b: T_A[T_A[CC_A, Boolean], (CC_A,Byte)], c: CC_A) extends T_A[Boolean, T_B[(Char,Int), T_B[Boolean, Boolean]]]
case class CC_C(a: (T_A[CC_A, CC_A],T_B[CC_A, CC_B]), b: CC_B) extends T_A[Boolean, T_B[(Char,Int), T_B[Boolean, Boolean]]]
case class CC_D[F, E]() extends T_B[E, F]
case class CC_E[G](a: G) extends T_B[G, CC_C]

val v_a: T_A[Boolean, T_B[(Char,Int), T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(),CC_D())) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((_,CC_D()), CC_B(CC_D(), _, CC_A(_))) => 2 
}
}