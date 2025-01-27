package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Byte]]) extends T_A[(((Char,Char),Int),T_A[Char])]
case class CC_B() extends T_A[(((Char,Char),Int),T_A[Char])]
case class CC_C(a: CC_B, b: T_A[Int]) extends T_A[(((Char,Char),Int),T_A[Char])]

val v_a: T_A[(((Char,Char),Int),T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
}
}
// This is not matched: CC_A(_, _)