package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: Int) extends T_B[F, T_B[F, F]]
case class CC_C() extends T_B[T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]], T_B[T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]], T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]]]]
case class CC_D[G](a: T_A[G, G], b: T_A[G, T_B[G, G]]) extends T_B[G, T_B[G, G]]

val v_a: T_B[T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]], T_B[T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]], T_B[(Boolean,Char), T_B[(Boolean,Char), (Boolean,Char)]]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A()) => 2 
}
}