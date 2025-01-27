package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[(T_A[Byte],T_A[Char])]
case class CC_B(a: T_A[CC_A[Int]], b: T_A[CC_A[Boolean]], c: CC_A[CC_A[Boolean]]) extends T_A[(T_A[Byte],T_A[Char])]
case class CC_C() extends T_A[CC_B]

val v_a: T_A[(T_A[Byte],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}