package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), C]
case class CC_B[D]() extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), D]
case class CC_C[E, F](a: (CC_A[Int],T_A[Boolean, Int]), b: (T_A[Byte, (Boolean,Boolean)],CC_A[Char])) extends T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), E]

val v_a: T_A[(T_A[Boolean, Byte],T_A[Char, Byte]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_, _),_), _) => 2 
}
}