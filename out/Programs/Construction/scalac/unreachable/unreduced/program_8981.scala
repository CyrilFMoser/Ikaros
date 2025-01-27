package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: (T_B[Boolean, Boolean],T_B[Boolean, (Byte,Boolean)])) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E], c: T_A[E]) extends T_B[T_A[T_A[Int]], E]
case class CC_C[F](a: T_B[F, F], b: T_A[F], c: T_A[F]) extends T_B[T_A[T_A[Int]], F]
case class CC_D[G](a: CC_C[G]) extends T_B[T_A[T_A[Int]], G]

val v_a: T_B[T_A[T_A[Int]], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 0 
  case CC_C(_, CC_A(12, (_,_)), _) => 1 
  case CC_C(_, CC_A(_, (_,_)), _) => 2 
  case CC_D(_) => 3 
}
}