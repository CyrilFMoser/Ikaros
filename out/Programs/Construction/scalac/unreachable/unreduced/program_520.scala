package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[Boolean, Boolean]]) extends T_A[D, T_A[Boolean, Boolean]]
case class CC_B[E, F](a: T_B[F]) extends T_A[E, F]
case class CC_C[G](a: T_A[G, T_A[Boolean, Boolean]]) extends T_A[G, T_A[Boolean, Boolean]]
case class CC_D(a: T_A[CC_A[Byte], T_A[(Int,Boolean), (Byte,Int)]]) extends T_B[T_A[CC_B[Boolean, Boolean], T_A[Boolean, Boolean]]]
case class CC_E() extends T_B[T_A[CC_B[Boolean, Boolean], T_A[Boolean, Boolean]]]
case class CC_F() extends T_B[T_A[CC_B[Boolean, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_A[CC_E, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
  case CC_A(CC_C(_)) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_A(_)) => 3 
  case CC_C(CC_B(_)) => 4 
  case CC_C(CC_C(_)) => 5 
}
}
// This is not matched: CC_A(CC_A(_))