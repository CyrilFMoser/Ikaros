package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F](a: (Byte,Char), b: T_B[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C() extends T_A[T_A[Boolean, CC_B[Int]], CC_B[Int]]
case class CC_D[G]() extends T_B[G, ((Int,Boolean),CC_C)]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((0,_), _) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A (Tuple Char Char))))