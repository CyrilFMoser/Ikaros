package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Boolean)], b: T_A[(Boolean,Boolean)], c: T_A[(Boolean,Boolean)]) extends T_A[(Boolean,Boolean)]
case class CC_B(a: Boolean, b: T_A[(Boolean,Boolean)], c: Int) extends T_A[(Boolean,Boolean)]
case class CC_C(a: T_A[CC_B], b: CC_B, c: CC_B) extends T_A[(Boolean,Boolean)]

val v_a: T_A[(Boolean,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, _, CC_B(_, _, _)), _) => 1 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
  case CC_A(_, CC_C(_, _, _), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(_, _, _) => 6 
}
}