package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[E, Char]
case class CC_B[F]() extends T_A[F, Char]
case class CC_C() extends T_B[Boolean, Boolean]
case class CC_D() extends T_B[Boolean, Boolean]

val v_a: T_A[T_B[Boolean, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_A(_, CC_D()) => 1 
  case CC_B() => 2 
}
}