package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Byte],T_A[Boolean, Char])) extends T_A[(T_A[Char, Int],T_A[Int, Int]), C]
case class CC_B[E, F](a: T_A[E, Char]) extends T_A[(T_A[Char, Int],T_A[Int, Int]), E]
case class CC_C[G](a: Char, b: CC_A[G, G], c: Char) extends T_A[(T_A[Char, Int],T_A[Int, Int]), G]

val v_a: T_A[(T_A[Char, Int],T_A[Int, Int]), Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C(_, CC_A(_), _) => 2 
}
}