package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[E, E], b: T_A[E, D]) extends T_A[E, D]
case class CC_B[F](a: T_B[CC_A[F, F]]) extends T_B[((Boolean,Char),T_B[Char])]
case class CC_C() extends T_B[((Boolean,Char),T_B[Char])]

val v_a: T_B[((Boolean,Char),T_B[Char])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}