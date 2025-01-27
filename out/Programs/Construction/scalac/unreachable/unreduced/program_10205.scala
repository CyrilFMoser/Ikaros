package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[E, T_B[Boolean, (Char,Int)]]
case class CC_B() extends T_A[Int, T_B[Boolean, (Char,Int)]]
case class CC_C[F, G]() extends T_B[F, G]

val v_a: T_A[Int, T_B[Boolean, (Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_B() => 1 
}
}