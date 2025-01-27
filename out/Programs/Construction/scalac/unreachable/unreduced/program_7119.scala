package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Char],Int)) extends T_A[Char]
case class CC_B(a: Boolean, b: T_A[T_A[Char]], c: T_B[T_B[CC_A, CC_A], T_A[Char]]) extends T_A[Char]
case class CC_C(a: T_A[T_B[Int, Int]]) extends T_B[Int, Int]
case class CC_D(a: Int, b: T_A[T_A[Char]]) extends T_B[Int, Int]
case class CC_E[D, E](a: E) extends T_B[E, D]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_) => 2 
}
}