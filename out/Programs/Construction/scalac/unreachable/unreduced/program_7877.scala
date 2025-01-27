package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_B[CC_A, CC_A]
case class CC_C[C](a: (T_B[CC_A, CC_A],T_B[Boolean, T_A])) extends T_B[CC_A, CC_A]
case class CC_D(a: CC_C[T_A], b: CC_A, c: CC_B) extends T_B[CC_A, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((CC_C(_),_)) => 1 
  case CC_C((CC_D(_, _, _),_)) => 2 
  case CC_D(_, _, _) => 3 
}
}
// This is not matched: CC_C((CC_B(_),_))