package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: (Int,T_B[Int, Int])) extends T_A[E]
case class CC_C[F](a: F, b: F, c: CC_B[F]) extends T_B[(T_B[Int, Byte],CC_B[Char]), F]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_))) => 0 
  case CC_A(CC_B((_,_))) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_A(_)))