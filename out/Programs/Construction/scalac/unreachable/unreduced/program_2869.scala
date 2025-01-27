package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Boolean], c: (T_A[Boolean, Boolean],(Char,Char))) extends T_A[E, Boolean]
case class CC_B[F, G](a: (T_A[Int, Boolean],T_A[Byte, Byte])) extends T_B[F, G]
case class CC_C[H, I]() extends T_B[H, I]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),_)) => 0 
  case CC_C() => 1 
}
}