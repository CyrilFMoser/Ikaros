package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],T_B[Char])) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_B() extends T_A[(T_A[Byte],T_A[Char])]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: Boolean, b: D) extends T_B[D]

val v_a: T_A[(T_A[Byte],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_C())) => 0 
  case CC_A((_,CC_D(_, _))) => 1 
  case CC_B() => 2 
}
}