package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[D, D], b: E) extends T_A[D]
case class CC_B[F]() extends T_A[F]
case class CC_C(a: (T_A[Int],T_A[Boolean]), b: T_A[Boolean]) extends T_A[CC_B[(Int,Boolean)]]
case class CC_D[G]() extends T_B[T_A[G], G]
case class CC_E[H]() extends T_B[T_A[H], H]

val v_a: T_A[CC_B[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_B()) => 3 
  case CC_C((CC_A(_, _),CC_B()), CC_A(_, _)) => 4 
  case CC_C((CC_A(_, _),CC_B()), CC_B()) => 5 
  case CC_C((CC_B(),CC_A(_, _)), CC_A(_, _)) => 6 
  case CC_C((CC_B(),CC_A(_, _)), CC_B()) => 7 
  case CC_C((CC_B(),CC_B()), CC_A(_, _)) => 8 
  case CC_C((CC_B(),CC_B()), CC_B()) => 9 
}
}