package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_B[Boolean, Boolean]], b: D) extends T_A[D]
case class CC_B[F](a: F) extends T_A[F]
case class CC_C[G](a: T_B[G, T_A[G]], b: T_B[G, G], c: T_A[G]) extends T_B[G, T_A[G]]
case class CC_D[H]() extends T_B[H, T_A[H]]
case class CC_E[I](a: I, b: T_A[I], c: Char) extends T_B[I, CC_A[I]]

val v_a: T_B[Int, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, CC_A(CC_A(_, _), _)) => 0 
  case CC_C(CC_C(_, _, _), _, CC_A(CC_B(_), _)) => 1 
  case CC_C(CC_C(_, _, _), _, CC_B(_)) => 2 
  case CC_C(CC_D(), _, CC_A(CC_A(_, _), _)) => 3 
  case CC_C(CC_D(), _, CC_A(CC_B(_), _)) => 4 
  case CC_C(CC_D(), _, CC_B(_)) => 5 
  case CC_D() => 6 
}
}