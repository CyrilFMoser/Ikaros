package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E, c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[T_B[F, F], F]
case class CC_D[G](a: T_B[T_B[G, G], G], b: T_A[G]) extends T_B[T_B[G, G], G]
case class CC_E(a: (Int,Byte), b: CC_A[Char], c: T_A[CC_B[Byte]]) extends T_B[T_B[CC_B[Int], CC_B[Int]], CC_B[Int]]

val v_a: T_B[T_B[CC_B[Int], CC_B[Int]], CC_B[Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_D(_, _), CC_A(_, _)) => 1 
  case CC_D(CC_E(_, _, _), CC_A(_, _)) => 2 
  case CC_D(CC_C(), CC_B(_, _, _)) => 3 
  case CC_D(CC_D(_, _), CC_B(_, _, _)) => 4 
  case CC_D(CC_E(_, _, _), CC_B(_, _, _)) => 5 
  case CC_E(_, _, _) => 6 
}
}
// This is not matched: CC_D(CC_C(), CC_A(_, _))