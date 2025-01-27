package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: (T_A[Byte],T_A[(Byte,Boolean)]), b: E) extends T_A[E]
case class CC_C[F]() extends T_B[T_A[T_A[Char]], F]
case class CC_D(a: (CC_B[Int],T_A[Boolean])) extends T_B[T_A[T_A[Char]], T_A[CC_A[Boolean]]]
case class CC_E[G](a: T_A[G], b: Int) extends T_B[T_A[T_A[Char]], G]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),CC_A(_)), _) => 0 
  case CC_B((CC_A(_),CC_B(_, _)), _) => 1 
  case CC_B((CC_B(_, _),CC_A(_)), _) => 2 
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 3 
}
}