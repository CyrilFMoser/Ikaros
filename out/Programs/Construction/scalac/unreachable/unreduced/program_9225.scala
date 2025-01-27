package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[Char], b: (Boolean,T_A[CC_A])) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_B(CC_B(_, (_,_)), _) => 1 
}
}
// This is not matched: CC_A()