package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[T_A[E, T_B[E, E]], E]
case class CC_B[F](a: Byte, b: CC_A[F]) extends T_A[T_A[F, T_B[F, F]], F]
case class CC_C() extends T_A[T_A[T_B[Boolean, ((Int,Byte),Byte)], T_B[T_B[Boolean, ((Int,Byte),Byte)], T_B[Boolean, ((Int,Byte),Byte)]]], T_B[Boolean, ((Int,Byte),Byte)]]
case class CC_D[G](a: CC_A[G], b: CC_C) extends T_B[CC_C, G]

val v_a: T_A[T_A[T_B[Boolean, ((Int,Byte),Byte)], T_B[T_B[Boolean, ((Int,Byte),Byte)], T_B[Boolean, ((Int,Byte),Byte)]]], T_B[Boolean, ((Int,Byte),Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)