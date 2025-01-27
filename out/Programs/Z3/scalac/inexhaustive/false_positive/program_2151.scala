package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[D, E]) extends T_A[E, D]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_D() extends T_B[T_A[Boolean, (Int,Byte)]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: Pattern match is empty without constants