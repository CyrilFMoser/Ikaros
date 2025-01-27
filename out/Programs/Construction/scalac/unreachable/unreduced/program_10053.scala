package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[(Int,Char), T_A[Char, Char]]]
case class CC_B(a: Int) extends T_A[CC_A[Byte], T_A[(Int,Char), T_A[Char, Char]]]
case class CC_C[F](a: (T_B[CC_B, Byte],Int)) extends T_B[(CC_B,CC_B), F]
case class CC_D[G](a: T_B[(CC_B,CC_B), G]) extends T_B[(CC_B,CC_B), G]
case class CC_E() extends T_B[(CC_B,CC_B), T_B[CC_D[CC_B], T_B[CC_B, CC_B]]]

val v_a: T_B[(CC_B,CC_B), Boolean] = null
val v_b: Int = v_a match{
  case CC_C((_,_)) => 0 
  case CC_D(CC_C((_,_))) => 1 
  case CC_D(CC_D(CC_C(_))) => 2 
  case CC_D(CC_D(CC_D(_))) => 3 
}
}