package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_A[(Char,Byte), D]) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: F, b: T_B[F]) extends T_A[E, T_B[E]]
case class CC_C[G](a: CC_B[G, G], b: T_A[G, T_B[G]], c: T_A[G, T_B[G]]) extends T_B[G]
case class CC_D[H](a: T_B[H]) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), _) => 0 
  case CC_C(_, CC_B(_, _), _) => 1 
  case CC_D(CC_C(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_D(CC_C(CC_B(_, _), CC_A(_, _, _), CC_B(_, _))) => 3 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), CC_A(_, _, _))) => 4 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), CC_B(_, _))) => 5 
  case CC_D(CC_D(_)) => 6 
}
}