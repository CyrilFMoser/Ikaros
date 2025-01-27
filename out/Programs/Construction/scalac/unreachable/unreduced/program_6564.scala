package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: T_A[(T_B,T_B)]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}