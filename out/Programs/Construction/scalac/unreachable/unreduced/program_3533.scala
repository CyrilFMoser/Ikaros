package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Int]) extends T_A[(T_A[Char],T_A[Char])]
case class CC_B() extends T_A[(T_A[Char],T_A[Char])]
case class CC_C(a: CC_A, b: CC_B, c: (Byte,Byte)) extends T_A[(T_A[Char],T_A[Char])]

val v_a: T_A[(T_A[Char],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), CC_B(), (_,_)) => 2 
}
}