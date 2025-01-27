package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B(a: T_A[T_A[Byte, Byte], T_A[T_A[Byte, Byte], T_A[Byte, Byte]]]) extends T_A[((Boolean,Byte),T_B[Byte, Byte]), T_A[((Boolean,Byte),T_B[Byte, Byte]), ((Boolean,Byte),T_B[Byte, Byte])]]
case class CC_C[F](a: CC_B, b: T_A[F, F], c: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: CC_B) extends T_B[T_A[Boolean, T_A[Boolean, Boolean]], G]
case class CC_E(a: (CC_C[CC_B],T_A[CC_B, Byte])) extends T_B[T_A[Boolean, T_A[Boolean, Boolean]], CC_B]
case class CC_F() extends T_B[T_A[Boolean, T_A[Boolean, Boolean]], CC_B]

val v_a: T_B[T_A[Boolean, T_A[Boolean, Boolean]], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_)) => 0 
  case CC_E((_,_)) => 1 
}
}
// This is not matched: CC_F()