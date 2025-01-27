package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Int, T_B[Byte, Boolean]], T_A[T_B[Byte, Int], T_B[Boolean, Byte]]]
case class CC_B[E](a: E) extends T_B[E, T_B[E, E]]
case class CC_C(a: CC_A) extends T_B[(CC_B[CC_A],T_A[CC_A, CC_A]), T_B[(CC_B[CC_A],T_A[CC_A, CC_A]), (CC_B[CC_A],T_A[CC_A, CC_A])]]
case class CC_D[F](a: T_B[F, T_B[F, F]]) extends T_B[F, T_B[F, F]]

val v_a: T_B[(CC_B[CC_A],T_A[CC_A, CC_A]), T_B[(CC_B[CC_A],T_A[CC_A, CC_A]), (CC_B[CC_A],T_A[CC_A, CC_A])]] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_),_)) => 0 
  case CC_C(_) => 1 
  case CC_D(CC_B((_,_))) => 2 
  case CC_D(CC_C(CC_A())) => 3 
  case CC_D(CC_D(CC_B(_))) => 4 
  case CC_D(CC_D(CC_C(_))) => 5 
  case CC_D(CC_D(CC_D(_))) => 6 
}
}