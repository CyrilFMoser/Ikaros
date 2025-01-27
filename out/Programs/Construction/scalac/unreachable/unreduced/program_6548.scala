package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: Byte, b: (T_A[Char],T_B[Int, Int])) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: Boolean) extends T_B[Boolean, F]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_)), _, _) => 0 
  case CC_C(CC_A(CC_B(_, _)), _, _) => 1 
  case CC_C(CC_B(0, (_,_)), _, _) => 2 
  case CC_C(CC_B(_, (_,_)), _, _) => 3 
}
}