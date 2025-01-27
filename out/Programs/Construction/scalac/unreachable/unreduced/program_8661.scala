package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_A[(Boolean,Byte), E]) extends T_A[(Boolean,T_A[Char, Byte]), E]
case class CC_B[F]() extends T_A[(Boolean,T_A[Char, Byte]), F]
case class CC_C[G](a: Int) extends T_A[(Boolean,T_A[Char, Byte]), G]
case class CC_D(a: CC_B[Byte], b: CC_B[Int]) extends T_B[Int, (CC_B[Char],CC_B[Int])]

val v_a: T_A[(Boolean,T_A[Char, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}