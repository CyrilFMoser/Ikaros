package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: (T_A[Byte],Boolean)) extends T_A[Byte]
case class CC_B[C](a: T_A[Byte], b: CC_A) extends T_B[C]
case class CC_C[D, E](a: E, b: Int, c: CC_B[T_B[E]]) extends T_B[D]
case class CC_D[F](a: T_B[F]) extends T_B[F]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_)), CC_A(_, (_,_))) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_B(_, CC_A(_, _))) => 2 
  case CC_D(CC_C(_, _, _)) => 3 
  case CC_D(CC_D(_)) => 4 
}
}