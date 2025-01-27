package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: ((T_A,Char),T_A), b: T_A, c: T_A) extends T_A
case class CC_B() extends T_B[Char]
case class CC_C(a: T_B[CC_B], b: Int) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, 12) => 1 
}
}
// This is not matched: CC_C(_, _)