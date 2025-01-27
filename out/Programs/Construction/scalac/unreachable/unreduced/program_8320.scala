package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Int]], b: T_B[T_A[Int], Int]) extends T_A[Char]
case class CC_B[E, D](a: CC_A) extends T_B[E, D]
case class CC_C[F, G]() extends T_B[G, F]

val v_a: T_B[Boolean, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_))) => 0 
  case CC_B(CC_A(_, CC_C())) => 1 
  case CC_C() => 2 
}
}