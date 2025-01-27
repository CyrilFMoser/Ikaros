package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Byte]], c: Char) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_B() extends T_A[(T_A[Byte],T_A[Char])]
case class CC_C() extends T_A[(T_A[Byte],T_A[Char])]

val v_a: T_A[(T_A[Byte],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}