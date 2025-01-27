package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Char, Boolean], T_B[Char, Int]]]
case class CC_B(a: T_A[CC_A[Int], T_A[Int, Boolean]], b: (T_A[Char, Byte],CC_A[Byte]), c: (CC_A[Byte],T_B[(Byte,Int), Byte])) extends T_B[CC_A[CC_A[Int]], (T_A[Char, Int],CC_A[(Boolean,Boolean)])]
case class CC_C[G, F](a: T_B[F, F]) extends T_B[G, F]
case class CC_D(a: CC_A[Char]) extends T_B[CC_A[CC_A[Int]], (T_A[Char, Int],CC_A[(Boolean,Boolean)])]

val v_a: T_B[CC_A[CC_A[Int]], (T_A[Char, Int],CC_A[(Boolean,Boolean)])] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_A()), (CC_A(),CC_C(_))) => 0 
  case CC_C(_) => 1 
  case CC_D(_) => 2 
}
}