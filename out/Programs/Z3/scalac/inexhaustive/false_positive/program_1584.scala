package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_B,T_B)) extends T_A[Char]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C())) => 0 
}
}
// This is not matched: Pattern match is empty without constants