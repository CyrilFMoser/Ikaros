package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B[D, E](a: D, b: CC_A[E], c: T_A[E, Byte]) extends T_A[D, (CC_A[Int],T_A[Int, Byte])]
case class CC_C[F](a: T_A[CC_A[F], F], b: F, c: F) extends T_A[F, Byte]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, CC_A(_, _)), CC_C(_, _, _)) => 1 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_C(_, _, _)) => 3 
  case CC_A(CC_C(_, _, _), CC_A(_, _)) => 4 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _)) => 5 
  case CC_C(CC_A(_, CC_A(_, _)), _, _) => 6 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, _) => 7 
  case CC_C(CC_C(_, _, _), _, _) => 8 
}
}