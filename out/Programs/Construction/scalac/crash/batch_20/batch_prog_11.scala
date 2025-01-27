package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F](a: CC_A[E, F], b: E) extends T_A[E, F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}