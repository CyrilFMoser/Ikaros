package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[T_A[T_A[Boolean, Byte], T_B[Boolean]], D]
case class CC_B[E](a: Byte) extends T_A[E, T_B[Boolean]]
case class CC_C[F, G](a: T_B[G], b: (T_B[Byte],T_A[Int, Int])) extends T_B[F]
case class CC_D[H](a: Char, b: T_B[(Byte,Byte)]) extends T_B[H]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_B[Boolean]], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, (_,_))) => 0 
  case CC_A(CC_D(_, _)) => 1 
  case CC_B(_) => 2 
}
}