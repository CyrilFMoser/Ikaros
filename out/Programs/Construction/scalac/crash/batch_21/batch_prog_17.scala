package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: T_A[G, G], b: G, c: T_A[G, G]) extends T_A[G, Boolean]
case class CC_C[H](a: Byte, b: T_A[H, Boolean], c: T_A[H, Boolean]) extends T_A[H, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(_, _, CC_B(_, _, _)) => 3 
  case CC_C(_, _, CC_C(_, _, _)) => 4 
}
}