package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Boolean,T_A[Boolean])]
case class CC_B(a: Boolean, b: T_A[CC_A], c: Int) extends T_A[(Boolean,T_A[Boolean])]
case class CC_C(a: CC_B) extends T_A[(Boolean,T_A[Boolean])]

val v_a: T_A[(Boolean,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
  case CC_C(CC_B(true, _, _)) => 3 
  case CC_C(CC_B(false, _, _)) => 4 
}
}