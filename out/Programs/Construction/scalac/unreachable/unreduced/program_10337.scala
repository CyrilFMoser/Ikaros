package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: (T_A[Char],(Boolean,Char)), c: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: T_A[E], b: F, c: T_A[F]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: T_A[CC_A[G]], c: CC_B[G, G]) extends T_A[G]
case class CC_D[H]() extends T_B[H, T_A[T_A[Int]]]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 2 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 3 
  case CC_B(CC_C(_, CC_A(_, _, _), _), _, _) => 4 
  case CC_B(CC_C(_, CC_B(_, _, _), _), _, _) => 5 
  case CC_B(CC_C(_, CC_C(_, _, _), _), _, _) => 6 
}
}