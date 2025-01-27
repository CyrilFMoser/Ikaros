package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: (CC_A[Byte],Boolean), c: T_B[E, T_B[E, Byte]]) extends T_B[E, T_B[E, Byte]]
case class CC_C[F](a: F) extends T_B[F, T_B[F, Byte]]
case class CC_D[G, H](a: T_B[T_A[G], T_B[T_A[G], Byte]]) extends T_B[G, T_B[G, Byte]]

val v_a: T_B[Int, T_B[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), (CC_A(_),true), CC_B(_, _, _)) => 0 
  case CC_B(CC_A(_), (CC_A(_),true), CC_C(_)) => 1 
  case CC_B(CC_A(_), (CC_A(_),true), CC_D(_)) => 2 
  case CC_B(CC_A(_), (CC_A(_),false), CC_B(_, _, _)) => 3 
  case CC_B(CC_A(_), (CC_A(_),false), CC_C(_)) => 4 
  case CC_B(CC_A(_), (CC_A(_),false), CC_D(_)) => 5 
  case CC_C(_) => 6 
  case CC_D(CC_B(_, _, _)) => 7 
  case CC_D(CC_C(CC_A(_))) => 8 
  case CC_D(CC_D(_)) => 9 
}
}