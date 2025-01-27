package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_C(a: (T_A[CC_A],T_A[Char])) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C((_,CC_C(_))) => 1 
}
}
// This is not matched: CC_B()