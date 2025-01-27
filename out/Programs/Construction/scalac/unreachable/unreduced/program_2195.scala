package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Char]], b: T_A[T_A[Char]], c: Boolean) extends T_A[T_A[T_B[Char, Int]]]
case class CC_B[E, D, F]() extends T_B[E, D]
case class CC_C[G, H](a: T_A[H]) extends T_B[G, H]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}