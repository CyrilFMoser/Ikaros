package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[(T_A[(Char,Char)],T_A[Char])]
case class CC_B() extends T_A[(T_A[(Char,Char)],T_A[Char])]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[(T_A[(Char,Char)],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}