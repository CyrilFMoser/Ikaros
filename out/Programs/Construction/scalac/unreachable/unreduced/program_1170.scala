package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], T_A[Char]], b: T_A[T_A[Byte]]) extends T_A[T_B[T_A[Char], Char]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_B[T_A[Char], Char]]
case class CC_C(a: CC_A) extends T_A[T_B[T_A[Char], Char]]
case class CC_D[D, E]() extends T_B[E, D]

val v_a: T_A[T_B[T_A[Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}