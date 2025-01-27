package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F, b: (T_B[Byte, Boolean],Char)) extends T_B[T_A[CC_A[Byte]], F]
case class CC_D[G](a: T_A[G], b: Boolean) extends T_B[T_A[CC_A[Byte]], G]

val v_a: T_B[T_A[CC_A[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(0, (_,_)) => 0 
  case CC_C(_, (_,_)) => 1 
  case CC_D(CC_A(), _) => 2 
  case CC_D(CC_B(_, _), _) => 3 
}
}