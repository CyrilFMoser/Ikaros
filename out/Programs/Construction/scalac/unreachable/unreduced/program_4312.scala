package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: ((Char,Byte),T_A[Char]), c: T_A[Int]) extends T_A[(T_A[Char],T_A[Char])]
case class CC_B() extends T_A[(T_A[Char],T_A[Char])]
case class CC_C(a: CC_A, b: (T_A[Int],CC_B), c: (CC_B,CC_A)) extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}