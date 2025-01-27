package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: CC_A[E], c: Char) extends T_B[(T_A[Boolean],T_A[Int]), E]
case class CC_C[F]() extends T_B[(T_A[Boolean],T_A[Int]), F]
case class CC_D[G](a: CC_C[G], b: T_B[Char, G], c: (Char,T_B[Byte, Int])) extends T_B[(T_A[Boolean],T_A[Int]), G]

val v_a: T_B[(T_A[Boolean],T_A[Int]), Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), _) => 0 
  case CC_C() => 1 
  case CC_D(CC_C(), _, (_,_)) => 2 
}
}