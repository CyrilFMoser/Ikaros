package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_A[Int, Int],T_B[(Boolean,Char), (Int,Boolean)]), E]
case class CC_B[F](a: T_A[F, Int], b: T_A[F, F]) extends T_A[(T_A[Int, Int],T_B[(Boolean,Char), (Int,Boolean)]), F]
case class CC_C[G, H](a: (T_B[(Boolean,Byte), Byte],Boolean), b: Byte) extends T_A[(T_A[Int, Int],T_B[(Boolean,Char), (Int,Boolean)]), G]
case class CC_D[I, J](a: T_A[J, J], b: Boolean) extends T_B[I, J]
case class CC_E[K](a: CC_C[K, K]) extends T_B[K, (CC_A[Int],Char)]

val v_a: T_A[(T_A[Int, Int],T_B[(Boolean,Char), (Int,Boolean)]), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C((_,_), _)