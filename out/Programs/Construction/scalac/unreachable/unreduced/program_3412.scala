package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[((Int,Byte),Boolean)], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_C[C](a: CC_A, b: Boolean) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_D[D, E](a: D) extends T_B[D]
case class CC_E[F](a: T_B[F]) extends T_B[F]
case class CC_F[G](a: CC_B, b: (CC_C[Byte],Boolean)) extends T_B[G]

val v_a: T_A[T_A[T_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_E(_), _) => 0 
  case CC_A(_, CC_F(CC_B(_, _), (_,_)), _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(CC_A(_, CC_D(_), _), _) => 3 
  case CC_C(CC_A(_, CC_E(_), _), _) => 4 
  case CC_C(CC_A(_, CC_F(_, _), _), _) => 5 
}
}
// This is not matched: CC_A(_, CC_D((_,_)), _)