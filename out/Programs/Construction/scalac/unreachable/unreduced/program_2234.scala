package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: Int, c: T_B[E, E]) extends T_B[E, T_A[Int]]
case class CC_C[F](a: Char, b: Boolean, c: Boolean) extends T_B[F, T_A[Int]]
case class CC_D[G](a: T_B[G, T_A[Int]], b: T_A[G], c: T_B[G, T_A[Int]]) extends T_B[G, T_A[Int]]

val v_a: T_B[Char, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, CC_A(), CC_B(_, _, _)) => 2 
  case CC_D(_, CC_A(), CC_C(_, _, _)) => 3 
  case CC_D(_, CC_A(), CC_D(CC_C(_, _, _), CC_A(), CC_B(_, _, _))) => 4 
  case CC_D(_, CC_A(), CC_D(CC_D(_, _, _), CC_A(), CC_B(_, _, _))) => 5 
  case CC_D(_, CC_A(), CC_D(CC_B(_, _, _), CC_A(), CC_C(_, _, _))) => 6 
  case CC_D(_, CC_A(), CC_D(CC_C(_, _, _), CC_A(), CC_C(_, _, _))) => 7 
  case CC_D(_, CC_A(), CC_D(CC_D(_, _, _), CC_A(), CC_C(_, _, _))) => 8 
  case CC_D(_, CC_A(), CC_D(CC_B(_, _, _), CC_A(), CC_D(_, _, _))) => 9 
  case CC_D(_, CC_A(), CC_D(CC_C(_, _, _), CC_A(), CC_D(_, _, _))) => 10 
  case CC_D(_, CC_A(), CC_D(CC_D(_, _, _), CC_A(), CC_D(_, _, _))) => 11 
}
}
// This is not matched: CC_D(_, CC_A(), CC_D(CC_B(_, _, _), CC_A(), CC_B(_, _, _)))