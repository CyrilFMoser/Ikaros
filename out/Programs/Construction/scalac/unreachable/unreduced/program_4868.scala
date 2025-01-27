package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Boolean, Char], (Int,Char)], Boolean]
case class CC_B[E, F](a: F, b: CC_A) extends T_A[F, E]
case class CC_C() extends T_A[T_B[T_A[Boolean, Char], (Int,Char)], Boolean]
case class CC_D[G]() extends T_B[G, Byte]

val v_a: T_A[T_B[T_A[Boolean, Char], (Int,Char)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}